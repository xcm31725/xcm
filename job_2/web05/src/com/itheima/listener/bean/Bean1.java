package com.itheima.listener.bean;

import java.io.Serializable;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class Bean1 implements HttpSessionActivationListener ,Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent arg0) {
		System.out.println("Bean1接session钝化了...");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		System.out.println("Bean1接session活化了...");
	}
}
