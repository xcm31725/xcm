package com.itheima_02;

public class OperatorDemo03 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// &  ��false��false
		System.out.println((a>b) & (a>c));
		System.out.println((a>b) & (a<c));
		System.out.println((a<b) & (a>c));
		System.out.println((a<b) & (a<c));
		System.out.println("-----------------------------");
		
		// | ��true��true
		System.out.println((a>b) | (a>c));
		System.out.println((a>b) | (a<c));
		System.out.println((a<b) | (a>c));
		System.out.println((a<b) | (a<c));
		System.out.println("-----------------------------");
		
		// ^ ��ͬΪfalse����ͬΪtrue
		System.out.println((a>b) ^ (a>c));
		System.out.println((a>b) ^ (a<c));
		System.out.println((a<b) ^ (a>c));
		System.out.println((a<b) ^ (a<c));
		System.out.println("-----------------------------");
		
		// ! true��false��false��true
		System.out.println((a>b));
		System.out.println(!(a>b));
		System.out.println(!!(a<b));
		System.out.println("-----------------------------");
	}

}
