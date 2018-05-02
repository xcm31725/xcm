package cn.itcast.test;

import org.junit.Test;

import cn.itcast.cglb.CglbProxyFactory;
import cn.itcast.jdk.JDKProxyFactory;
import cn.itcast.service.IUserService;
import cn.itcast.service.UserServiceImpl;

public class ProxyTest {
	@Test 
	public void test1() {
		//创建目标对象
		IUserService user = new UserServiceImpl();
		//创建代理对象
		JDKProxyFactory proxy = new JDKProxyFactory(user);
		
		IUserService create = (IUserService) proxy.createProxy();
		create.login("XCM","317");
	}
	
	@Test 
	public void test2() {
		//创建目标对象
		IUserService user = new UserServiceImpl();
		//创建代理对象
		CglbProxyFactory factory = new CglbProxyFactory(user);
		UserServiceImpl create = (UserServiceImpl) factory.createProxy();
		create.regist();
	}
}
