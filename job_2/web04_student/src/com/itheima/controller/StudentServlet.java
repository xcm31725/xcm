package com.itheima.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Student;
import com.itheima.model.StudentModel;

/**
 * 在页面上显示Student的信息
 */
public class StudentServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//1.使用Java类处理数据
			StudentModel studentModel = new StudentModel();
			List<Student> list = studentModel.findAll();
			//2.显示在JSP页面
			request.setAttribute("list", list);
			request.getRequestDispatcher("/jsp/list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
