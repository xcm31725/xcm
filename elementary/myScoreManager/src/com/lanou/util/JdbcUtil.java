package com.lanou.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


/**
 * 封装了jdbc操作的工具类
 */
public class JdbcUtil {
	/**封装一个方法用于获取连接对象*/
	public static Connection getConnection(){
		try {
			//读取jdbc.properties配置文件,读取到的键值对封装到properties集合对象中
			Properties pro = new Properties();
			InputStream in = JdbcUtil.class.getClassLoader()
					.getResourceAsStream("jdbc.properties");
			pro.load(in);
			//构建Connection连接对象
			String driver = pro.getProperty("driver");
			String url = pro.getProperty("url");
			String username = pro.getProperty("username");
			String password = pro.getProperty("password");
			
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("conn:"+conn);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		getConnection();
	}
}