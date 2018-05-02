package com.itheima.jdbc.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JDBCDemo2 {
	@Test
	public void text_set() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root", "root");
			stmt = conn.createStatement();
			String sql = "select * from user";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("username")+" "+rs.getString("password")+" "+rs.getString("nickname")+" "+rs.getInt("age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
	
	@Test
	public void text_delete() {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root", "root");
			stmt = conn.createStatement();
			String sql = "delete from user where id = 8";
			int num = stmt.executeUpdate(sql);
			if(num > 0) {
				System.out.println("修改成功!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
	
	@Test
	public void text_sever() {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root", "root");
			stmt = conn.createStatement();
			String sql = "update user set password='317' where id = 5";
			            // "update user set password='abc',nickname='旺财' where id = 5";
			int num = stmt.executeUpdate(sql);
			if(num > 0) {
				System.out.println("修改成功!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
	
	@Test
	public void text_add() {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql:///web_test3", "root", "root");
			stmt = conn.createStatement();
			String sql = "insert into user values (null,'eee','123','XCM',18)";
			int num = stmt.executeUpdate(sql);
			if(num > 0) {
				System.out.println("插入数据成功!!!");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
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
