package com.itheima.utils;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {
	private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	/**
	 * 获得连接方法
	 * @throws SQLException 
	 */
	public Connection getConnection() throws SQLException{
		return dataSource.getConnection();
		
	}
	
	/**
	 * 获得连接池 
	 */
	public static ComboPooledDataSource getDatasource() {
		return dataSource;
	}
}
