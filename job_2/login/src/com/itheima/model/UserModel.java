package com.itheima.model;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.domian.User;
import com.itheima.utils.JDBCUtils;

public class UserModel {
	public User login(User user) throws SQLException{
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDatasource());
		User existUser = queryRunner.query("select * from user where username = ? and password = ?", new BeanHandler<User>(User.class), user.getUsername(),user.getPassword());
		return existUser;
	}
}
