package com.itheima.cookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.utils.CookieUtils2;

/**
 * Servlet implementation class VisitServlet1
 */
public class VisitServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 用户访问Servlet
		 * *如果是第一次访问
		 * 		*显示您好，欢迎来到本网站
		 * *如果不是第一次访问
		 * 		*从cookie中获得上次的时间，显示到页面
		 * 		*记录当前访问时间，存入到cookie，会写到浏览器
		 */
		//判断是否是第一次访问，从指定的cookie的数组中获取指定的cookie。
		//获得从浏览器带过来的所有的Cookie：
		Cookie[] cookies = request.getCookies();
		//从数组中找到指定名称的Cookie：
		Cookie cookie = CookieUtils2.findCookie(cookies, "lastVisit");
		//判断是否是第一次访问：
		if(cookie == null) {
			//是第一次
			//显示内容
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("您好，欢迎来到本网站！！！");
		} else{
			//不是第一次访问
			//获得cookie中的上次访问时间，显示到页面
			String value = cookie.getValue();
			//显示到页面上一段内容：
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("您好，您访问的时间为："+value+"");
		}
		//记录当前系统时间存入到cookie，会写到浏览器
		Date d = new Date();
		Cookie c = new Cookie("lastVisit",d.toLocaleString());
		//给Cookie设置有效的路径
		c.setPath("/web03_cookie");
		//给cookie设置有效时长
		c.setMaxAge(60 * 60);//参数为秒
		//会写到浏览器
		response.addCookie(c);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
