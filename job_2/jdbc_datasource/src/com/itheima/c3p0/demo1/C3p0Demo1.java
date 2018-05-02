package com.itheima.c3p0.demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Demo1 {
	@Test
	public void testName() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//获得连接：从连接池中获取
			//创建连接池
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			//设置连接参数
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setJdbcUrl("jdbc:mysql:///web_test4");
			dataSource.setUser("root");
			dataSource.setPassword("root");
			
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
