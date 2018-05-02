package cn.itheima.utils;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSONObject;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import cn.itheima.domain.Result;

public class LoginInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation ai) throws Exception {
		// 得到session中的user
		Object user = ServletActionContext.getRequest().getSession().getAttribute("user");
		if (user != null) {
			return ai.invoke();
		} else {
			Result result = new Result();
			result.setType(0);
			result.setMessage("权限不足");
			String json = JSONObject.toJSONString(result);
			ServletActionContext.getResponse().setCharacterEncoding("utf-8");
			ServletActionContext.getResponse().getWriter().write(json);
			return null;
		}
	}

}
