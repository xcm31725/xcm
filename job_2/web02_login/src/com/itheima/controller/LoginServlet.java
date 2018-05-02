package com.itheima.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itheima.domian.User;
import com.itheima.model.UserModel;

/**
 * 登录页面的Servlet
 */
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//1.获取数据
			//设置编码集
			request.setCharacterEncoding("utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			//一次性验证码的校验
			//接收验证码
			String checkcode = request.getParameter("checkcode");
			//从session中获取一次性验证码的值
			String checkcode2 = (String)request.getSession().getAttribute("checkcode");
			//为了保证验证码使用一次：应该将session中的验证码值清空
			request.getSession().removeAttribute("checkcode");
			//校验一次性验证码：
			if(!checkcode.equalsIgnoreCase(checkcode2)) {
				request.setAttribute("msg", "验证码输入错误！");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return;
			}
			//2.封装数据
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			//3.处理数据
			UserModel userModel = new UserModel();
			User existUser = userModel.login(user);
			//4.页面跳转
			if(existUser == null) {
				//登录失败
				request.setAttribute("msg","用户名或密码错误");
				//使用请求转发进行页面跳转
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			} else {
				//登录成功
				//保存用户的信息：保存到会话当中。
				HttpSession session = request.getSession();
				//保存数据：
				session.setAttribute("existUser", existUser);
				//记住用户名
				//判断复选框是否勾选
				String remember = request.getParameter("remember");
				if("true".equals(remember)) {
					//已勾选
					Cookie c = new Cookie("remember",existUser.getUsername());
					//设置路径
					c.setPath("/web02_login");
					//设置有效时间
					c.setMaxAge(60 * 60 * 24);
					//回显数据
					response.addCookie(c);
				}
				//重定向进行页面跳转
				response.sendRedirect("/web02_login/success.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
