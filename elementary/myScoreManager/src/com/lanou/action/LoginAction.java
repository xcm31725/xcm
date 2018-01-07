package com.lanou.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lanou.dao.IUserDao;
import com.lanou.dao.UserDaoImpl;

public class LoginAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1、设置请求编码,响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//2、获取登录表单提交的账号密码
		String username = request.getParameter("user");
		String password = request.getParameter("password");
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		
		//3、根据账号密码去数据库查询,查询到了,登录成功,返回1
		PrintWriter out = response.getWriter();
		IUserDao dao = new UserDaoImpl();
		boolean result = dao.login(username, password);
		if(result){//登录成功
			System.out.println("登录成功");
			//将用户名保存在session对象中
			HttpSession session = request.getSession();
			session.setAttribute("username",username);
			out.println(1);
		}
	}
}










