package com.itheima.product.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.product.service.ProductService;

/**
 * 商品删除的Servlet
 */
public class ProductDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 接收id
		 * 调用业务层
		 * 页面跳转
		 */
		try {
			//接收收据
			String pid = request.getParameter("pid");
			//调用业务逻辑层
			ProductService productService = new ProductService();
			productService.delete(pid);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		//页面跳转
		request.getRequestDispatcher("/ProductFindAllServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
