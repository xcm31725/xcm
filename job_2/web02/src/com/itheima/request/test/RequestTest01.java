package com.itheima.request.test;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestTest01
 */
public class RequestTest01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String[] hobby = request.getParameterValues("hobby");
		String city = request.getParameter("city");
		String info = request.getParameter("info");
		System.out.println("�û�����"+username);
		System.out.println("���룺"+password);
		System.out.println("�Ա�"+sex);
		System.out.println("���ã�"+Arrays.toString(hobby));
		System.out.println("���᣺"+city);
		System.out.println("���˼�飺"+info);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
