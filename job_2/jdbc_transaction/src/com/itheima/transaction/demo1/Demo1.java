package com.itheima.transaction.demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils;

public class Demo1 {
	@Test
	public void testName1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//获得链接
			conn = JDBCUtils.getConnection();
			//开启事务
			conn.setAutoCommit(false);
			//编写SQL
			String sql = "update account set money = money + ? where name = ?";
			//预编译
			pstmt = conn.prepareStatement(sql);
			//设置参数
			//给aaa减去1000
			pstmt.setDouble(1, -1000);
			pstmt.setString(2, "aaa");
			//执行扣除aaa1000
			pstmt.executeUpdate();
			
			int i = 1 / 0;
			//给bbb加1000
			pstmt.setDouble(1, 1000);
			pstmt.setString(2, "bbb");
			pstmt.executeUpdate();
			//提交事务
			conn.commit();
		} catch (Exception e) {
			//回滚事务
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	}
	
	@Test
	public void testName() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//获得链接
			conn = JDBCUtils.getConnection();
			//编写SQL
			String sql = "update account set money = money + ? where name = ?";
			//预编译
			pstmt = conn.prepareStatement(sql);
			//设置参数
			//给aaa减去1000
			pstmt.setDouble(1, -1000);
			pstmt.setString(2, "aaa");
			//执行扣除aaa1000
			pstmt.executeUpdate();
			
			int i = 1 / 0;
			//给bbb加1000
			pstmt.setDouble(1, 1000);
			pstmt.setString(2, "bbb");
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	}
}
