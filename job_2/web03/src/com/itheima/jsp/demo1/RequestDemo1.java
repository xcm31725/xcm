package com.itheima.jsp.demo1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ҳ����ת�Ĳ��Ե�Servlet
 */
public class RequestDemo1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.����ת���ķ�ʽ
		/*RequestDispatcher dispatcher = request.getRequestDispatcher("/demo1/demo1.jsp");
		dispatcher.forward(request, response);*/
		//request.getRequestDispatcher("/Demo1/demo1.jsp").forward(request, response);
		
		//request.setAttribute("name","XCM");
		//2.�ض���ķ�ʽ
		response.sendRedirect("/web03/Demo1/demo1.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
