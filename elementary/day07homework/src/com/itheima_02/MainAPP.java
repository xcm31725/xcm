package com.itheima_02;

import java.util.Scanner;

public class MainAPP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入学员编号：");
		String str1 = sc.next(); 
		
		System.out.print("请输入学员姓名：");
		String str2 = sc.next(); 
		
		System.out.print("请输入学员性别：");
		String str3 = sc.next(); 
		
		System.out.print("请输入学员身高：");
		double d = sc.nextDouble(); 
		
		System.out.print("请输入学员年龄：");
		int i = sc.nextInt(); 
		
		Student s = new Student(str1,str2,str3,d,i);
		
		System.out.println("学员编号："+s.getXueYuaBianHao()+",姓名："+s.getName()+",性别："+s.getXingBei()+",身高："+s.getHight()+",年龄："+s.getAge());
	}

}
