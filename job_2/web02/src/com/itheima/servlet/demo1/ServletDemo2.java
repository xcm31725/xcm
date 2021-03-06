package com.itheima.servlet.demo1;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo2
 */
public class ServletDemo2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取文件MIME的类型
		//获得ServletContext
		ServletContext servletContext = this.getServletContext();
		String mimeType = servletContext.getMimeType("aa.txt");
		System.out.println(mimeType);
		//2.获得	请求路径的工程名
		String contextPath = servletContext.getContextPath();
		System.out.println(contextPath);
		//3.获得全局初始化参数
		String username = servletContext.getInitParameter("username");
		String password = servletContext.getInitParameter("password");
		System.out.println(username + "  " + password);
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
