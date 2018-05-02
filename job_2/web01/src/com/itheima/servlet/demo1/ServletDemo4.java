package com.itheima.servlet.demo1;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo4
 */
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.��ȡ�ļ�MIME������
		//���ServletContext
		ServletContext servletContext = this.getServletContext();
		String mimeType = servletContext.getMimeType("aa.txt");
		System.out.println(mimeType);
		//2.�������·���Ĺ�������
		String contextPath = servletContext.getContextPath();
		System.out.println(contextPath);
		//3.���ȫ�ֳ�ʼ������
		String username = servletContext.getInitParameter("username");
		String password = servletContext.getInitParameter("password");
		System.out.println(username + "    " + password);
		Enumeration<String> names = servletContext.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = servletContext.getInitParameter(name);
			System.out.println(name + "   " + value);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
