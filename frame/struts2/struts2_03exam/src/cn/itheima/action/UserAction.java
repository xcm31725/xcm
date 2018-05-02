package cn.itheima.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.domain.User;
import cn.itheima.service.IUserService;
import cn.itheima.service.UserServiceImpl;

@Namespace("/")
@ParentPackage("struts-default")
public class UserAction extends ActionSupport implements ModelDriven<User> {

	private User user = new User();

	@Override
	public User getModel() {
		return user;
	}

	@Action(value = "user_login", results = { @Result(name = "success", location = "/product.jsp"),
			@Result(name = "error", location = "/login.jsp") })
	public String login() {

		// 调用service完成操作
		IUserService userService = new UserServiceImpl();
		User _user = userService.login(user.getUsername(), user.getPassword());
		if (_user != null) {
			// 将用户存储到session中
			ServletActionContext.getRequest().getSession().setAttribute("user", _user);
			return "success";
		} else {
			this.addActionError("用户名或密码错误");
			return "error";
		}
	}
}
