package cn.itheima.service;

import java.util.List;

import cn.itheima.dao.IProductDAO;
import cn.itheima.dao.ProductDAOImpl;
import cn.itheima.domain.Product;

public class ProductServiceImpl implements IProductService {

	@Override
	public List<Product> findAll() {
		IProductDAO productDao = new ProductDAOImpl();
		return productDao.findAll();
	}

}
