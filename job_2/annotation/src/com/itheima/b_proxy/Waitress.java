package com.itheima.b_proxy;
/**
 * @ClassName: Waitress  
 * @Description: TODO ��������ʵ����  
 * @author sudong
 */
public class Waitress implements Waiter {

	@Override
	public void server() {
		System.out.println("������");
	}

	@Override
	public String sayHello(String name) {
		return "Hello "+name;
	}

}
