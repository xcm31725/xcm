package com.itheima.demo.service;

import java.sql.SQLException;

import com.itheima.demo.dao.UserDao;
import com.itheima.demo.domain.User;

public class UserService {

	public User findUserByName(String sname) throws SQLException {
		return new UserDao().findUserByName(sname);
	}

}
