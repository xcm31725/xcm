package cn.itcast.cxf.rs.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import cn.itcast.cxf.domain.Car;
import cn.itcast.cxf.domain.User;
import cn.itcast.cxf.service.IUserService;
import cn.itcast.cxf.service.UserServiceImpl;

public class RS_Server {
	public static void main(String[] args) {
		IUserService userService = new UserServiceImpl();

		JAXRSServerFactoryBean restServer = new JAXRSServerFactoryBean();
		restServer.setResourceClasses(User.class, Car.class);
		restServer.setServiceBean(userService);
		restServer.setAddress("http://localhost:9999/");

		// 打印日志
		restServer.getInInterceptors().add(new LoggingInInterceptor());
		restServer.getOutInterceptors().add(new LoggingOutInterceptor());

		restServer.create();
	}
}
