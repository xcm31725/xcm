package com.itheima01;

public class Car {
	private String name;
	
	private int age;

	public Car() {
	}

	public Car(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat(){
		System.out.println("�Է��Ĺ���");
		System.out.println(this.name+"---"+this.age);
	}
	
	public void sleep(){
		System.out.println("˯���Ĺ���");
		System.out.println(this.name+"---"+this.age);
	}
}
