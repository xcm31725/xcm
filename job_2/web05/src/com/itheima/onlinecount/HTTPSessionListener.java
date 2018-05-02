package com.itheima.onlinecount;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HTTPSessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		//������
		HttpSession session = se.getSession();
		System.out.println(session.getId()+"������...");
		//���ServletContext�е�ֵ
		Integer count = (Integer)session.getServletContext().getAttribute("count");
		count++;
		session.getServletContext().setAttribute("count", count);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		//������
		HttpSession session = se.getSession();
		System.out.println(session.getId()+"������...");
		//���ServletContext�е�ֵ
		Integer count = (Integer)session.getServletContext().getAttribute("count");
		count--;
		session.getServletContext().setAttribute("count", count);
	}

}
