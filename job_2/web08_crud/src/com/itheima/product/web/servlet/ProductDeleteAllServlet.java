package com.itheima.product.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.product.service.ProductService;

/**
 * 删除多条记录的Servlet
 */
public class ProductDeleteAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收数组
		String[] sid = request.getParameterValues("sid");
		//调用业务层
		ProductService productServict = new ProductService();
		productServict.delectAll(sid);
 		//页面跳转
		request.getRequestDispatcher("/ProductFindAllServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
