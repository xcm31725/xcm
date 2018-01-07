package com.itheima_01;
/*
 * 被private修饰的成员变量在本类中可以直接访问，
 * 在其他类中只能通过方法间接的访问（setXxx（）和getXxx（）访问），
 * 如果通过方法访问，那么我们就可以在方法中撰写一些
 * 判断安全性的代码，从而提高了项目的安全性
 * */
public class Student {
	String name;
	private int age;
	
	public void setAge(int a){
		if(a<0&&a>200){
			System.out.println("你输入的年龄有误");
		}else{
			age = a;
		}
	}
	
	public int getAge(){
		return age;
	}
	
	public void show(){
		System.out.println("我的名字是："+name+",我的年龄是："+age);
	}
}
