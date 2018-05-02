package com.itheima.jdbc.demo5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils;

public class Demo1 {
	@Test
	public void test_select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select * from user";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("username") + " " + rs.getString("password") + " " + rs.getString("nickname") + " " + rs.getInt("age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs, pstmt, conn);
		}
	}
	
	@Test
	public void test_delete() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = JDBCUtils.getConnection();
			String sql = "delete from user where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 7);
			int num = pstmt.executeUpdate();
			if(num > 0) {
				System.out.println("删除成功！！！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	}
	
	@Test
	public void test_updata() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = JDBCUtils.getConnection();
			String sql = "update user set username = ?, password = ?, nickname = ?, age = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "sss");
			pstmt.setString(2, "317");
			pstmt.setString(3, "XXC");
			pstmt.setInt(4, 18);
			pstmt.setInt(5, 6);
			int num = pstmt.executeUpdate();
			if(num > 0) {
				System.out.println("修改成功！！！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	}
	
	@Test
	public void test_add(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//获得链接
			conn = JDBCUtils.getConnection();
			//编写SQL语句
			String sql = "insert into user values (null,?,?,?,?)";
			//预编译
			pstmt = conn.prepareStatement(sql);
			//设置参数
			pstmt.setString(1, "eee");
			pstmt.setString(2, "123");
			pstmt.setString(3, "XGD");
			pstmt.setInt(4, 23);
			//执行SQL
			int num = pstmt.executeUpdate();
			if(num > 0) {
				System.out.println("保存成功！！！");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	}
}
