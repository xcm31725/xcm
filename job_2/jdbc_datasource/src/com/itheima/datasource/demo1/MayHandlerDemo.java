package com.itheima.datasource.demo1;

import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import com.itheima.jdbc.utils.JDBCUtils2;

public class MayHandlerDemo {
	@Test
	/**
	 * MapListHandler: 将多条记录封装到Map的List集合中。
	 */
	public void mayListHandler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		List<Map<String, Object>> map = queryRunner.query("select * from account", new MapListHandler());
		for (Map<String, Object> map2 : map) {
			System.out.println(map2);
		}
	}
	
	@Test
	/**
	 * MapHandler: 将一条记录封装到Map集合当中，Map的key是列名，Map中的value是表中记录值。
	 */
	public void mayHandler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		Map<String, Object> map = queryRunner.query("select * from account where id = ?", new MapHandler(),4);
		System.out.println(map);
	}
}
