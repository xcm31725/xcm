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
		//ʹ���ֽ����ķ�ʽ��������
		//ServletOutputStream outputStream = response.getOutputStream();
		//outputStream.write("����".getBytes());
		
		//ʹ���ֽ����ķ�ʽ��������
		//ServletOutputStream outputStream = response.getOutputStream();
		//���������Ĭ�ϴ�ʱ����õı��뼯
		//response.setHeader("Content-Type", "text/html;charset=utf-8");
		//��������ת���ַ������ַ�������
		//outputStream.write("����".getBytes("utf-8"));
		
		//���������Ĭ�ϴ�ʱ����õı��뼯
		//response.setHeader("Content-type", "text/html;charset=utf-8");
		//����response����ַ����������ı���
		//response.setCharacterEncoding("utf-8");
		
		//response.getWriter().println("����");
		
		//�����
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("����");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
