package cn.itcast.web.action;

import com.opensymphony.xwork2.Action;

import cn.itcast.domain.User;

public class LoginAction1 implements Action{
	
	private User user;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
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
