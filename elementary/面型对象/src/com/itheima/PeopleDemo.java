package com.itheima;

import java.util.Scanner;

public class PeopleDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������䣺");
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
 * private��˽�У���һ��Ȩ�����η����������γ�Ա��
 * ˽�е�����ֻ�ڱ�������Ч��
 * */

class People{
	private static  int age;
	
	public void setAge(int a){
		if((a>0)&&(a<200)){
			age = a;
		}else{
			System.out.println("��ػ��ǰɣ������ʺ���");
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
			System.out.println("�����������");
		}
	}*/
	
	static void speak(){
		System.out.println("age:"+age);
	}
}
