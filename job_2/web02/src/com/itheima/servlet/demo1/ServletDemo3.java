package com.itheima.servlet.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo3
 */
public class ServletDemo3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test1();
		//test2();
		test3();
	}
	
	/**
	 * 读取web项目下的文件，使用Servlet读取
	 */
	private void test3() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		//InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/db.properties");
		InputStream is = new FileInputStream(path);
		properties.load(is);
		
		String driverClassName = properties.getProperty("driverClassName");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	
	/**
	 * 读取web项目下的文件，使用Servlet读取
	 */
	private void test2() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		//InputStream is = new FileInputStream("src/dbproperties");
		InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
		properties.load(is);
		
		String driverClassName = properties.getProperty("driverClassName");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	
	/**
	 * 传统方式
	 */
	private void test1() throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		InputStream is = new FileInputStream("src/dbproperties");
		properties.load(is);
		
		String driverClassName = properties.getProperty("driverClassName");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
