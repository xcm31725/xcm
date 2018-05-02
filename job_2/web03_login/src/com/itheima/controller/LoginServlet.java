package com.itheima.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.User;
import com.itheima.model.UserModel;

/**
 * 登录的Servlet的编写
 */
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//1.接收数据
			//处理中文乱码
			request.setCharacterEncoding("utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			//2.封装数据
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			//3.处理数据
			UserModel userModel = new UserModel();
			User exisUser = null;
			
			exisUser = userModel.login(user);
			
			//4.页面跳转
			if(exisUser == null) {
				//登录失败
				//向request域中保存一个错误信息：
				request.setAttribute("msg", "用户名或密码错误！");
				//使用请求转发进行页面跳转
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}else{
				//登录成功
				//获取计数器并进行加1操作
				Integer count = (Integer)this.getServletContext().getAttribute("count");
				count++;
				//把数据存到ServletCont域中
				this.getServletContext().setAttribute("count", count);
				//使用重定向进行页面跳转
				response.sendRedirect("/web03_login/success.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
