package com.itheima.product.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.product.domain.Product;
import com.itheima.product.service.ProductService;

/**
 * 查询所有商品的Servlet
 */
public class ProductFindAllServlet extends HttpServlet {
	/**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */ 
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 调用业务层
		 * 页面跳转
		 */
		//数据处理
		try {
			ProductService productService = new ProductService();
			List<Product> list = productService.findAll();
			
			//页面跳转
			request.setAttribute("list", list);
			request.getRequestDispatcher("/jsp/product_list.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
