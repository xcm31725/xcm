package com.itheima_02;

import java.util.Scanner;

public class MainAPP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ѧԱ��ţ�");
		String str1 = sc.next(); 
		
		System.out.print("������ѧԱ������");
		String str2 = sc.next(); 
		
		System.out.print("������ѧԱ�Ա�");
		String str3 = sc.next(); 
		
		System.out.print("������ѧԱ��ߣ�");
		double d = sc.nextDouble(); 
		
		System.out.print("������ѧԱ���䣺");
		int i = sc.nextInt(); 
		
		Student s = new Student(str1,str2,str3,d,i);
		
		System.out.println("ѧԱ��ţ�"+s.getXueYuaBianHao()+",������"+s.getName()+",�Ա�"+s.getXingBei()+",��ߣ�"+s.getHight()+",���䣺"+s.getAge());
	}

}
