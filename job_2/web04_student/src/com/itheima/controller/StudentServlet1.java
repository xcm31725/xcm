package com.itheima.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Student;
import com.itheima.model.StudentModel1;

/**
 * 吧数据库中的表显示到JSP页面上
 */
public class StudentServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//处理数据
			StudentModel1 studentMedol = new StudentModel1();
			List<Student> list = studentMedol.findAll();
			//把数据显示到JSP页面上
			request.setAttribute("list", list);
			request.getRequestDispatcher("/jsp/list1.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
