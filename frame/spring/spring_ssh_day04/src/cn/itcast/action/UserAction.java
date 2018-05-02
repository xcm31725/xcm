package cn.itcast.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.domain.User;
import cn.itcast.service.IUserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	
	private IUserService userService;
	
	/*public void setUserService(IUserService userService) {
		this.userService = userService;
	}*/
	
	public void setUs(IUserService userService) {
		this.userService = userService;
	}
	@Override
	public User getModel() {
		return user;
	}

	public String add() {
		userService.add(user);
		return SUCCESS;
	}
}

