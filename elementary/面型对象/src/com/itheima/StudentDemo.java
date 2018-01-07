package com.itheima;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		pear(s);
	}
	public static void pear(Student s){
		s.name = "ÕÅÈı";
		s.age = 22;
		s.speak();
	}
}

class Student {
	String name;
	int age;
	public void speak(){
		System.out.println(name+"..."+age);
	}
}

