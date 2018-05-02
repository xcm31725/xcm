package com.itheima.listener.weblistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * ServletContextListener
 * @author sudong
 * * 事件源：ServletContextListener
 * * 监听器：MyServletContextListener
 * * 事件源和监听器的绑定：通过配置方式绑定
 */
public class MyServletContextListener implements ServletContextListener{
	
	@Override
	//监听ServletContext对象的创建
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext对象被创建了...");
	}

	@Override
	//监听ServletContext对象的销毁
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext对象被销毁了...");
	}

}
