package com.itheima.jdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDemo1 {
	@Test
	public void demo1(){
		
		Connection conn = null;
		
		Statement statement = null;
		
		ResultSet rs = null;
		try {
			//1.��������
			Class.forName("com.mysql.jdbc.Driver");
			//2.�������
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_test3", "root", "root");
			//3.ִ��SQL���
			//3.1���ִ��SQL������
			statement = conn.createStatement();
			//3.2��дSQL���
			String sql = "select * from user";
			//3.3ִ��SQL
			rs = statement.executeQuery(sql);
			//3.4���������
			while(rs.next()) {
				System.out.print(rs.getInt("id") + " ");
				System.out.print(rs.getString("username") + " ");
				System.out.print(rs.getString("password") + " ");
				System.out.print(rs.getString("nickname") + " ");
				System.out.print(rs.getInt("age"));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//4.�ͷ���Դ
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				rs = null;
			}
			
			if(statement != null){
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				statement = null;
			}
			
			if(conn != null){
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
