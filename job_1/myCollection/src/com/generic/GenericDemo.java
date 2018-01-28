package com.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 使用集合存自定义对象并遍历
 * 由于集合可以存储任意类型的对象，当我们存储了不同类型的的对象，就有可能在转换的时候出现转换异常
 * 所以java为了解决这个问题，给我们提供了一种机制，叫泛型
 * 泛型：是一种广泛的类型，把明确数据类型的工作提前到了翻译时期，借鉴了数组的特点
 * 
 * 泛型的好处：
 * 		避免了类型转换的问题
 * 		可以减少黄色警告
 * 		可以简化我们代码的书写
 * 
 * 什么时候可以使用泛型？
 * 		当我们看到<E>，就可以使用泛型了
 * 
 * */
public class GenericDemo {

	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();
		
		c.add(new Student("xcm",18));
		c.add(new Student("xgd",22));
		
		//遍历集合对象
		Iterator<Student> it = c.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			System.out.println(stu.name);

		}
	}

}

class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
