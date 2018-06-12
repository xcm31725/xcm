package cn.itcast.bos.web.action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.apache.commons.io.FileUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.itcast.bos.constant.Constants;
import cn.itcast.bos.domain.page.PageBean;
import cn.itcast.bos.domain.take_delivery.Promotion;
import freemarker.template.Configuration;
import freemarker.template.Template;
					 
@SuppressWarnings("all")
@ParentPackage("json-default")
@Namespace("/")
@Controller
@Scope("prototype")
public class PromotionAction extends BaseAction<Promotion> {

	@Action(value="promotion_pageQuery", results={@Result(name="success",type="json")})
	public String pageQuery() {
		//基于webService 获取bos_management的 活动列表 数据信息
		PageBean<Promotion> pageBean = WebClient.create(Constants.BOS_MANAGEMENT_HOST+"/bos_management/services/promotionService/pageQuery?page="
						+ page + "&rows=" + 4).accept(MediaType.APPLICATION_JSON).get(PageBean.class);
		
		ActionContext.getContext().getValueStack().push(pageBean);
		return SUCCESS;
	}
	
	@Action(value="promotion_showDetail")
	public String showDetail() throws Exception {
		//判断id对应的HTML是否存在，如果存在直接返回
		String htmlRealPath = ServletActionContext.getServletContext().getRealPath("/freemaker");
		File htmlFile = new File(htmlRealPath + "/" + model.getId() + ".html");
		
		//如果不存文件 在查询数据库，结合freemaker模板生成页面
		if(!htmlFile.exists()) {
			//配置对象，配置模板类型
			Configuration configuration = new Configuration(Configuration.VERSION_2_3_22);
			
			configuration.setDirectoryForTemplateLoading(
					new File(ServletActionContext.getServletContext().getRealPath("/WEB-INF/freemarker_templates")));
			
			//获取模板对象
			Template template = configuration.getTemplate("promotion_detail.ftl");
			
			//动态数据对象
			Promotion promotion = WebClient.create(Constants.BOS_MANAGEMENT_HOST+"/bos_management/services/promotionService/promotion/"
					+ model.getId()).accept(MediaType.APPLICATION_JSON).get(Promotion.class);
			
			Map<String , Object> map = new HashMap<String, Object>();
			map.put("promotion", promotion);
			
			//合并输出
			template.process(map, new OutputStreamWriter(new FileOutputStream(htmlFile), "utf-8"));
		}
		
		//存在，直接见文件返回
		ServletActionContext.getResponse().setContentType("test/htnl;charset=utf-8");
		FileUtils.copyFile(htmlFile, ServletActionContext.getResponse().getOutputStream());
		
		return NONE;
	}
}
