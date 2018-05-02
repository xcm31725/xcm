package com.itheima.servlet.demo1;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletConfig对象的API的演示
 */
public class ServletDemo1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获得初始化参数的API
		//获得Servlet对象
		ServletConfig servletConfig = this.getServletConfig();
		String username = servletConfig.getInitParameter("username");
		String password = servletConfig.getInitParameter("password");
		System.out.println(username + "   " + password);
		//2.获得Servlet的名称
		String servletName = servletConfig.getServletName();
		System.out.println(servletName);
		//3.获得所有初始化参数的名称
		Enumeration<String> names = servletConfig.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = servletConfig.getInitParameter(name);
			System.out.println(name + "   " + value);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
