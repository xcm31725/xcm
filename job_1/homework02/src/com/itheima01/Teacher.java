package com.itheima01;

public class Teacher extends Person {

	public Teacher() {
		super();
	}

	public Teacher(String name, int age) {
		super(name, age);
	}
	
	public void teach(){
		System.out.println(getName()+"ÕıÔÚ½²¿Î...");
	}
}
