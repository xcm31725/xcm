package cn.itheima.dao;

import cn.itheima.domain.User;

public interface IUserDAO {

	public User findUserByUserNameAndPassword(String username,String password);
}
