package com.itheima.dbutils.demo1;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils2;

public class DBUitlsDemo1 {
	@Test
	public void test_delete() throws Exception {
		//创建核心类：QueryRunner
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		queryRunner.update("delete from account where id = ?", 3);
	}
	
	@Test
	/**
	 * 修改操作
	 */
	public void test_update() throws SQLException {
		//创建核心类：QueryRunner
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		queryRunner.update("update account set name = ?, money = ? where id = ?", "ccc",5000,3);
	}
	
	@Test
	/**
	 * 添加操作 
	 */
	public void test_add() throws Exception {
		//创建核心类：QueryRunner
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		queryRunner.update("insert into account values (null,?,?)", "xcm",10000);
	}
}