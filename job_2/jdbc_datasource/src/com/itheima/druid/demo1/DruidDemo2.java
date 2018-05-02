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
			/*//ʹ�����ӳ�
			DruidDataSource dataSource = new DruidDataSource();
			//�ֶ��������ݿ����
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql:///web_test4");
			dataSource.setUsername("root");
			dataSource.setPassword("root");*/
			// ʹ�����ӳأ�
			// �������ļ��л�ȡ��
			Properties properties = new Properties();
			properties.load(new FileInputStream("src/druid.properties"));
			DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
			
			//�������
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
