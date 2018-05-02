package com.itheima.utils;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {
	private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	/**
	 * ������ӷ���
	 * @throws SQLException 
	 */
	public Connection getConnection() throws SQLException{
		return dataSource.getConnection();
		
	}
	
	/**
	 * ������ӳ� 
	 */
	public static ComboPooledDataSource getDatasource() {
		return dataSource;
	}
}
