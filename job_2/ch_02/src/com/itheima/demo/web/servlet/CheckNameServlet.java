package com.itheima.demo.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.demo.domain.User;
import com.itheima.demo.service.UserService;

/**
 * 教研账号
 */
public class CheckNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");
			String sname = request.getParameter("sname");
			UserService userService = new UserService();
			User user = userService.findUserByName(sname);
			if (user == null) {
				response.getWriter().print(1);
			} else {
				response.getWriter().print(2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
