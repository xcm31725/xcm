package com.itheima2;

public class Student {
	private String name;
	private int age;
	
	private void chackName(String name) {
		throw new IllegalNameException("非法的名字");
	}
	
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		chackName(name);
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		chackName(name);
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
