package com.itheima_03;

import java.util.*;

public class ScannerTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.print("������һ������");
		
		int a = sc.nextInt();
		
		String str = (a%2==0)?"ż��":"����";
		
		System.out.println("�����Ϊ��"+str);

	}

}
