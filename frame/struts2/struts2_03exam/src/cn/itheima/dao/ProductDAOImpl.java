package cn.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itheima.domain.Product;
import cn.itheima.utils.JdbcUtils;

public class ProductDAOImpl implements IProductDAO {

	@Override
	public List<Product> findAll() {
		QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());

		try {
			return runner.query("select * from product", new BeanListHandler<Product>(Product.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
