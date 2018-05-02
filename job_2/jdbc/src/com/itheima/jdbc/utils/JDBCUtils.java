package com.itheima.jdbc.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
	private static final String driverClassName;
	private static final String url;
	private static final String username;
	private static final String password;
	
	static{
		//获取属性文件中的内容
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/db.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*driverClassName = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql:///web_test3";
		username = "root";
		password = "root";*/
		driverClassName = properties.getProperty("driverClassName");
		url = properties.getProperty("url");
		username = properties.getProperty("username");
		password = properties.getProperty("password");
	}
	
	/**
	 * 注册驱动的方法
	 */
	public static void loadDriver() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 链接驱动的方法
	 */
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//将驱动一并注册
			loadDriver();
			//获得链接
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	/**
	 * 释放资源
	 */
	public static void release(Statement stmt,Connection conn) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt = null;
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn= null;
		}
	}
	public static void release(ResultSet rs,Statement stmt,Connection conn) {
		
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt = null;
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn= null;
		}
	}
	
}
