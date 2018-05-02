package com.itheima.store.dao;

import java.sql.SQLException;
import java.util.List;

import com.itheima.store.domain.Category;

public interface CategoryDao {

	List<Category> findAll() throws SQLException;

	void save(Category category) throws SQLException;

	Category fingById(String cid) throws SQLException;

	void update(Category category) throws SQLException;

	void delete(String cid) throws SQLException;

}
