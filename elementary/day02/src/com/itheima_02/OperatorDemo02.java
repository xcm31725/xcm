package com.itheima_02;

public class OperatorDemo02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		
		//自动类型提升
		double d = 10.0;
		boolean bo = a == d;
		System.out.println(bo);
		System.out.println("-------------------");
		
		// ==
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println("-------------------");
		
		// !=
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println("-------------------");
		
		// >
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("-------------------");
		
		// >=
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("-------------------");
		
		
		// <
		System.out.println(a < b);
		System.out.println(a < c);
		System.out.println("-------------------");
		
		//<=
		System.out.println(a <= b);
		System.out.println(a <= c);
	}

}
