package com.itheima;

import java.util.ArrayList;

public class ArrayArrayTest02 {

	public static void main(String[] args) {
		//创建集合
		ArrayList<String> array = new ArrayList<String>();
		
		//创建学生对象
		Student s = new Student("xcm",18);
		Student s1 = new Student("xtx",17);
		Student s2 = new Student("xxn",22);
		Student s3 = new Student("xka",23);
		
		array.add(s.getName()+"---"+s.getAge());
		array.add(s1.getName()+"---"+s1.getAge());
		array.add(s2.getName()+"---"+s2.getAge());
		array.add(s3.getName()+"---"+s3.getAge());
		
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
	}
}
