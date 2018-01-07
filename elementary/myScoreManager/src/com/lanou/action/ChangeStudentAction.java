package com.lanou.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lan.entity.Student;
import com.lanou.dao.IStudentDao;
import com.lanou.dao.StudentDaoImpl;
/**
 * 修改学生信息
 */
public class ChangeStudentAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		//1、设置请求编码、响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//2、获取修改表单提交的数据
		int id = Integer.valueOf(request.getParameter("id"));
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		double math = Double.valueOf(request.getParameter("math"));
		double english = Double.valueOf(request.getParameter("english"));
		double chinses = Double.valueOf(request.getParameter("chinese"));
		
		//3、将修改表单提交的信息封装成一个对象
		Student stu = new Student(id, name, sex, math, english, chinses);
	
		//4、修改学生对象
		IStudentDao dao = new StudentDaoImpl();
		boolean result = dao.updateStudent(stu);
		if(result){//修改成功，重定向
			response.sendRedirect("showStudent.jsp");
		}	
	
	}
}