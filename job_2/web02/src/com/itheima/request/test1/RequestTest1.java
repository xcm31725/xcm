package com.itheima.request.test1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTest1
 */
public class RequestTest1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String city = request.getParameter("city");
		String[] hobby = request.getParameterValues("hobby");
		String info = request.getParameter("info");
		
		System.out.println("用户名：" + username);
		System.out.println("密码：" + password);
		System.out.println("性别：" + sex);
		System.out.println("籍贯：" + city);
		System.out.println("爱好：" + hobby);
		System.out.println("自我介绍：" + info);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
