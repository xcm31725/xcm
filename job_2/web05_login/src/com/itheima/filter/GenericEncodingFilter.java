package com.itheima.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class GenericEncodingFilter implements Filter {

	@Override
	public void destroy() {
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//在过滤器中增强request对象，并将增强后的request对象传递给Servlet
		HttpServletRequest req = (HttpServletRequest) request;
		//增强req:
		MyHttpServletRequest mReq = (MyHttpServletRequest) req;
		chain.doFilter(mReq, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
