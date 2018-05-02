package com.itheima.jquery.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.jquery.domain.User;
import com.itheima.jquery.service.UserService;

/**
 * 
 */
public class ServletDemo3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String username = request.getParameter("username");
			UserService userService = new UserService();
			User user = userService.findBySname(username);
			response.setContentType("text/html;charset=UTF-8");
			if(user == null){
				// 用户名可以使用.
				response.getWriter().println(1);
				//response.getWriter().println("<font color='green'>用户名可以使用</font>");
			}else{
				// 用户名已经被占用
				response.getWriter().println(2);
				//response.getWriter().println("<font color='red'>用户名已经被占用</font>");
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
