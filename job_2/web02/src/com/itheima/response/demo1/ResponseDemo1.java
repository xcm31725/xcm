package com.itheima.response.demo1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ������Ӧ״̬��
 */
public class ResponseDemo1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������Ӧ״̬��
		//response.setStatus(404);
		//����ض���
		//response.setStatus(302);
		//������Ӧͷ
		//response.setHeader("Location", "/web02/ResponseDemo1");
		
		//��ʱˢ��
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("5���ҳ����ת");
		response.setHeader("Refresh", "5;url=/web02/ResponseDemo1");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
