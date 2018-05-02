package com.itheima.product.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.product.domain.PageBean;
import com.itheima.product.domain.Product;
import com.itheima.utils.JDBCUtils;

public class ProductDao {
	/**
	 * findAll 查询所有商品
	 * @Title: findAll  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @return
	 * @param @throws SQLException    设定文件  
	 * @return List<Product>    返回类型  
	 * @throws
	 */
	public List<Product> findAll() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from product";
		List<Product> list = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
		return list;
	}

	/**
	 * save 添加商品
	 * @Title: save  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @return
	 * @param @throws SQLException    设定文件  
	 * @return void   返回类型  
	 * @throws
	 */
	public void save(Product product) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "insert into product values (?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {product.getPid(), product.getPname(), product.getMarket_price(), product.getShop_price(),
				product.getPimage(), product.getPdate(), product.getIs_hot(), product.getPdesc(), product.getPflag(),
				product.getCid()};
		queryRunner.update(sql, params);
	}
	/**
	 * @throws SQLException 
	 * findById DAO中根据ID查询商品的方法
	 * @Title: findById  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param pid
	 * @param @return    设定文件  
	 * @return Product    返回类型  
	 * @throws
	 */
	public Product findById(String pid) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from product where pid = ?";
		Product product = queryRunner.query(sql, new BeanHandler<Product>(Product.class), pid);
		return product;
	}


	/**
	 * @throws SQLException 
	 * update 修改商品
	 * @Title: update  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @return
	 * @param @throws SQLException    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void update(Product product) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql= "update product set pname =?,market_price=?,shop_price=?,pimage=?,pdate=?,is_hot=?,pdesc=?,pflag=?,cid=? where pid=?";
		Object[] params = {  product.getPname(), product.getMarket_price(), product.getShop_price(),
				product.getPimage(), product.getPdate(), product.getIs_hot(), product.getPdesc(), product.getPflag(),
				product.getCid(),product.getPid() };
		queryRunner.update(sql, params);
	}

	/**
	 * delete 删除单条记录的方法
	 * @Title: delete 
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param pid    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void delete(String pid) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "delete from product where pid = ?";
		queryRunner.update(sql, pid);
	}
	
	/**
	 * @throws SQLException 
	 * @throws SQLException 
	 * deleteAll 删除多条记录的方法
	 * @Title: deleteAll  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param pid    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	public void delete(Connection conn, String id) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "delete from product where pid = ?";
		queryRunner.update(conn, sql, id);
	}

	public List<Product> search(String pname) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from product where pname like ? order by pdate desc";
		List<Product> list = queryRunner.query(sql, new BeanListHandler<Product>(Product.class), "%"+pname+"%");
		return list;
	}

	public int findCount() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select count(*) from product";
		Long count = (Long) queryRunner.query(sql, new ScalarHandler());
		return count.intValue();
	}

	public List<Product> findByPage(int begin, int pageSize) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from product order by pdate desc limit ?,?";
		List<Product> list = queryRunner.query(sql, new BeanListHandler<Product>(Product.class), begin,pageSize);
		return list;
	}
}
