package com.itheima.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			
			//һ������֤���У��
			//������֤��
			String checkcode = request.getParameter("checkcode");
			//��session�л�ȡһ������֤���ֵ
			String checkcode2 = (String)request.getSession().getAttribute("checkcode");
			//Ϊ�˱�֤��֤��ʹ��һ�Σ�Ӧ�ý�session�е���֤��ֵ���
			request.getSession().removeAttribute("checkcode");
			//У��һ������֤�룺
			if(!checkcode.equalsIgnoreCase(checkcode2)) {
				request.setAttribute("msg", "��֤���������");
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return;
			}
			//2.��װ����
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			//3.��������
			UserModel userModel = new UserModel();
			User existUser = userModel.login(user);
			//4.ҳ����ת
			if(existUser == null) {
				//��¼ʧ��
				request.setAttribute("msg","�û������������");
				//ʹ������ת������ҳ����ת
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			} else {
				//��¼�ɹ�
				//�����û�����Ϣ�����浽�Ự���С�
				HttpSession session = request.getSession();
				//�������ݣ�
				session.setAttribute("existUser", existUser);
				//��ס�û���
				//�жϸ�ѡ���Ƿ�ѡ
				String remember = request.getParameter("remember");
				if("true".equals(remember)) {
					//�ѹ�ѡ
					Cookie c = new Cookie("remember",existUser.getUsername());
					//����·��
					c.setPath("/web02_login");
					//������Чʱ��
					c.setMaxAge(60 * 60 * 24);
					//��������
					response.addCookie(c);
				}
				//�ض������ҳ����ת
				response.sendRedirect("/web02_login/success.jsp");
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
