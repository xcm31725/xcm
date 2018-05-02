package cn.itheima.dao;

import java.util.List;

import cn.itheima.domain.Product;

public interface IProductDAO {

	public List<Product> findAll();
}
