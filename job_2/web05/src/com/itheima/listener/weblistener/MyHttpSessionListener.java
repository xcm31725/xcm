package com.itheima.listener.weblistener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * ����HTTPSession�Ĵ��������ٵļ�����
 * @author sudong
 */
public class MyHttpSessionListener implements HttpSessionListener{

	@Override
	//����HTTPSession�Ĵ���
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("HTTPSession���󴴽���...");
	}

	@Override
	//����HTTPSession������
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("HTTPSession����������...");
	}

}
