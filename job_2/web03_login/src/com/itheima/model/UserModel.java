package com.itheima.model;
/**
 * 处理数据的JavaBean
 */
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUtils;

public class UserModel {
	/**
	 * 处理用户登录的方法
	 */
	public User login(User user) throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		User existUser = queryRunner.query("select * from user where username = ? and password = ?", new BeanHandler<User>(User.class), user.getUsername(), user.getPassword());
		return existUser;
	}
}
