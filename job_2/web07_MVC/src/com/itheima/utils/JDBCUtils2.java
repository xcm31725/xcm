package com.itheima.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * JDBC的工具类
 * @author jt
 *
 */
public class JDBCUtils2 {
	private static final ComboPooledDataSource dataSource = new ComboPooledDataSource();
	private static final ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	/**
	 * 获得链接的方法
	 * @throws SQLException 
	 */
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = tl.get();
			if(conn == null) {
				conn = dataSource.getConnection();
				tl.set(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void beginTransaction() throws SQLException {
		Connection conn = null;
		conn = tl.get();
		if(conn == null) {
			conn = dataSource.getConnection();
			tl.set(conn);
		}
		conn.setAutoCommit(false);
	}

	public static void commitTransaction() throws SQLException {
		Connection conn = tl.get();
		conn.commit();
	}

	public static void rollBackTransaction() throws SQLException {
		Connection conn = tl.get();
		conn.rollback();
	}
	
	
	public static DataSource getDataSource(){
		return dataSource;
	}
	
}
