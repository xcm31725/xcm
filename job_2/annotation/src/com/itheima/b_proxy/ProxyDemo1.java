package com.itheima.b_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * @ClassName: ProxyDemo1  
 * @Description: TODO  测试类 
 * @author sudong
 */
public class ProxyDemo1 {
	
	@Test
	public void demo1(){
		Waiter waiter = new Waitress();
		//waiter.server();
		
		// 使用动态代理:Proxy.newProxyInstance();
		/**
		 * ClassLoader :类加载器.
		 * Class[]     :被增强的对象实现的所有接口
		 * InvocationHandler	:处理类.
		 */
		
		//第一个参数
		ClassLoader classloader = waiter.getClass().getClassLoader();
		//第二个参数
		Class[] interfaces = waiter.getClass().getInterfaces();
		//第三个参数
		
		Waiter waiter2 = (Waiter) Proxy.newProxyInstance(classloader, interfaces, new MyInvocationHandler(waiter));
		//waiter2.server();
		// 说明现在调用代理对象的任何方法的时候,InvocationHandler中的invoke都会执行.
		String s = waiter2.sayHello("XCM");
		System.out.println(s);
	}
}

class MyInvocationHandler implements InvocationHandler{

	private Waiter waiter;

	public MyInvocationHandler(Waiter waiter) {
		this.waiter = waiter;
	}
	@Override
	/**
	 * 方法的参数:
	 * * proxy	:产生的代理对象.
	 * * method	:当前正在调用的目标类的方法.
	 * * params	:正在执行的方法中的参数.
	 */
	public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
		//System.out.println("xcm,xcm....");
		//waiter.server();
		//waiter.sayHello("XCM");
		if("server".equals(method.getName())) {
			System.out.println("微笑=========");
			Object obj = method.invoke(waiter, params);
			System.out.println("白白=========");
			return obj;
		} else {
			return method.invoke(waiter, params);
		}
	}
	
}
