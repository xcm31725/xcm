package com.itheima.jquery.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.jquery.domain.User;
import com.itheima.jquery.service.UserService;

/**
 * 异步校验用户名的Servlet
 */
public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String sname = request.getParameter("sname");
			UserService userService = new UserService();
			User user = userService.findBySname(sname);
			if(user == null) {
				response.getWriter().println(1);
			}else {
				response.getWriter().println(2);
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
