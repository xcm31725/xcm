package com.itheima.product.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;

/**
 * 商品管理的业务层的类
 */
import com.itheima.product.dao.ProductDao;
import com.itheima.product.domain.PageBean;
import com.itheima.product.domain.Product;
import com.itheima.utils.JDBCUtils;

public class ProductService {

	/**
	 * @throws SQLException 
	 * findAll 查询所有的商品的方法：
	 * @Title: findAll  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @return    设定文件  
	 * @return List<Product>    返回类型  
	 * @throws
	 */
	public List<Product> findAll() throws SQLException {
		ProductDao productDao = new ProductDao();
		return productDao.findAll();
	}

	/**
	 * @throws SQLException 
	 * save 添加商品的方法
	 * @Title: save  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param product    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void save(Product product) throws SQLException {
		ProductDao productDao = new ProductDao();
		productDao.save(product);
	}

	/**
	 * findById 根据ID查询商品的方法
	 * @Title: findById  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param pid
	 * @param @return
	 * @param @throws SQLException    设定文件  
	 * @return Product    返回类型  
	 * @throws
	 */
	public Product findById(String pid) throws SQLException {
		ProductDao productDao = new ProductDao();
		return productDao.findById(pid);
	}
	
	/**
	 * @throws SQLException 
	 * update 修改商品的方法
	 * @Title: update  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param product    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void update(Product product) throws SQLException {
		ProductDao productDao = new ProductDao();
		productDao.update(product);
	}

	/**
	 * delete 删除单条商品的方法
	 * @Title: delete  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param pid
	 * @param @throws SQLException    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void delete(String pid) throws SQLException {
		ProductDao productDao = new ProductDao();
		productDao.delete(pid);
	}
	
	/**
	 * @throws SQLException 
	 * delectAll 删除多条记录的方法
	 * @Title: delectAll  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param pid    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void delectAll(String[] sid) {
		Connection conn = null;
		try {
			conn = JDBCUtils.getConnection();
			conn.setAutoCommit(false);
			ProductDao productDao = new ProductDao();
			for (String id:sid) {
				productDao.delete(conn, id);
			}
			DbUtils.commitAndCloseQuietly(conn);
		} catch (Exception e) {
			DbUtils.rollbackAndCloseQuietly(conn);
			e.printStackTrace();
		}
	}

	/**
	 * @throws SQLException 
	 * search 商品的迷糊查询
	 * @Title: search  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param pname
	 * @param @return    设定文件  
	 * @return List<Product>    返回类型  
	 * @throws
	 */
	public List<Product> search(String pname) throws SQLException {
		ProductDao productDao = new ProductDao();
		return productDao.search(pname);
	}

	/**
	 * @throws SQLException 
	 * findByPage 分页查询商品的方法
	 * @Title: findByPage  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param currPage
	 * @param @return    设定文件  
	 * @return PageBean    返回类型  
	 * @throws
	 */
	public PageBean findByPage(int currPage) throws SQLException {
		
		PageBean pageBean = new PageBean();
		// 设置pageBean的参数:
		// 设置当前页数:
		pageBean.setCurrPage(currPage);
		// 设置每页显示记录数:
		int pageSize = 10;
		pageBean.setPageSize(pageSize);
		// 设置总记录数:
		ProductDao productDao = new ProductDao();
		int totalCount = productDao.findCount();
		pageBean.setTotalCount(totalCount);
		// 设置总页数:
		double tc = totalCount;
		Double num = Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		// 设置每页显示的数据的集合:
		int begin = (currPage - 1)* pageSize;
		List<Product> list = productDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
		
		
	}

	
	
}
