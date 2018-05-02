package com.itheima.utils;

import javax.servlet.http.Cookie;

public class CookieUtils {
	public static Cookie findCookie(Cookie[] cookies,String name){
		if(cookies == null) {
			//�����û��Я���κε�Cookie
			return null;
		}else{
			for (Cookie cookie : cookies) {
				//�ж������е�ÿ��cookie������������������Ƿ�һ��
				if(name.equals(cookie.getName())) {
					//ֱ�ӷ���
					return cookie;
				}
			}
			//���������Cookie�����ˣ�����û��ָ�����Ƶ��Ǹ�Cookie
			return null;
		}
	}
}
