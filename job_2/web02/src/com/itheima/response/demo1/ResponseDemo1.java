package com.itheima.response.demo1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 设置相应状态码
 */
public class ResponseDemo1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置相应状态码
		//response.setStatus(404);
		//完成重定向
		//response.setStatus(302);
		//设置响应头
		//response.setHeader("Location", "/web02/ResponseDemo1");
		
		//定时刷新
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("5秒后页面跳转");
		response.setHeader("Refresh", "5;url=/web02/ResponseDemo1");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
