package com.itheima.onlinecount;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class OnlineCountextServletCountextEvent implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sec) {
	}

	@Override
	public void contextInitialized(ServletContextEvent sec) {
		//�ڷ�����������ʱ���ʼ��һ��ֵΪ0
		//����Ҫ�����ֵ���뵽ServletContext�С�
		sec.getServletContext().setAttribute("count", 0);
	}

}
