package com.itheima.request.test1;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * request���������վ�
 */
public class RequestTest2 extends HttpServlet {
	/**
	 * ��ʾget��ʽ������������
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * ���������ԭ��
		 * *get��ʽ�ύ�������������е�URL���棬�ڵ�ַ������ʵ���Ѿ�������һ��URL�ı����ˡ�
		 * ���������
		 * *�����뵽request�������е�ֵ��ISO-8859-1�ķ�ʽ��ȡ������utf-8�ķ�ʽ���б��롣
		 */
		String name = request.getParameter("name");
		String encode = URLEncoder.encode(name, "ISO-8859-1");
		String decode = URLDecoder.decode(encode, "utf-8");
		//String value = new String(name.getBytes("ISO-8859-1"),"UTF-8");
		System.out.println(name);
	}
	/**
	 * ��ʾpost��ʽ������������
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * ���������ԭ��
		 * *post��ʽ�ύ�����������������У�request������յ�����֮�󣬷���request�Ļ����������������б��루Ĭ��ISO-8859-1����֧�����ģ���
		 * �������
		 * *��request�Ļ������ı����޸��˼���
		 */
		//���û������ı���
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		System.out.println("������"+name);
	}

}
