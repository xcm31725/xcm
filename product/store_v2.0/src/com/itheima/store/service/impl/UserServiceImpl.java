package com.itheima.store.service.impl;

import java.sql.SQLException;

import com.itheima.store.dao.CategoryDao;
import com.itheima.store.dao.UserDao;
import com.itheima.store.dao.impl.UserDaoImpl;
import com.itheima.store.domain.User;
import com.itheima.store.service.UserService;
import com.itheima.store.utils.BeanFactory;
import com.itheima.store.utils.MailUtils;
import com.itheima.store.utils.UUIDUtils;

public class UserServiceImpl implements UserService {

	@Override
	public User findByUsername(String username) throws SQLException{
		UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
		return userDao.findByUsername(username);
	}

	@Override
	public void save(User user) throws SQLException {
		UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
		user.setUid(UUIDUtils.getUUID());
		user.setState(1);
		String code = UUIDUtils.getUUID()+UUIDUtils.getUUID();
		user.setCode(code);
		userDao.save(user);
		
		MailUtils.sendMail(user.getEmail(), code);
	}

	@Override
	public User findByCode(String code) throws SQLException {
		UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
		return userDao.findByCode(code);
	}

	@Override
	public void update(User existUser) throws SQLException {
		UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
		userDao.update(existUser);
	}

	@Override
	public User login(User user) throws SQLException {
		UserDao userDao =(UserDao) BeanFactory.getBean("userDao");
		return userDao.login(user);
	}
	
}
