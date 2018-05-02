package com.itheima.response.demo1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseDemo2
 */
public class ResponseDemo2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//使用字节流的方式输入中文
		//ServletOutputStream outputStream = response.getOutputStream();
		//outputStream.write("中文".getBytes());
		
		//使用字节流的方式输入中文
		//ServletOutputStream outputStream = response.getOutputStream();
		//设置浏览器默认打开时候采用的编码集
		//response.setHeader("Content-Type", "text/html;charset=utf-8");
		//设置中文转换字符数组字符集编码
		//outputStream.write("中文".getBytes("utf-8"));
		
		//设置浏览器默认打开时候采用的编码集
		//response.setHeader("Content-type", "text/html;charset=utf-8");
		//设置response获得字符流缓冲区的编码
		//response.setCharacterEncoding("utf-8");
		
		//response.getWriter().println("中文");
		
		//代码简化
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("中文");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
