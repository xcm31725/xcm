package com.itheima.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitServlet
 */
public class InitServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		//定义初始化值
		int count = 0;
		//将值存入ServletContext域中
		this.getServletContext().setAttribute("count", count);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
