package com.itheima.servlet.demo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * web��Ŀ�еĶ�ȡ�ļ�
 */
public class ServletDemo5 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test1();
		//test2();
		test3();
	}
	/**
	 * ��ȡweb��Ŀ�µ��ļ���ʹ��ServletContext��ȡ
	 */
	private void test3() throws IOException {
		//ʹ��ServletContext��ʽ��
		Properties properties = new Properties();
		//����һ���ļ�����������
		//InputStream is = new FileInputStream("src/db.properties");
		//InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/db.properties");
		InputStream is = new FileInputStream(path);
		System.out.println(path);
		properties.load(is);
		//��ȡ����
		String driverClassName = properties.getProperty("driverClassName");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		//���������̨
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	
	/**
	 * ��ȡweb��Ŀ�µ��ļ���ʹ��ServletContext��ȡ
	 */
	private void test2() throws IOException {
		//ʹ��ServletContext��ʽ��
		Properties properties = new Properties();
		//����һ���ļ�����������
		//InputStream is = new FileInputStream("src/db.properties");
		InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
		properties.load(is);
		//��ȡ����
		String driverClassName = properties.getProperty("driverClassName");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		//���������̨
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	
	/**
	 * ��ͳ��ʽ��ȡ�ļ�
	 */
	private void test1() throws IOException {
		Properties properties = new Properties();
		InputStream is = this.getServletContext().getResourceAsStream("src/db.properties");
		properties.load(is);
		//��ȡ����
		String driverClassName = properties.getProperty("dirverClassName");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		//���������̨
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
