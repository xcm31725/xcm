package cn.itheima.service;

import cn.itheima.domain.User;

public interface IUserService {

	public User login(String username,String password);
}
