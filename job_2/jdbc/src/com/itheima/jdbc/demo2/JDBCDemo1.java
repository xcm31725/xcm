package com.itheima.jdbc.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDemo1 {
	
	@Test
	public void test_delete() {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root", "root");
			
			stmt = conn.createStatement();
			String sql = "delete from user where id = 4";
			
			int num = stmt.executeUpdate(sql);
			if(num>0){
				System.out.println("É¾³ý³É¹¦!!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
