package com.itheima.jquery.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.jquery.domain.City;
import com.itheima.jquery.domain.Province;
import com.itheima.jquery.service.ProvinceService;
import com.thoughtworks.xstream.XStream;

/**
 * 
 */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//接收收据
			String pid = request.getParameter("pid");
			//System.out.println(pid);
			//调用业务层查询所有的市的信息
			ProvinceService provinceServince = new ProvinceService();
			List<City> list = provinceServince.findByPid(pid);
			//System.out.println(list);
			
			//将List集合生成XML：
			XStream xStream = new XStream();
			//修改标签名：
			xStream.alias("city", City.class);
			//将类中属性作为 标签的属性
			/*xStream.useAttributeFor(City.class, "cid");
			xStream.useAttributeFor(City.class, "cname");
			xStream.useAttributeFor(City.class, "pid");*/
			
			String xmlStr = xStream.toXML(list);
			//System.out.println(xmlStr);
			response.setContentType("text/xml;charset=utf-8");
			response.getWriter().println(xmlStr);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
