package com.itheima.jquery.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.jquery.domain.City;
import com.itheima.jquery.service.ProvinceService;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

/**
 * 
 */
public class CityServletDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String pid = request.getParameter("pid");
			ProvinceService provinceService = new ProvinceService();
			List<City> list = provinceService.findByPid(pid);
			
			JsonConfig config = new JsonConfig();
			config.setExcludes(new String[]{"pid"});
			JSONArray jsonArray = JSONArray.fromObject(list, config);
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
