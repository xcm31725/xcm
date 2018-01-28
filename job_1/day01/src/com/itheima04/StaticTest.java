package com.itheima04;

public class StaticTest {
	static {
		System.out.println("StaticTest静态代码块");
	}
	
	{
		System.out.println("StaticTest局部代码块");
	}
	public static void main(String[] args) {
		Static s = new Static();
	}

}

class Static{
	static {
		System.out.println("Static静态代码块");
	}
	
	public Static() {
		System.out.println("Static构造代码块");
	}
	
	{
		System.out.println("Static局部代码块");
	}
}