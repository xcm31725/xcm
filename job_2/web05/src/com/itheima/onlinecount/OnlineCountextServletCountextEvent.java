package com.itheima.onlinecount;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class OnlineCountextServletCountextEvent implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sec) {
	}

	@Override
	public void contextInitialized(ServletContextEvent sec) {
		//在服务器启动的时候初始化一个值为0
		//还需要将这个值存入到ServletContext中。
		sec.getServletContext().setAttribute("count", 0);
	}

}
