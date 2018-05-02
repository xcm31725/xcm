package com.itheima.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.User;
import com.itheima.model.UserModel;

/**
 * 登录页面判断
 */
public class UserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//获取表单数据
			//request.setCharacterEncoding("utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			//把数据存储在User对象中
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			//处理数据
			UserModel userModel  = new UserModel();
			User existUser = userModel.login(user);
			//页面跳转
			if(existUser == null) {
				//登录失败
				request.setAttribute("msg", "用户名或密码错误！");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			} else {
				//登录成功
				request.getSession().setAttribute("existUser", existUser);
				response.sendRedirect(request.getContextPath()+"/jsp/success.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
