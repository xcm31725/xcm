package com.itheima.cookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.utils.CookieUtils;

/**
 * ��¼�û��ϴ�ѯ��ʱ���Servlet
 */
public class VisitServlet extends HttpServlet {
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
		Cookie cookie = CookieUtils.findCookie(cookies, "lastVisit");
		//�ж��Ƿ��ǵ�һ�η��ʣ�
		if(cookie == null) {
			//�ǵ�һ�η���
			//��ʾ��ҳ����һ������
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>���ã���ӭ��������վ��</h1>");
		}else {
			//���ǵ�һ�η���
			//���cookie�е��ϴη���ʱ�䣬��ʾ��ҳ��
			String value = cookie.getValue();
			//��ʾ��ҳ����һ�����ݣ�
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>���ã������ϴη���ʱ��Ϊ��"+value+"</h1>");
		}
		//��¼��ǰϵͳʱ����뵽cookie����д�������
		Date d  = new Date();
		//���뵽cookie��
		Cookie c = new Cookie("lastVisit",d.toLocaleString());
		//��Cookie������Ч·��
		c.setPath("/web03_cookie");
		//��Cookie������Чʱ��
		c.setMaxAge(60 * 60);//������Чʱ��Ϊ1Сʱ 
		//��д�������
		response.addCookie(c);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
