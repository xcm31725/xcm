package com.itheima01;

public class Student extends Person {

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super(name, age);
	}
	
	public void study(){
		System.out.println(getName()+"ÕıÔÚÑ§Ï°");
	}
}
