package com.itheima01;

public class Person {
	//姓名
	private String name;
	//年龄
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
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
		System.out.println(name+"正在吃饭");
	}
}
