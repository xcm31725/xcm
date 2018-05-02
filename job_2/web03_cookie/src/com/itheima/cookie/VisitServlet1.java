package com.itheima.cookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.utils.CookieUtils2;

/**
 * Servlet implementation class VisitServlet1
 */
public class VisitServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * �û�����Servlet
		 * *����ǵ�һ�η���
		 * 		*��ʾ���ã���ӭ��������վ
		 * *������ǵ�һ�η���
		 * 		*��cookie�л���ϴε�ʱ�䣬��ʾ��ҳ��
		 * 		*��¼��ǰ����ʱ�䣬���뵽cookie����д�������
		 */
		//�ж��Ƿ��ǵ�һ�η��ʣ���ָ����cookie�������л�ȡָ����cookie��
		//��ô�����������������е�Cookie��
		Cookie[] cookies = request.getCookies();
		//���������ҵ�ָ�����Ƶ�Cookie��
		Cookie cookie = CookieUtils2.findCookie(cookies, "lastVisit");
		//�ж��Ƿ��ǵ�һ�η��ʣ�
		if(cookie == null) {
			//�ǵ�һ��
			//��ʾ����
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("���ã���ӭ��������վ������");
		} else{
			//���ǵ�һ�η���
			//���cookie�е��ϴη���ʱ�䣬��ʾ��ҳ��
			String value = cookie.getValue();
			//��ʾ��ҳ����һ�����ݣ�
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("���ã������ʵ�ʱ��Ϊ��"+value+"");
		}
		//��¼��ǰϵͳʱ����뵽cookie����д�������
		Date d = new Date();
		Cookie c = new Cookie("lastVisit",d.toLocaleString());
		//��Cookie������Ч��·��
		c.setPath("/web03_cookie");
		//��cookie������Чʱ��
		c.setMaxAge(60 * 60);//����Ϊ��
		//��д�������
		response.addCookie(c);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
