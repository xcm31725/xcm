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
 * 处理添加学生信息
 */
public class AddStudentAction extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1、设置请求编码 响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//2、从页面接收提交的学生信息
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");		
		double math = Double.valueOf(request.getParameter("math"));
		double english = Double.valueOf(request.getParameter("english"));
		double chinses = Double.valueOf(request.getParameter("chinese"));
		
		//3、将接收的信息构建成一个学生对象
		Student addStu = new Student();
		addStu.setName(name);
		addStu.setSex(sex);
		addStu.setMath(math);
		addStu.setEnglish(english);
		addStu.setChinses(chinses);
		
		//4、将构建出来的学生对象添加到数据库student表中
		IStudentDao dao = new StudentDaoImpl();
		boolean result = dao.addStudent(addStu);
		if(result){//插入学生对象成功
			//重定向到showStudent.jsp页面
			response.sendRedirect("showStudent.jsp");
		}
	}
}








