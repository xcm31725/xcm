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
			//�������
			conn = JDBCUtils.getConnection();
			//��������
			conn.setAutoCommit(false);
			//��дSQL
			String sql = "update account set money = money + ? where name = ?";
			//Ԥ����
			pstmt = conn.prepareStatement(sql);
			//���ò���
			//��aaa��ȥ1000
			pstmt.setDouble(1, -1000);
			pstmt.setString(2, "aaa");
			//ִ�п۳�aaa1000
			pstmt.executeUpdate();
			
			int i = 1 / 0;
			//��bbb��1000
			pstmt.setDouble(1, 1000);
			pstmt.setString(2, "bbb");
			pstmt.executeUpdate();
			//�ύ����
			conn.commit();
		} catch (Exception e) {
			//�ع�����
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
			//�������
			conn = JDBCUtils.getConnection();
			//��дSQL
			String sql = "update account set money = money + ? where name = ?";
			//Ԥ����
			pstmt = conn.prepareStatement(sql);
			//���ò���
			//��aaa��ȥ1000
			pstmt.setDouble(1, -1000);
			pstmt.setString(2, "aaa");
			//ִ�п۳�aaa1000
			pstmt.executeUpdate();
			
			int i = 1 / 0;
			//��bbb��1000
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
