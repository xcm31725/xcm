package com.itheima_02;

/*
*	&&��&������
*		&&��������false���ұ߲�ִ�С�&&�ж�·Ч��
*		&���������false��true���ұ߶�ִ�С�	
*/

public class OperatorDemo04 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		// &&  ��false��false
		System.out.println((a>b) && (a>c));
		System.out.println((a>b) && (a<c));
		System.out.println((a<b) && (a>c));
		System.out.println((a<b) && (a<c));
		System.out.println("-----------------------------");
		
		// || ��true��true
		System.out.println((a>b) || (a>c));
		System.out.println((a>b) || (a<c));
		System.out.println((a<b) || (a>c));
		System.out.println((a<b) || (a<c));
		System.out.println("-----------------------------");
		
		
	}

}
