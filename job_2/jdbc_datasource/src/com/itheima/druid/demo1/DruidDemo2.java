package com.itheima.druid.demo1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.jdbc.utils.JDBCUtils;

public class DruidDemo2 {
	@Test
	public void testName() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			/*//使用连接池
			DruidDataSource dataSource = new DruidDataSource();
			//手动设置数据库参数
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql:///web_test4");
			dataSource.setUsername("root");
			dataSource.setPassword("root");*/
			// 使用连接池：
			// 从属性文件中获取：
			Properties properties = new Properties();
			properties.load(new FileInputStream("src/druid.properties"));
			DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
			
			//获得链接
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
