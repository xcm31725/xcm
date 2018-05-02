package com.itheima.onlinecount;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HTTPSessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		//在线了
		HttpSession session = se.getSession();
		System.out.println(session.getId()+"上线了...");
		//获得ServletContext中的值
		Integer count = (Integer)session.getServletContext().getAttribute("count");
		count++;
		session.getServletContext().setAttribute("count", count);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		//下线了
		HttpSession session = se.getSession();
		System.out.println(session.getId()+"下线了...");
		//获得ServletContext中的值
		Integer count = (Integer)session.getServletContext().getAttribute("count");
		count--;
		session.getServletContext().setAttribute("count", count);
	}

}
