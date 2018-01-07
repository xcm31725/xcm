package com.itheima_02;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		addStudent(array);
		
		for (int i = 0; i < array.size(); i++) {
			Student stu = array.get(i);
			System.out.println(stu.getName()+"--"+stu.getAge());
		}
	}
	
	public static void addStudent(ArrayList<Student> array){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入姓名：");
		String name = sc.nextLine();
		
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		
		array.add(s);
		
	}
	
}
