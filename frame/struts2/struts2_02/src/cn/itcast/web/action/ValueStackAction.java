package cn.itcast.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

import cn.itcast.domain.User;
@SuppressWarnings("all")
public class ValueStackAction extends ActionSupport implements ModelDriven{
	private User user = new User();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		return user;
	}
	/*private String username = "fox";
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getPwd() {
		return "123";
	}*/
	
	@Override
	public String execute() throws Exception {
		user = new User();
		user.setUsername("xcm");
		user.setPassword("317");
		
		//通过request对象获得ValueStack
		//HttpServletRequest request = ServletActionContext.getRequest();
		//ValueStack vs1 = (ValueStack) request.getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
		
		//通过ActionContext获得ValueStack
		//ValueStack stack = ActionContext.getContext().getValueStack();
		
		//stack.push("xgd");//在root中存
		//stack.set("name", "xcm");//也在root中存，但底层创建HashMap，在将其存到root中
		//stack.push("asda");
		return "success";
	}

	
}
