package com.itheima.b_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * @ClassName: ProxyDemo1  
 * @Description: TODO  ������ 
 * @author sudong
 */
public class ProxyDemo1 {
	
	@Test
	public void demo1(){
		Waiter waiter = new Waitress();
		//waiter.server();
		
		// ʹ�ö�̬����:Proxy.newProxyInstance();
		/**
		 * ClassLoader :�������.
		 * Class[]     :����ǿ�Ķ���ʵ�ֵ����нӿ�
		 * InvocationHandler	:������.
		 */
		
		//��һ������
		ClassLoader classloader = waiter.getClass().getClassLoader();
		//�ڶ�������
		Class[] interfaces = waiter.getClass().getInterfaces();
		//����������
		
		Waiter waiter2 = (Waiter) Proxy.newProxyInstance(classloader, interfaces, new MyInvocationHandler(waiter));
		//waiter2.server();
		// ˵�����ڵ��ô��������κη�����ʱ��,InvocationHandler�е�invoke����ִ��.
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
	 * �����Ĳ���:
	 * * proxy	:�����Ĵ������.
	 * * method	:��ǰ���ڵ��õ�Ŀ����ķ���.
	 * * params	:����ִ�еķ����еĲ���.
	 */
	public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
		//System.out.println("xcm,xcm....");
		//waiter.server();
		//waiter.sayHello("XCM");
		if("server".equals(method.getName())) {
			System.out.println("΢Ц=========");
			Object obj = method.invoke(waiter, params);
			System.out.println("�װ�=========");
			return obj;
		} else {
			return method.invoke(waiter, params);
		}
	}
	
}
