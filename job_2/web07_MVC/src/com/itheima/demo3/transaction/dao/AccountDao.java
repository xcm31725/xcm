package com.itheima.demo3.transaction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class AccountDao {

	/**
	 * @throws SQLException 
	 * @param conn 
	 * outMoney ���ǿ�Ǯ�ķ���
	 * @Title: outMoney  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @param from
	 * @param @param money    �趨�ļ�  
	 * @return void    ��������  
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
			//�������
			//conn = JDBCUtils.getConnection();
			//��дSQL
			String sql = "update account set money = money - ? where name = ?";
			//Ԥ����SQL
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
	 * inMoney ���Ǽ�Ǯ�ķ���
	 * @Title: inMoney  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @param to
	 * @param @param money    �趨�ļ�  
	 * @return void    ��������  
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
			//�������
			//conn = JDBCUtils.getConnection();
			//��дSQL
			String sql = "update account set money = money + ? where name = ?";
			//Ԥ����SQL
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
