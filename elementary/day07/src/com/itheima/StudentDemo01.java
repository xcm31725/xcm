package com.itheima;

public class StudentDemo01 {

	public static void main(String[] args) {
		//创建对象
		Student s = new Student();
		
		//给成员变量赋值
		s.age = 23;
		s.name = "张三";
		
		System.out.println("姓名："+s.name);
		System.out.println("年龄："+s.age);
		
		//调用成员方法
		s.eat();
		s.study();

	}

}


