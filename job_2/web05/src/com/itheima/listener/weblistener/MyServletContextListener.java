package com.itheima.listener.weblistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * ServletContextListener
 * @author sudong
 * * �¼�Դ��ServletContextListener
 * * ��������MyServletContextListener
 * * �¼�Դ�ͼ������İ󶨣�ͨ�����÷�ʽ��
 */
public class MyServletContextListener implements ServletContextListener{
	
	@Override
	//����ServletContext����Ĵ���
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ServletContext���󱻴�����...");
	}

	@Override
	//����ServletContext���������
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ServletContext����������...");
	}

}
