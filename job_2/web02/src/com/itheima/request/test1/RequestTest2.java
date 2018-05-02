package com.itheima.request.test1;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request接收中文收据
 */
public class RequestTest2 extends HttpServlet {
	/**
	 * 表示get方式处理中文乱码
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 产生乱码的原因
		 * *get方式提交的数据在请求行的URL后面，在地址栏上其实就已经进行了一次URL的编码了。
		 * 解决方案：
		 * *将存入到request缓冲区中的值以ISO-8859-1的方式获取到，以utf-8的方式进行编码。
		 */
		String name = request.getParameter("name");
		String encode = URLEncoder.encode(name, "ISO-8859-1");
		String decode = URLDecoder.decode(encode, "utf-8");
		//String value = new String(name.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(name);
	}
	/**
	 * 表示post方式处理中文乱码
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 产生乱码的原因
		 * *post方式提交的数据是在请求体中，request对象接收到数据之后，放入request的缓冲区，缓冲区就有编码（默认ISO-8859-1：不支持中文），
		 * 解决方案
		 * *将request的缓冲区的编码修改了即可
		 */
		//设置缓冲区的编码
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		System.out.println("姓名："+name);
	}

}
