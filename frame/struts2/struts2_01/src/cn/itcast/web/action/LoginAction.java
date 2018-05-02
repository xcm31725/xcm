package cn.itcast.web.action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() {
		//System.out.println(username+"   "+password);
		if("xcm".equals(username)&&"317".equals(password)) {
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
