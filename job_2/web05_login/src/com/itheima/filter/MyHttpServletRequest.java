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
	//��ǿrequest.getParameter()����
	public String getParameter(String name) {
		//�������ʽ
		String method = request.getMethod();
		//����get����post������в�ͬ��ʽ������Ĵ���
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
