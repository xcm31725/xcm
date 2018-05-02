package com.itheima.store.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.itheima.store.domain.User;

/**
 * Servlet Filter implementation class PrivilegeFilter
 */
public class PrivilegeFilter implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {
	}
	

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		User existUser = (User) req.getSession().getAttribute("existUser");
		
		if(existUser == null) {
			req.setAttribute("msg", "您还没有登录！没权限访问，请先去登录！");
			req.getRequestDispatcher("/jsp/msg.jsp").forward(req, response);
			return;
		}
		
		chain.doFilter(request, response);
	}

	public void destroy() {
	}

}
