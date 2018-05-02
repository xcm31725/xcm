package com.itheima.store.web.servlet;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.DbUtils;

import com.itheima.store.domain.Category;
import com.itheima.store.service.CategoryService;
import com.itheima.store.utils.BeanFactory;
import com.itheima.store.utils.BeanServlet;
import com.itheima.store.utils.UUIDUtils;

/**
 * 后台分类管理的Servlet
 */
public class AdminCategoryServlet extends BeanServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 后台页面的查询所有分类的执行方法
	 * @param req
	 * @param resp
	 * @return
	 */
	public String findAll(HttpServletRequest req,HttpServletResponse resp){
		try {
			CategoryService categoryService = (CategoryService) BeanFactory.getBean("categoryService");
			List<Category> list = categoryService.findAll();
			//存入req域中
			req.setAttribute("list", list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "/admin/category/list.jsp";
	}

	/**
	 * 跳转到添加分类的页面执行的方法:saveUI
	 * @param req
	 * @param resp
	 * @return
	 */
	public String saveUI(HttpServletRequest req,HttpServletResponse resp){
		return "/admin/category/add.jsp";
	}
	
	/**
	 * 保存分类的执行的方法:save
	 * @param req
	 * @param resp
	 * @return
	 */
	public String save(HttpServletRequest req,HttpServletResponse resp){
		try {
			String cname = req.getParameter("cname");
			//封装数据
			Category category = new Category();
			category.setCid(UUIDUtils.getUUID());
			category.setCname(cname);
			//调用业务层
			CategoryService categoryService = (CategoryService) BeanFactory.getBean("categoryService");
			categoryService.save(category);
			
			resp.sendRedirect(req.getContextPath()+"/AdminCategoryServlet?method=findAll");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 编辑分类的执行方法：edit
	 * @param req
	 * @param resp
	 * @return
	 */
	public String edit(HttpServletRequest req,HttpServletResponse resp){
		try {
			String cid = req.getParameter("cid");
			
			CategoryService categoryService = (CategoryService) BeanFactory.getBean("categoryService");
			Category category = categoryService.fingById(cid);
			
			req.setAttribute("category", category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/admin/category/edit.jsp";
	} 
	
	/**
	 * 修改分类的执行方法：update
	 * @param req
	 * @param resp
	 * @return
	 */
	public String update(HttpServletRequest req,HttpServletResponse resp){
		try {
			//接收参数
			Map<String,String[]> map = req.getParameterMap();
			//封装数据
			Category category = new Category();
			BeanUtils.populate(category, map);
			//数据处理
			CategoryService categoryService = (CategoryService) BeanFactory.getBean("categoryService");
			categoryService.update(category);
			//页面跳转
			resp.sendRedirect(req.getContextPath()+"/AdminCategoryServlet?method=findAll");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 删除分类的执行方法：delete
	 * @param req
	 * @param resp
	 * @return
	 */
	public String delete(HttpServletRequest req,HttpServletResponse resp){
		try {
			String cid = req.getParameter("cid");
			
			CategoryService categoryService = (CategoryService) BeanFactory.getBean("categoryService");
			categoryService.delete(cid);
			
			resp.sendRedirect(req.getContextPath()+"/AdminCategoryServlet?method=findAll");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
}











