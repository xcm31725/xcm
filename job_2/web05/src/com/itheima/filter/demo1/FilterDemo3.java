package com.itheima.filter.demo1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo3 implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterDemo3执行了。。。");
		//放行
		chain.doFilter(request, response);
		System.out.println("FilterDemo3结束了。。。");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}


}
