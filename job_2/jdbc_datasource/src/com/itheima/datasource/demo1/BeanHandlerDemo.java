package com.itheima.datasource.demo1;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import com.itheima.dbutils.bean.Account;
import com.itheima.jdbc.utils.JDBCUtils2;

public class BeanHandlerDemo {
	@Test
	/**
	 * BeanListHanbler:��������¼��װ��JavaBean��
	 * һ����¼����һ��JavaBean���󣬶�����¼���ǽ������¼��װ��List������
	 */
	public void beanListHanbler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		List<Account> account = queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
		for (Account account2 : account) {
			System.out.println(account2);
		}
	}
	
	@Test
	/**
	 * BeanHanbler:��һ����¼��װ��JavaBean��
	 */
	public void beanHanbler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		Account account = queryRunner.query("select * from account where id = ?", new BeanHandler<Account>(Account.class),4);
		System.out.println(account);
	}
}
