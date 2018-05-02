package cn.itcast.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.itcast.dao.IUserDao;
import cn.itcast.domain.User;

public class UserServiceImpl implements IUserService {
	private IUserDao userDao;
	
	
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void del(User user) {
		userDao.del(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User fingById(int id) {
		return userDao.fingById(id);
	}

	@Override
	public List<User> fingAll() {
		return userDao.fingAll();
	}

	@Override
	public List<User> findAllByCriteria(DetachedCriteria dc) {
		return userDao.findAllByCriteria(dc);
	}

	@Override
	public List<User> findByNameQuery() {
		return userDao.findByNameQuery();
	}

}
