package com.itheima.store.web.servlet;

import java.sql.SQLException;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;

import com.itheima.store.domain.User;
import com.itheima.store.service.ProductService;
import com.itheima.store.service.UserService;
import com.itheima.store.service.impl.UserServiceImpl;
import com.itheima.store.utils.BeanFactory;
import com.itheima.store.utils.BeanServlet;
import com.itheima.store.utils.MyDateConverter;

/**
 * 用户模块的Servlet
 */
public class UserServlet extends BeanServlet {
	private static final long serialVersionUID = 1L;
      
	/**
	 * 跳转到注册页面的执行的方法：register
	 */
	public String registUI(HttpServletRequest req, HttpServletResponse reps) {
		return "/jsp/regist.jsp";
	}
	
	/**
	 * 异步校验用户名的执行方法：checkUsername
	 */
	public String checkUsername(HttpServletRequest req, HttpServletResponse reps) {
		try {
			//接收参数
			String username = req.getParameter("username");
			//调用业务层：
			UserService userService = (UserService) BeanFactory.getBean("userService");
			User existUser = userService.findByUsername(username);
			if(existUser == null) {
				//用户名可用
				reps.getWriter().println("1");
			}else {
				//用户名不可用
				reps.getWriter().println("2");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return null;
	}
	
	/**
	 * 用户注册的执行的方法:regist
	 * @param req
	 * @param reps
	 * @return
	 */
	public String regist(HttpServletRequest req, HttpServletResponse reps) {
		try {
			Map<String, String[]> map = req.getParameterMap();
			User user = new User();
			ConvertUtils.register(new MyDateConverter(), Date.class);
			BeanUtils.populate(user, map);
			//调用业务层
			UserService userService = (UserService) BeanFactory.getBean("userService");
			userService.save(user);
			//页面跳转
			req.setAttribute("msg", "注册成功请去邮箱激活！");
			return "/jsp/msg.jsp";
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	/**
	 * 用户激活的方法
	 * @param req
	 * @param resp
	 * @return
	 * @throws SQLException 
	 */
	public String active(HttpServletRequest req,HttpServletResponse resp) {
		try {
			//接收激活码
			String code = req.getParameter("code");
			//根据激活码查询
			UserService userService = (UserService) BeanFactory.getBean("userService");
			User existUser = userService.findByCode(code);
			
			if(existUser == null) {
				//激活码失败
				req.setAttribute("msg", "激活码有误，请从新激活！");
			} else {
				//激活操作
				existUser.setState(2);//设置激活码状态
				existUser.setCode(null);
				userService.update(existUser);
				req.setAttribute("msg", "激活成功！请去登录！");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return "/jsp/msg.jsp";
	}
	
	/**
	 * 跳转到登录页面的执行的方法:loginUI
	 * @param req
	 * @param reps
	 * @return
	 */
	public String loginUI(HttpServletRequest req, HttpServletResponse reps) {
		return "/jsp/login.jsp";
	}
	
	/**
	 * 用户登录的执行的方法:login
	 * @param req
	 * @param resp
	 * @return
	 */
	public String login(HttpServletRequest req,HttpServletResponse resp){
		
		try {
			//一次性验证码程序
			String code1 = req.getParameter("code");
			String code2 = (String) req.getSession().getAttribute("code");
			req.getSession().removeAttribute("code");
			if(!code1.equalsIgnoreCase(code2)) {
				req.setAttribute("msg", "验证码输入错误！");
				return "/jsp/login.jsp";
			}
			
			Map<String, String[]> map = req.getParameterMap();
			User user = new User();
			BeanUtils.populate(user, map);
			// String username = req.getParameter("username");
			 //String password = req.getParameter("password");
			
			//System.out.println(user.getPassword());
			//System.out.println(user.getUsername());
			UserService userService = (UserService) BeanFactory.getBean("userService");
			User existUser = userService.login(user);
			
			if(existUser == null) {
				req.setAttribute("msg", "用户名或密码错误或用户未激活！");
				return "/jsp/login.jsp";
			} else {
				//登录成功：自动登录：
				String autoLogin = req.getParameter("autoLogin");
				if("true".equals(autoLogin)) {
					Cookie cookie = new Cookie("autoLogin", existUser.getUsername()+ "#" + existUser.getPassword());
					cookie.setPath("/store_v2.0");
					cookie.setMaxAge(7 * 24 * 60 * 60);
					resp.addCookie(cookie);
				}
				
				//记住用户名：
				String remember = req.getParameter("remember");
				if("true".equals(remember)) {
					Cookie cookie = new Cookie("username", existUser.getUsername());
					cookie.setPath("/store_v2.0");
					cookie.setMaxAge(24 * 60 * 60);
					resp.addCookie(cookie);
				}
				
				req.getSession().setAttribute("existUser", existUser);
				resp.sendRedirect(req.getContextPath() + "/index.jsp");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
	/**
	 * 
	 * @param req
	 * @param resp
	 * @return
	 */
	public String logOut(HttpServletRequest req,HttpServletResponse resp){
		try {
			//销毁session
			req.getSession().invalidate();
			
			//销毁自动登录中的cookie
			Cookie cookie = new Cookie("autoLogin", "");
			cookie.setPath("/store_v2.0");
			cookie.setMaxAge(0);
			resp.addCookie(cookie);
			
			resp.sendRedirect(req.getContextPath() + "/index.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
}