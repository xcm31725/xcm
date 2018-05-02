package com.itheima.dbutils.demo1;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils2;

public class DBUitlsDemo1 {
	@Test
	public void test_delete() throws Exception {
		//���������ࣺQueryRunner
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		queryRunner.update("delete from account where id = ?", 3);
	}
	
	@Test
	/**
	 * �޸Ĳ���
	 */
	public void test_update() throws SQLException {
		//���������ࣺQueryRunner
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		queryRunner.update("update account set name = ?, money = ? where id = ?", "ccc",5000,3);
	}
	
	@Test
	/**
	 * ��Ӳ��� 
	 */
	public void test_add() throws Exception {
		//���������ࣺQueryRunner
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		queryRunner.update("insert into account values (null,?,?)", "xcm",10000);
	}
}