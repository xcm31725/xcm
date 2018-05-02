package com.itheima.filter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyHttpServletRequest extends HttpServletRequestWrapper {
	
	private HttpServletRequest request;
	
	public MyHttpServletRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}

	@Override
	//增强request.getParameter()方法
	public String getParameter(String name) {
		//获得请求方式
		String method = request.getMethod();
		//根据get还是post请求进行不同方式的乱码的处理
		if("GET".equalsIgnoreCase(method)) {
			String value = super.getParameter(name);
			try {
				value = new String(value.getBytes("ISO-8859-1"),"utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return value;
		}else if("POST".equalsIgnoreCase(method)) {
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return super.getParameter(name);
	}
	
	
	

}
