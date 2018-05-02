package com.itheima.datasource.demo1;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils2;

public class ArrayHandlerDemo1 {
	@Test
	/**
	 * ArrayListHandler
	 */
	public void arrayListHandeler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		List<Object[]> list = queryRunner.query("select * from account", new ArrayListHandler());
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}
	
	@Test
	/**
	 * ArrayHandler
	 */
	public void arrayHandeler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		Object[] obj = queryRunner.query("select * from account where id = ?", new ArrayHandler(),4);
		System.out.println(Arrays.toString(obj));
	}
}
