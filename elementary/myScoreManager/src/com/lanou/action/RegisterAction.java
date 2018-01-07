package com.lanou.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lan.entity.User;
import com.lanou.dao.IUserDao;
import com.lanou.dao.UserDaoImpl;
/**
 * 处理用户注册
 */
public class RegisterAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1、设置请求编码和响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//2、获取ajax提交的表单数据
		String username = request.getParameter("user");
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		String password_confirm = request.getParameter("password_confirmation");
		
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("phone:"+phone);
		System.out.println("password_confirm:"+password_confirm);
		
		//3、判断表单提交的注册信息,并返回相应信息
		PrintWriter out = response.getWriter();
		//3.1 判断账号和密码是否为空
		if(username.equals("") || password.equals("")){
			out.println(4);
			return;//程序执行到此结束
		}
		//3.2 判断两次输入的密码是否相同
		if(!password.equals(password_confirm)){
			out.println(2);
			return;
		}
		//3.3 判断用户名在数据库中是否存在
		IUserDao dao = new UserDaoImpl();
		User user = dao.findUserByName(username);
		if(user!=null){//数据库中存在相同用户名的用户,用户名重复
			out.println(3);
			return;
		}
		//3.4 接收表单提交的数据,注册用户
		User addUser = new User();
		addUser.setName(username);
		addUser.setPhone(phone);
		addUser.setPassword(password);
		
		String result = dao.addUser(addUser);
		//根据方法返回值返回注册是否成功
		if(result.equals("ok")){
			out.println(1);
		}
	}
}















