package com.itheima.jquery.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.jquery.dao.ProvinceDao;
import com.itheima.jquery.domain.City;
import com.itheima.jquery.domain.Province;

public class ProvinceService {

	public List<Province> findAll() throws SQLException {
		ProvinceDao provinceDao = new ProvinceDao();
		return provinceDao.findAll();
	}

	public List<City> findByPid(String pid) throws SQLException {
		ProvinceDao provinceDao = new ProvinceDao();
		return provinceDao.findByPid(pid);
	}

}
