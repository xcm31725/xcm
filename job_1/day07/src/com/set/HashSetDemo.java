package com.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student("xcm",18));
		set.add(new Student("xgd",23));
		set.add(new Student("xcm",18));
		
		for (Student student : set) {
			System.out.println(student);
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("----------------------");
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(this.getClass() != obj.getClass()){
			return false;
		}
		
		Student s = (Student)obj;
		if(this.age != s.age){
			return false;
		}
		
		if(name == null){
			if(s.name != null){
				return false;
			}
		}else if(!this.name.equals(s.name)){
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}