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
		
		System.out.println("�û�����" + username);
		System.out.println("���룺" + password);
		System.out.println("�Ա�" + sex);
		System.out.println("���᣺" + city);
		System.out.println("���ã�" + hobby);
		System.out.println("���ҽ��ܣ�" + info);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
