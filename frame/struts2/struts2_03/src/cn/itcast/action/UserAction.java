package cn.itcast.action;

import org.apache.struts2.ServletActionContext;
import org.codehaus.jackson.map.ObjectMapper;

import cn.itcast.domain.Regist;

public class UserAction {
	public void checkUname(){
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		
		//接收请求
		String uname = ServletActionContext.getRequest().getParameter("uname");
		
		//判断请求参数书否存在
		//根据判断把数据相应给json
		Regist r = new Regist();
		if("xcm".equals(uname)) {
			//不可用
			r.setFlag(false);
			r.setMessage("用户名已经存在");
		}else {
			//可用
			r.setFlag(true);
			r.setMessage("用户名可以使用");
		}
		
		ObjectMapper om = new ObjectMapper();
		try {
			String x = om.writeValueAsString(r);
			ServletActionContext.getResponse().getWriter().println(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
