package com.itheima.encoding.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class GenericEncodingFilter1 implements Filter{

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		final HttpServletRequest req = (HttpServletRequest) request;
		HttpServletRequest myReq = (HttpServletRequest) Proxy.newProxyInstance(this.getClass().getClassLoader(), this.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable {
				if("getParameter".equals(method.getName())) {
					String type = req.getMethod();
					if("GET".equalsIgnoreCase(type)) {
						String value = (String) method.invoke(req, args);
						value = new String(value.getBytes("ISO-8859-1"),"utf-8");
						if(value != null) {
							return value;
						}
					}else if("POST".equalsIgnoreCase(type)) {
						req.setCharacterEncoding("utf-8");
					}
				}
				
				return method.invoke(req, args);
			}
		});
		chain.doFilter(myReq, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
