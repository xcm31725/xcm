package cn.itcast.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import cn.itcast.domain.User;

public interface IUserService {
	public void add(User user);
	public void del(User user);
	public void update(User user);
	public User fingById(int id);
	public List<User> fingAll();

	public List<User> findAllByCriteria(DetachedCriteria dc);
	public List<User> findByNameQuery();
}
