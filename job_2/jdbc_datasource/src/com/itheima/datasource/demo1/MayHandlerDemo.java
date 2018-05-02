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
	 * MapListHandler: ��������¼��װ��Map��List�����С�
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
	 * MapHandler: ��һ����¼��װ��Map���ϵ��У�Map��key��������Map�е�value�Ǳ��м�¼ֵ��
	 */
	public void mayHandler() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		Map<String, Object> map = queryRunner.query("select * from account where id = ?", new MapHandler(),4);
		System.out.println(map);
	}
}
