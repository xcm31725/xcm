package com.itheima;

import java.util.Scanner;

public class PeopleDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int i = sc.nextInt();
		
		People p = new People();
		//p.age = 20;
		//p.speak();
		//p.aa(-20);
		p.setAge(i);
		System.out.println(p.getAge());
	}
}
/*
 * private：私有，是一个权限修饰符。用于修饰成员。
 * 私有的内容只在本类中有效。
 * */

class People{
	private static  int age;
	
	public void setAge(int a){
		if((a>0)&&(a<200)){
			age = a;
		}else{
			System.out.println("请回火星吧！地球不适合你");
		}
	}
	public int getAge(){
		return age;
	}
	/*
	public  void aa(int a){
		if(a>0 && a<130){
			age = a;
			speak();
		}else{
			System.out.println("你输入的有误！");
		}
	}*/
	
	static void speak(){
		System.out.println("age:"+age);
	}
}
