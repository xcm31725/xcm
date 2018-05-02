package com.itheima.datasource.demo1;

import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils2;

public class ColumnListHandlerDemo {
	@Test
	/**
	 * KeyedHandler: 将一条记录封装到一个Map集合中。将多条记录封装到一个装有Map集合的Map集合中。而且外面的Map的key是可以指定的。
	 */
	public void keyedHandler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		Map<Object, Map<String, Object>> map = queryRunner.query("select * from account", new KeyedHandler("id"));
		for (Object key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
		
	}
	
	@Test
	/**
	 * ScalarHandler: 单值封装
	 */
	public void scalarHandler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		Object obj = queryRunner.query("select count(*) from account", new ScalarHandler());
		System.out.println(obj);
		
	}
	
	@Test
	/**
	 * ColumnListHandler: 讲某列的值封装到List聚合中。
	 */
	public void columnListHandler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		List<Object> list = queryRunner.query("select name,money from account", new ColumnListHandler());
		for (Object object : list) {
			System.out.println(object);
		}
		
	}
}
