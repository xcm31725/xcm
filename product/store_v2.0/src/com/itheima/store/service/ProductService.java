package com.itheima.store.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.store.domain.PageBean;
import com.itheima.store.domain.Product;

public interface ProductService {

	PageBean<Product> findByPageCid(String cid, Integer currPage) throws SQLException;

	Product findByPid(String pid) throws SQLException;

	List<Product> findByHot() throws SQLException;

	List<Product> findByNew() throws SQLException;

	PageBean<Product> findByPage(Integer currPage) throws SQLException;

	void update(Product product) throws SQLException;

	List<Product> findByPushDown() throws SQLException;

	void save(Product product) throws SQLException;

}
