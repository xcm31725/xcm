package com.itheima.utils;

import javax.servlet.http.Cookie;

public class CookieUtils2 {
	public static Cookie findCookie(Cookie[] cookies,String name){
		
		if(cookies == null) {
			//�����û��Я��Cookie
			return null;
		} else{
			for (Cookie cookie : cookies) {
				//�ж������е�ÿ��Cookie�������Ƿ��������������ͬ
				if(name.equals(cookie.getName())) {
					return cookie;
				}
			}
			//�����Я��Cookie��û���ҵ�ƥ���Cookie
			return null;
		}
		
		
	}
}
