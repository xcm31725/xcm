package com.itheima.demo.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.fujb.commons.db.JdbcUtils;

import com.itheima.demo.domain.User;

public class UserDao {

	public User findUserByName(String sname) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JdbcUtils.getDataSource());
		String sql = "select * from user where username = ?";
		User user = queryRunner.query(sql, new BeanHandler<User>(User.class),
				sname);
		return user;
	}

}
