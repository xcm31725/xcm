package cn.itcast.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements IUserDao {

	@Override
	public void add(User user) {
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void del(User user) {
		this.getHibernateTemplate().delete(user);
	}

	@Override
	public void update(User user) {
		this.getHibernateTemplate().update(user);
	}

	@Override
	public User fingById(int id) {
		return (User) this.getHibernateTemplate().get(User.class, id);
	}

	@Override
	public List<User> fingAll() {
		return (List<User>) this.getHibernateTemplate().find("from User");
	}
	
	@Override
	public List<User> findAllByCriteria(DetachedCriteria dc) {
		return (List<User>) this.getHibernateTemplate().findByCriteria(dc);
	}

	@Override
	public List<User> findByNameQuery() {
		//return (List<User>) this.getHibernateTemplate().findByNamedQuery("findUserByHQL", 1);

		return (List<User>) this.getHibernateTemplate().findByNamedQuery("findUserBySQL");
	}

}
