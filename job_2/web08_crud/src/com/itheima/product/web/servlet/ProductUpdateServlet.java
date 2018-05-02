package com.itheima.product.web.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.product.domain.Product;
import com.itheima.product.service.ProductService;

/**
 * 商品的修改页面
 */
public class ProductUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//接收数据
			request.setCharacterEncoding("utf-8");
			Map<String,String[]> map = request.getParameterMap();
			//封装数据
			Product product = new Product();
			BeanUtils.populate(product, map);
			product.setPdate(new Date());
			//调用业务层处理数据
			ProductService productService = new ProductService();
			productService.update(product);
			
			//页面跳转
			request.getRequestDispatcher("/ProductFindAllServlet").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
