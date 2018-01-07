package com.lanou.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lanou.dao.IStudentDao;
import com.lanou.dao.StudentDaoImpl;

public class DeleteStudentAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response)
			throws ServletException, IOException {
		//1、设置请求编码，响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//2、接收删除的id
		int id = Integer.valueOf(request.getParameter("id"));
		
		//3、调用dao删除数据
		IStudentDao dao = new StudentDaoImpl();
		boolean result = dao.deleteStudent(id);
		if(result){//删除成功，重定向到showStudent.jsp
			response.sendRedirect("showStudent.jsp");
		}
	}
}








