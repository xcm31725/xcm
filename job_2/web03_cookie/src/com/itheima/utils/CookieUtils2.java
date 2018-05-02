package com.itheima.utils;

import javax.servlet.http.Cookie;

public class CookieUtils2 {
	public static Cookie findCookie(Cookie[] cookies,String name){
		
		if(cookies == null) {
			//浏览器没有携带Cookie
			return null;
		} else{
			for (Cookie cookie : cookies) {
				//判断数组中的每个Cookie的名称是否与给定的名称相同
				if(name.equals(cookie.getName())) {
					return cookie;
				}
			}
			//浏览器携带Cookie但没有找到匹配的Cookie
			return null;
		}
		
		
	}
}
