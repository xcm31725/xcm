package com.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest1 {

	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();
		
		c.add(new Student("xcm",18));
		c.add(new Student("xgd",22));
		
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
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
}