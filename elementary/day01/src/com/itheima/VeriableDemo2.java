package com.itheima;

public class VeriableDemo2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		
		int d = 50;
		System.out.println(d);
		{
			//int d = 40;//这样会报错因为上面已经定义
			int c = 30;
			System.out.println(c);
			System.out.println(d);
		}
		int c = 40;//这样是可以的因为在这还没执行到
		System.out.println(c);
	}

}
