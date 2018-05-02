package com.itheima.jquery.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.jquery.domain.Province;
import com.itheima.jquery.service.ProvinceService;

/**
 * 响应XML数据的JQ的案例:查询所有的省份信息显示到注册页面.
 */
public class ProvinceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询所有的身份的信息：
		ProvinceService provinceService = new ProvinceService();
		try {
			List<Province> list = provinceService.findAll();
			//System.out.println(list);
			request.setAttribute("list", list);
			request.getRequestDispatcher("/ProvinceAndCity/demo1.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
