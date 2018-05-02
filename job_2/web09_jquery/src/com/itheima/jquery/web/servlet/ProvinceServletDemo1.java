package com.itheima.jquery.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.jquery.domain.Province;
import com.itheima.jquery.service.ProvinceService;

import net.sf.json.JSONArray;

/**
 * 
 */
public class ProvinceServletDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProvinceService provinceService = new ProvinceService();
		try {
			List<Province> list = provinceService.findAll();
			JSONArray jsonArray = JSONArray.fromObject(list);
			System.out.println(jsonArray.toString());
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().print(jsonArray.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
