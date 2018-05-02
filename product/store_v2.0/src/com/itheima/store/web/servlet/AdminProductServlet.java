package com.itheima.store.web.servlet;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.store.domain.Category;
import com.itheima.store.domain.PageBean;
import com.itheima.store.domain.Product;
import com.itheima.store.service.CategoryService;
import com.itheima.store.service.ProductService;
import com.itheima.store.utils.BeanFactory;
import com.itheima.store.utils.BeanServlet;

/**
 * 后台商品管理的Servlet
 */
public class AdminProductServlet extends BeanServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 商品分页查询的Servlet
	 * @param req
	 * @param resp
	 * @return
	 */
	public String findByPage(HttpServletRequest req,HttpServletResponse resp){
		try {
			//接收参数
			Integer currPage = Integer.parseInt(req.getParameter("currPage"));
			//处理数据
			ProductService productService = (ProductService) BeanFactory.getBean("productService");
			PageBean<Product> pageBean = productService.findByPage(currPage);
			
			req.setAttribute("pageBean", pageBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/admin/product/list.jsp";
	}
	
	/**
	 * 跳转到添加商品页面的执行方法：saveUI
	 * @param req
	 * @param resp
	 * @return
	 */
	public String saveUI(HttpServletRequest req,HttpServletResponse resp){
		try {
			//查询所有商品
			CategoryService categoryService = (CategoryService) BeanFactory.getBean("categoryService");
			List<Category> list = categoryService.findAll();
			
			req.setAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/admin/product/add.jsp";
	}
	
	/**
	 * 下架商品的执行方法：pushDown
	 * @param req
	 * @param resp
	 * @return
	 */
	public String pushDown(HttpServletRequest req,HttpServletResponse resp){
		try {
			String pid = req.getParameter("pid");
			
			ProductService productService = (ProductService) BeanFactory.getBean("productService");
			Product product = productService.findByPid(pid);
			product.setPflag(1);
			
			productService.update(product);
			
			resp.sendRedirect(req.getContextPath()+"/AdminProductServlet?method=findByPage&currPage=1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 查询已下架商品：findByPushDown
	 * @param req
	 * @param resp
	 * @return
	 */
	public String findByPushDown(HttpServletRequest req,HttpServletResponse resp){
		try{
			// 调用业务层:
			ProductService productService = (ProductService) BeanFactory.getBean("productService");
			List<Product> list = productService.findByPushDown();
			req.setAttribute("list", list);
			}catch(Exception e){
				e.printStackTrace();
			}
			return "/admin/product/pushDown_list.jsp";
	}
	
	/**
	 * 上架商品:
	 * @param req
	 * @param resp
	 * @return
	 */
	public String pushUp(HttpServletRequest req,HttpServletResponse resp){
		try{
			// 接收参数:
			String pid = req.getParameter("pid");
			// 调用业务层:
			ProductService productService = (ProductService) BeanFactory.getBean("productService");
			Product product = productService.findByPid(pid);
			product.setPflag(0);
			
			productService.update(product);
			
			resp.sendRedirect(req.getContextPath()+"/AdminProductServlet?method=findByPage&currPage=1");
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}












