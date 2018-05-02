package com.itheima.request.demo1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Request对象获取客户机信息
 */
public class RequestDemo1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得请求方式
		System.out.println("获得请求方式：" + request.getMethod());
		//获得客户机的IP
		System.out.println("客户机的IP：" + request.getRemoteAddr());
		//获得请求参数的字符串
		System.out.println("请求参数的字符串：" + request.getQueryString());
		//获得请求路径的URL和URI
		System.out.println("请求路径URL：" + request.getRequestURL());
		System.out.println("请求路径URI：" + request.getRequestURI());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
