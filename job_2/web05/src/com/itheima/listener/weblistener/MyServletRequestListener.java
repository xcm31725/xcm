package com.itheima.listener.weblistener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
/**
 * 监听ServletRequest对象的创建和销毁的监听器
 * @author sudong
 */
public class MyServletRequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("ServletRequest对象被销毁了...");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("ServletRequest对象被销毁了...");
	}
	
}
