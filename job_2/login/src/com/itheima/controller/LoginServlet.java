package com.itheima.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domian.User;
import com.itheima.model.UserModel;

/**
 * ��¼ҳ���Servlet
 */
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//1.��ȡ����
			//���ñ��뼯
			request.setCharacterEncoding("utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			//2.��װ����
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			//3.��������
			UserModel userModel = new UserModel();
			User exisUser = userModel.login(user);
			//4.ҳ����ת
			if(exisUser == null) {
				//��¼ʧ��
				request.setAttribute("msg","�û������������");
				//ʹ������ת������ҳ����ת
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			} else {
				//��¼�ɹ�
				//��¼��¼�ɹ�������
				//��ServletContext�еĵ�ֵȡ��+1
				int count = (int)this.getServletContext().getAttribute("count");
				//������+1�Ĳ���
				count++;
				//��+1���ֵ��ص�ServletContext��ȥ��
				this.getServletContext().setAttribute("count", count);
				//�ض������ҳ����ת
				response.sendRedirect("/login/success.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
