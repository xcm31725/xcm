package cn.itcast.utils;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import cn.itcast.domain.User;
import cn.itcast.web.action.ProductAction;

/*@SuppressWarnings("serial")
public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//得到session中是否存在user
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user != null) {
			return invocation.invoke();
		} else {
			ProductAction pa = (ProductAction) invocation.getAction();
			pa.addActionError("你的权限不足！");
			return "login";
		}
	}

}*/

@SuppressWarnings("serial")
public class MyInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		System.out.println("invocation...");
		
		//得到session中是否存在user
				User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user != null) {
			return invocation.invoke();
		} else {
			ProductAction pa = (ProductAction) invocation.getAction();
			pa.addActionError("你的权限不足！");
			return "login";
		}
	}
	
}