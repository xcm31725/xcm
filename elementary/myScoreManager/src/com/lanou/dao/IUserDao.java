package com.lanou.dao;

import com.lan.entity.User;

/**
 * 用户操作接口
 */
public interface IUserDao {
	/**根据用户名查找用户*/
	public User findUserByName(String username);
	/**注册用户
	 * @return 注册成功返回 "ok"  注册失败返回"error"
	 * @param 参数user为用户需要注册的信息
	 * */
	public String addUser(User user);
	
	/**
	 * 根据账号密码去数据库查询
	 * @param username  登录表单中填写的用户名
	 * @param password  登录表单中填写的密码
	 * @return true:找到了登录成功    false:找不到登录失败
	 */
	public boolean login(String username,String password);
	
	
	
	
}



