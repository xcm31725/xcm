package com.itheima_01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 创建一个集合，存储学生对象，学生对象的数据来自于键盘录入，最后遍历集合
 * 		分析：
 * 			键盘录入学生对象
 * 			创建一个学生类
 * 			
 * */
public class StudentDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> array = new ArrayList<Student>();
		
		printArray(array);
		printArray(array);
		printArray(array);
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i).getName()+"-----"+array.get(i).getAge());
		}
	}
	
	public static void printArray(ArrayList<Student> array){
		//创建键盘录入
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入名字：");
		String name = sc.next();
		
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		array.add(s);
	}

}
