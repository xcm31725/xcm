package com.itheima.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �˳�
 */
public class LogoutServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//����session
		request.getSession().invalidate();
		//����cookie
//		Cookie c = new Cookie("remember", "remember");
//		c.setMaxAge(0);
//		c.setPath("/web02_login");
		//ҳ����ת �ض���
		response.sendRedirect("/web02_login/success.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
