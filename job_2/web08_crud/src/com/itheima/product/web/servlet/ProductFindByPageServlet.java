package com.itheima.product.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.product.domain.PageBean;
import com.itheima.product.service.ProductService;

/**
 * 分页查询商品的Servlet
 */
public class ProductFindByPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// 接收数据:
			int currPage =  Integer.parseInt(request.getParameter("currPage"));
			// 调用业务层处理数据:
			ProductService productService = new ProductService();
			PageBean pageBean = productService.findByPage(currPage);
			// 将需要的数据保存到request中带到页面:
			request.setAttribute("pageBean", pageBean);
			request.getRequestDispatcher("/jsp/product_page.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
