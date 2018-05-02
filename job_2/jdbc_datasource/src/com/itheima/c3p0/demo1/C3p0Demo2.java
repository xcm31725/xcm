package com.itheima.c3p0.demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Demo2 {
	@Test
	public void testName() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//获得连接：从连接池中获取
			//创建连接池:创建连接池默认去类路径下查找c3p0-config.xml
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			// 从连接池中获得连接:
			conn = dataSource.getConnection();
			String sql = "select * from account";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getDouble("money"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs, pstmt, conn);
		}
	}
}
