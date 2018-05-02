package com.itheima.jquery.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.jquery.domain.Province;
import com.itheima.jquery.service.ProvinceService;

/**
 * 响应JSOn的JQ的案例:跳转到注册页面:
 */
public class ProvinceJOSNServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询所有的身份信息：
		ProvinceService provinceService = new ProvinceService();
		try {
			List<Province> list = provinceService.findAll();
			request.setAttribute("list", list);
			System.out.println(list);
			request.getRequestDispatcher("/json/demo1.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
