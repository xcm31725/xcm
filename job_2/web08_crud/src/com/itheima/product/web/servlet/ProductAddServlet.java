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
import com.itheima.utils.UUIDUtils;

/**
 * 添加数据
 */
public class ProductAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 接收参数：
		 * 封装数据：
		 * 调用业务层：
		 * 页面跳转：
		 */
		
		try {
			//接收参数
			request.setCharacterEncoding("UTF-8");
			//判断是否为空
			String token1 = (String) request.getSession().getAttribute("token");
			String token2 = request.getParameter("token");
			//清空session域中的令牌
			request.getSession().removeAttribute("token");
			if(!token2.equals(token1)) {
				request.setAttribute("msg", "亲！您已经提交过！请不要重复提交");
				request.getRequestDispatcher("/jsp/msg.jsp").forward(request, response);
				return;
			}
			
			Map<String,String[]> map = request.getParameterMap();
			//封装数据
			Product product = new Product();
			BeanUtils.populate(product, map);
			product.setPid(UUIDUtils.getUUID());
			product.setPdate(new Date());
			//调用业务层
			ProductService productService = new ProductService();
			productService.save(product);
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
