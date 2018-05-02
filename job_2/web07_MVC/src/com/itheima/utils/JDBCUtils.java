package com.itheima.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC
 * @author jt
 *
 */
public class JDBCUtils {
	// 
	private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	/**
	 * 获得链接的方法
	 * @throws SQLException 
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
	
}
