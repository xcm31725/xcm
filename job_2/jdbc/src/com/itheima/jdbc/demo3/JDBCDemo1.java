package com.itheima.jdbc.demo3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils;

public class JDBCDemo1 {
	@Test
	public void text() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//�������
			conn = JDBCUtils.getConnection();
			//����ִ��SQL������
			stmt = conn.createStatement();
			//��дSQL���
			String sql = "select * from user";
			//ִ��SQL
			rs = stmt.executeQuery(sql);
			//���������
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("username")+" "+rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs, stmt, conn);
		}
	}
}
