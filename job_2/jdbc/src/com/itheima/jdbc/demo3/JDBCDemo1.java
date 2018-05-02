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
			//获得链接
			conn = JDBCUtils.getConnection();
			//创建执行SQL语句对象
			stmt = conn.createStatement();
			//编写SQL语句
			String sql = "select * from user";
			//执行SQL
			rs = stmt.executeQuery(sql);
			//遍历结果集
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
