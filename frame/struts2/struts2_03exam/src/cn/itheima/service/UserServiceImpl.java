package cn.itheima.service;

import cn.itheima.dao.IUserDAO;
import cn.itheima.dao.UserDaoImpl;
import cn.itheima.domain.User;

public class UserServiceImpl implements IUserService {

	@Override
	public User login(String username, String password) {
		IUserDAO userDao = new UserDaoImpl();

		return userDao.findUserByUserNameAndPassword(username, password);
	}

}
