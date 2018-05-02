package com.itheima.demo3.transaction.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;

import com.itheima.demo3.transaction.dao.AccountDao;
import com.itheima.utils.JDBCUtils;
import com.itheima.utils.JDBCUtils2;

public class AccountService {
	/**
	 * transfer 事物管理的第三种方法：使用DBUtis
	 * @Title: transfer  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param from
	 * @param @param to
	 * @param @param money    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void transfer(String from, String to, Double money) {
		AccountDao accountDao = new AccountDao();
		Connection conn = JDBCUtils.getConnection();
		try {
			conn.setAutoCommit(false);
			accountDao.outMoney(conn,from,money);
			int a = 1/0;
			accountDao.inMoney(conn,to,money);
			DbUtils.commitAndCloseQuietly(conn);
		} catch (Exception e) {
			try {
				DbUtils.rollbackAndCloseQuietly(conn);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
	
	/**
	 * transfer 事物管理的第二种方法：绑定线程
	 * @Title: transfer  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param from
	 * @param @param to
	 * @param @param money    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void transfer2(String from, String to, Double money) {
		AccountDao accountDao = new AccountDao();
		Connection conn = null;
		try {
			JDBCUtils2.beginTransaction();
			//conn = JDBCUtils.getConnection();
			//conn.setAutoCommit(false);
			//accountDao.outMoney(conn,from,money);
			//int a = 1/0;
			//accountDao.inMoney(conn,to,money);
			//conn.commit();
			JDBCUtils2.commitTransaction();
		} catch (Exception e) {
			try {
				//conn.rollback();
				JDBCUtils2.rollBackTransaction();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
	
	/**
	 * transfer1 事物管理的第一种方法：向下传递Connection
	 * @Title: transfer1  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param from
	 * @param @param to
	 * @param @param money    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void transfer1(String from, String to, Double money) {
		AccountDao accountDao = new AccountDao();
		Connection conn = null;
		
		try {
			conn = JDBCUtils.getConnection();
			conn.setAutoCommit(false);
			//accountDao.outMoney(conn,from,money);
			//int a = 1/0;
			//accountDao.inMoney(conn,to,money);
			conn.commit();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}

}
