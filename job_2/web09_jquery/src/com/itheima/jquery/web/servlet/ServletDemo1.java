package com.itheima.jquery.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * AJAX的入门的Servlet
 */
public class ServletDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Hello...");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("Hello AJAX GET... 名称是："+name+" 密码是："+pass);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("Hello AJAX GET... 名称是："+name+" 密码是："+pass);
	
	}

}
