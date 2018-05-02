package com.itheima.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDemo2 {

	@Test
	public void demo() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//获得链接
			conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root", "root");
			//执行SQL
			//获得执行SQL对象
			stmt = conn.createStatement();
			//编写SQL语句
			String sql = "select * from user";
			//执行SQL语句
			rs = stmt.executeQuery(sql);
			//遍历结果集
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("username") + " " + rs.getString("password") + " " + rs.getString("nickname") + " " + rs.getInt("age"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//释放资源
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
				conn = null;
			}
		}
		
		
	}
}
