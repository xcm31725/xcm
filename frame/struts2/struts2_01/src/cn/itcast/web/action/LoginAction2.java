package cn.itcast.web.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.domain.User;

public class LoginAction2 implements Action,ModelDriven<User>{
	
	private User user = new User();
	
	
	@Override
	public User getModel() {
		return user;
	}
	
	public String login() {
		System.out.println(user.getUsername()+"   "+user.getPassword());
		
		if("xcm".equals(user.getUsername()) && "317".equals(user.getPassword())) {
			return "success";
		}else {
			return "failer";
		}
		
	}
	@Override
	public String execute() throws Exception {
		return null;
	}
	
	
}
