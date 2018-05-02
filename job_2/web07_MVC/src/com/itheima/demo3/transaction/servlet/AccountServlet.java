package com.itheima.demo3.transaction.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.demo3.transaction.service.AccountService;

/**
 * 转账
 */
public class AccountServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//接收参数
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		Double money = Double.parseDouble(request.getParameter("money"));
		
		//处理数据
		AccountService accountService = new AccountService();
		accountService.transfer(from,to,money);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
