package com.itheima.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ʼ����Servlet
 * * �����Servlet���ó�����ʱ����
 */
public class InitServlet extends HttpServlet {
	@Override
	/**
	 * ��ʼ���ķ�����
	 */
	public void init() throws ServletException {
		//��ʼһ��ֵ0
		int count = 0;
		//�����ֵ���뵽ServletContext����
		this.getServletContext().setAttribute("count", count);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
