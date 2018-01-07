package com.itheima_02;

public class OperatorDemo03 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// &  有false则false
		System.out.println((a>b) & (a>c));
		System.out.println((a>b) & (a<c));
		System.out.println((a<b) & (a>c));
		System.out.println((a<b) & (a<c));
		System.out.println("-----------------------------");
		
		// | 有true则true
		System.out.println((a>b) | (a>c));
		System.out.println((a>b) | (a<c));
		System.out.println((a<b) | (a>c));
		System.out.println((a<b) | (a<c));
		System.out.println("-----------------------------");
		
		// ^ 相同为false，不同为true
		System.out.println((a>b) ^ (a>c));
		System.out.println((a>b) ^ (a<c));
		System.out.println((a<b) ^ (a>c));
		System.out.println((a<b) ^ (a<c));
		System.out.println("-----------------------------");
		
		// ! true则false，false则true
		System.out.println((a>b));
		System.out.println(!(a>b));
		System.out.println(!!(a<b));
		System.out.println("-----------------------------");
	}

}
