package com.itheima.store.web.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.store.domain.Category;
import com.itheima.store.service.CategoryService;
import com.itheima.store.service.impl.CategoryServiceImpl;
import com.itheima.store.utils.BeanFactory;
import com.itheima.store.utils.BeanServlet;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class CategoryServlet
 */
public class CategoryServlet extends BeanServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 查询所有分类的Servlet的执行的方法:findAll
	 * @param req
	 * @param resp
	 * @return
	 */
	public String findAll(HttpServletRequest req,HttpServletResponse resp){
		try {
			CategoryService categoryService = (CategoryService) BeanFactory.getBean("categoryService");
			List<Category> list = categoryService.findAll();
			
			//把数据转换成JSON
			JSONArray jsonArray = JSONArray.fromObject(list);
			System.out.println(jsonArray.toString());
			
			resp.getWriter().println(jsonArray.toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return null;
	}
	
}
