package com.itheima.listener.weblistener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * 监听HTTPSession的创建和销毁的监听器
 * @author sudong
 */
public class MyHttpSessionListener implements HttpSessionListener{

	@Override
	//监听HTTPSession的创建
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("HTTPSession对象创建了...");
	}

	@Override
	//监听HTTPSession的销毁
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("HTTPSession对象销毁了...");
	}

}
