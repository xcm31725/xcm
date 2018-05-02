package cn.itheima.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.itheima.domain.User;
import cn.itheima.utils.JdbcUtils;

public class UserDaoImpl implements IUserDAO {

	@Override
	public User findUserByUserNameAndPassword(String username, String password) {
		QueryRunner runner = new QueryRunner(JdbcUtils.getDataSource());
		try {
			return runner.query("select * from user where username=? and password=?", new BeanHandler<User>(User.class),
					username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
