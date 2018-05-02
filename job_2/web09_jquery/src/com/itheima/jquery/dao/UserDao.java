package com.itheima.jquery.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.jquery.domain.User;
import com.itheima.utils.JDBCUtils;

public class UserDao {

	public User findBySname(String username) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from user where username = ?";
		User user = queryRunner.query(sql, new BeanHandler<User>(User.class), username);
		return user;
	}

}
