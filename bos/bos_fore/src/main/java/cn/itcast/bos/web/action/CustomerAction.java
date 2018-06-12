package cn.itcast.bos.web.action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;

import cn.itcast.bos.constant.Constants;
import cn.itcast.bos.utils.MailQQUtils;
import cn.itcast.bos.utils.SendSmsUtlis;
import cn.itcast.bos.utils.SinaMailUtils;
import cn.itcast.crm.domain.Customer;

@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class CustomerAction extends BaseAction<Customer> {
	
	@Autowired
	@Qualifier("jmsQueueTemplate")
	private JmsTemplate jmsTemplate;

	@Action(value = "customer_sendSms")
	public String sendSms() throws IOException {
		// 手机号保存在Customer对象
		// 生成短信验证码
		String randomCode = RandomStringUtils.randomNumeric(4);
		// 将短信验证码 保存到session
		ServletActionContext.getRequest().getSession()
				.setAttribute(model.getTelephone(), randomCode);

		System.out.println("生成手机验证码为：" + randomCode);
		// 编辑短信内容
		final String msg = "尊敬的用户您好，本次获取的验证码为：" + randomCode
				+ ",服务电话：4006184000";

		// 调用MQ服务，发送一条消息
		jmsTemplate.send("bos_sms", new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				MapMessage mapMessage = session.createMapMessage();
				mapMessage.setString("telephone", model.getTelephone());
				mapMessage.setString("msg", msg);
				return mapMessage;
			}
		});
		return NONE;

	}
	
	//属性驱动
	private String checkcode;

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}


	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	public void setRedisTemplate(RedisTemplate<String, String> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	/**
	 * @return
	 * @throws Exception 
	 */
	@Action(value="customer_regist", results={
			@Result(name="success",type="redirect",location="signup-success.html"),
			@Result(name="input",type="redirect",location="signup.html"),
	})
	public String regist() throws Exception {
		//先验证验证码是否相同，不同回到注册页面
		//获得session中的验证码
		String checkCodeSession = (String) ServletActionContext.getRequest().getSession().getAttribute(model.getTelephone());
		//System.out.println("Session："+checkCodeSession);
		//System.out.println("页面："+checkcode);
		if(checkCodeSession == null || !checkCodeSession.equals(checkcode)) {
			System.out.println("短信验证码错误...");
			//验证失败
			
			return INPUT;
		}
		//调用WebService 链接CRM 保存客户信息
		WebClient.create("http://localhost:8088/crm_management/services"+"/customerService/customer")
						.type(MediaType.APPLICATION_JSON).put(model);
		System.out.println("客户注册成功...");
		
		//发送一封邮件
		//生成激活码
		String activecode = RandomStringUtils.randomNumeric(32);
		
		//将激活码保存到Redis， 设置成24小时失效
		redisTemplate.opsForValue().set(model.getTelephone(), activecode, 24, TimeUnit.HOURS);
		
		//调用MailQQUtils发送激活邮件
		String content1 = "尊敬的客户您好，请于24小时内进行邮箱账户的绑定，点击下面地址完成绑定：<br/><a href='"
						+ MailQQUtils.activeUrl + "?telephone=" + model.getTelephone()
						+ "&activecode=" + activecode + "'>速运快递邮箱绑定地址</a>";
		String content = "尊敬的客户您好，请于24小时内，进行邮箱账户的绑定，点击下面地址完成绑定:<br/><a href='"
						+ MailQQUtils.activeUrl + "?telephone=" + model.getTelephone()
						+ "&activecode=" + activecode + "'>速运快递邮箱绑定地址</a>";
		SinaMailUtils.email("xcm31725@qq.com" , content);
		//MailQQUtils.sendQQMail("速运快递激活邮箱", content, "xcm31725@qq.com");
		
		return SUCCESS;
	}
	
	private String activecode;
	
	public void setActivecode(String activecode) {
		this.activecode = activecode;
	}

	@Action(value="customer_activeMail")
	public String activeMail() throws IOException {
		//修改编码
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		
		//判断激活码是否有效
		String activecodeRedis = redisTemplate.opsForValue().get(model.getTelephone());
		
		if(activecodeRedis == null || !activecodeRedis.equals(activecodeRedis)) {
			//激活无效
			ServletActionContext.getResponse().getWriter().println("激活码无效，请登录系统，重新绑定邮箱！");
		} else {
			//激活码有效
			//防止重复调用
			//调用CRM WebService 查询客户信息，判断是否已经绑定
			Customer customer = WebClient.create("http://localhost:8088/crm_management/services"+"/customerService/customer/telephone/"
							+ model.getTelephone()).accept(MediaType.APPLICATION_JSON).get(Customer.class);
			if(customer.getType() == null || customer.getType() != 1) {
				 //没有绑定，进行绑定
				 WebClient.create("http://localhost:8088/crm_management/services"+"/customerService/customer/updateType/"
							+ model.getTelephone()).get();
				 ServletActionContext.getResponse().getWriter().println("邮箱绑定成功！");
			} else {
				//已经绑定过
				ServletActionContext.getResponse().getWriter().println("邮箱已经绑定过，无需重复绑定！");
			}
			//删除redis的激活码
			redisTemplate.delete(model.getTelephone());
		}
		
		return NONE;
	}
	
	//登录
	@Action(value="customer_login", results={@Result(name="login", type="redirect", location="login.html"),
			@Result(name="success", type="redirect", location="index.html#/myhome")})
	public String login() {
		Customer customer = WebClient.create(Constants.CRM_MANAGEMENT_URL+"/services/customerService/customer/login?telephone="
						+model.getTelephone()+"&password="+model.getPassword())
						.accept(MediaType.APPLICATION_JSON).get(Customer.class);
		if(customer == null) {
			//登录失败
			return LOGIN;
		} else {
			//登录成功
			ServletActionContext.getRequest().getSession().setAttribute("customer", customer);
			return SUCCESS;
		}
	}
}















