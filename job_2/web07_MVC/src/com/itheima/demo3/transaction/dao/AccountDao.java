package com.itheima.demo3.transaction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class AccountDao {

	/**
	 * @throws SQLException 
	 * @param conn 
	 * outMoney 这是扣钱的方法
	 * @Title: outMoney  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param from
	 * @param @param money    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void outMoney(Connection conn, String from, Double money) throws SQLException {
		QueryRunner quRunner = new QueryRunner();
		String sql = "update account set money = money - ? where name = ?";
		quRunner.update(conn, sql, money, from);
	}
	
	/*public void outMoney(Connection conn, String from, Double money) {
	//	Connection conn = null;
		PreparedStatement stmt = null;
		try {
			//获得链接
			//conn = JDBCUtils.getConnection();
			//编写SQL
			String sql = "update account set money = money - ? where name = ?";
			//预编译SQL
			stmt = conn.prepareStatement(sql);
			stmt.setDouble(1, 1000);
			stmt.setString(2, "from");
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			//	conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}*/

	/**
	 * @throws SQLException 
	 * inMoney 这是加钱的方法
	 * @Title: inMoney  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param to
	 * @param @param money    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void inMoney(Connection conn,String to, Double money) throws SQLException {
		QueryRunner queryRunner = new QueryRunner();
		String sql = "update account set money = money + ? where name = ?";
		queryRunner.update(conn, sql, money, to);
	}
	
	/*public void inMoney(Connection conn,String to, Double money) {
		//Connection conn = null;
		PreparedStatement stmt = null;
		try {
			//获得链接
			//conn = JDBCUtils.getConnection();
			//编写SQL
			String sql = "update account set money = money + ? where name = ?";
			//预编译SQL
			stmt = conn.prepareStatement(sql);
			stmt.setDouble(1, 1000);
			stmt.setString(2, "to");
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			//	conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}*/

}
