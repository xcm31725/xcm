package com.itheima.encoding.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns="/*")
public class GenericEncodingFilter implements Filter{

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		final HttpServletRequest req = (HttpServletRequest) request;
		//��ǿreq:
		HttpServletRequest myReq = (HttpServletRequest) Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// �ж�ִ�еķ����Ƿ���getParameter:
				if("getParameter".equals(method.getName())) {
					// ���õ���getParameter:��Ҫ��ǿ�������.
					// �ж�����ʽ��GET����POST:
					String type = req.getMethod();
					if("GET".equalsIgnoreCase(type)) {
						String value = (String)method.invoke(req, args);
						value = new String(value.getBytes("ISO-8859-1"),"utf-8"); 
						return value;
					} else if("POST".equalsIgnoreCase(type)) {
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
