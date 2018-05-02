package com.itheima.jquery.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.jquery.domain.City;
import com.itheima.jquery.domain.Province;
import com.itheima.utils.JDBCUtils;

public class ProvinceDao {

	public List<Province> findAll() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from province";
		List<Province> list = queryRunner.query(sql, new BeanListHandler<Province>(Province.class));
		return list;
	}

	public List<City> findByPid(String pid) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from city where pid = ?";
		List<City> list = queryRunner.query(sql, new BeanListHandler<City>(City.class), pid);
		return list;
	}

}
