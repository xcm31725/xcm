package com.itheima_02;

/*
*	&&和&的区别
*		&&如果左边是false，右边不执行。&&有短路效果
*		&无论左边是false或true，右边都执行。	
*/

public class OperatorDemo04 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// &&  有false则false
		System.out.println((a>b) && (a>c));
		System.out.println((a>b) && (a<c));
		System.out.println((a<b) && (a>c));
		System.out.println((a<b) && (a<c));
		System.out.println("-----------------------------");
		
		// || 有true则true
		System.out.println((a>b) || (a>c));
		System.out.println((a>b) || (a<c));
		System.out.println((a<b) || (a>c));
		System.out.println((a<b) || (a<c));
		System.out.println("-----------------------------");
		
		
	}

}
