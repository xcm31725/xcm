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
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//�������
			conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root", "root");
			//ִ��SQL
			//���ִ��SQL����
			stmt = conn.createStatement();
			//��дSQL���
			String sql = "select * from user";
			//ִ��SQL���
			rs = stmt.executeQuery(sql);
			//���������
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("username") + " " + rs.getString("password") + " " + rs.getString("nickname") + " " + rs.getInt("age"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ͷ���Դ
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
