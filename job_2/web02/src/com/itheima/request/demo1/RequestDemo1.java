package com.itheima.request.demo1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Request�����ȡ�ͻ�����Ϣ
 */
public class RequestDemo1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�������ʽ
		System.out.println("�������ʽ��" + request.getMethod());
		//��ÿͻ�����IP
		System.out.println("�ͻ�����IP��" + request.getRemoteAddr());
		//�������������ַ���
		System.out.println("����������ַ�����" + request.getQueryString());
		//�������·����URL��URI
		System.out.println("����·��URL��" + request.getRequestURL());
		System.out.println("����·��URI��" + request.getRequestURI());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
