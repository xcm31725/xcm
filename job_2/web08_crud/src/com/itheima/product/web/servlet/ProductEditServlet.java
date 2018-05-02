package com.itheima.product.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.product.domain.Product;
import com.itheima.product.service.ProductService;

/**
 * 商品编辑的Servlet
 */
public class ProductEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 接收数据:
		 * 调用业务层处理数据:
		 * 页面跳转
		 */
		try {
			//接收数据
			String pid = request.getParameter("pid");
			//调用业务逻辑层
			ProductService productService = new ProductService();
			Product product = productService.findById(pid);
			//页面跳转
			request.setAttribute("product", product);
			request.getRequestDispatcher("/jsp/editProduct.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
