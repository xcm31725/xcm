package com.itheima.listener.bean;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Bean implements HttpSessionBindingListener {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("Bean��session����...");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("Bean��session�������...");
	}

}
