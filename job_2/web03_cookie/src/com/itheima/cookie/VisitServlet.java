package com.itheima.cookie;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.utils.CookieUtils;

/**
 * 记录用户上次询问时间的Servlet
 */
public class VisitServlet extends HttpServlet {
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
		Cookie cookie = CookieUtils.findCookie(cookies, "lastVisit");
		//判断是否是第一次访问：
		if(cookie == null) {
			//是第一次访问
			//显示到页面上一段内容
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>您好，欢迎来到本网站！</h1>");
		}else {
			//不是第一次访问
			//获得cookie中的上次访问时间，显示到页面
			String value = cookie.getValue();
			//显示到页面上一段内容：
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>您好，您的上次访问时间为："+value+"</h1>");
		}
		//记录当前系统时间存入到cookie，会写到浏览器
		Date d  = new Date();
		//存入到cookie：
		Cookie c = new Cookie("lastVisit",d.toLocaleString());
		//给Cookie设置有效路径
		c.setPath("/web03_cookie");
		//给Cookie设置有效时长
		c.setMaxAge(60 * 60);//设置有效时长为1小时 
		//会写到浏览器
		response.addCookie(c);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
