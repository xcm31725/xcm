package cn.itcast.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

import cn.itcast.domain.User;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements ServletRequestAware, ModelDriven<User>{
	
	private HttpServletRequest request;
	
	private User user = new User();
	
	@Override
	public User getModel() {
		return user;
	}
	
	public String login() {
		//获得request对象
		
		//HttpServletRequest request = ServletActionContext.getRequest();
		
		//String username = request.getParameter("username");
		//String password = request.getParameter("password");
		
		System.out.println(user.getUsername()+"         "+user.getPassword());
		
		if("xcm".equals(user.getUsername()) && "317".equals(user.getPassword())) {
			request.getSession().setAttribute("user", user);
			
			return "success";
		}else {
			//ValueStack vs = ActionContext.getContext().getValueStack();
			//vs.set("loginMsg", "用户名或密码错误！");
			this.addActionError("用户名或密码错误！");
			
			return "failer";
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	
	
}
