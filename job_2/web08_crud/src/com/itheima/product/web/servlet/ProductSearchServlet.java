package com.itheima.product.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.product.domain.Product;
import com.itheima.product.service.ProductService;

/**
 * 商品模糊查询的Servlet
 */
public class ProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// 接收数据：
			request.setCharacterEncoding("utf-8");
			String pname = request.getParameter("pname");
			// 调用业务层处理:
			ProductService productService = new ProductService();
			List<Product> list = productService.search(pname);
			//页面跳转
			request.setAttribute("list", list);
			request.getRequestDispatcher("/jsp/product_list.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
