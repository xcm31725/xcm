package com.itheima.jquery.service;

import java.sql.SQLException;

import com.itheima.jquery.dao.UserDao;
import com.itheima.jquery.domain.User;

public class UserService {

	public User findBySname(String username) throws SQLException {
		UserDao userDao = new UserDao();
		return userDao.findBySname(username);
	}

}
