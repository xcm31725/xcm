package com.lanou.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lan.entity.User;
import com.lanou.util.JdbcUtil;

public class UserDaoImpl implements IUserDao{
	@Override
	public User findUserByName(String username) {
		try {
			//1、创建Connection连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、根据传过来的用户名username查找用户
			String sql = "select * from user where name=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,username);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){//如果从数据库中查找到了用户,就把他封装成一个user对象
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String password = rs.getString("password");
				
				User u = new User();
				u.setId(id);
				u.setName(name);
				u.setPassword(phone);
				u.setPassword(password);
				return u;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 注册用户
	 */
	@Override
	public String addUser(User user) {
		try {
			//1、获取连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句插入用户信息
			String sql = "insert into user(name,phone,password) values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,user.getName());
			pstmt.setString(2,user.getPhone());
			pstmt.setString(3,user.getPassword());
			int rows = pstmt.executeUpdate();
			if(rows!=0){//注册成功
				return "ok";
			}else{
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**根据账号和密码去数据库查询数据
	 * 查询到返回true
	 * 查询不到返回false
	 * */
	@Override
	public boolean login(String username, String password) {
		try {
			//1、获取连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句去数据库查询
			String sql = "select * from user where name=? and password=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,username);
			pstmt.setString(2,password);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){//根据账号密码查询到了记录
				System.out.println("找到了");
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}	
}

















