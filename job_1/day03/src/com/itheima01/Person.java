package com.itheima01;

public class Person {
	private String name;
	private int age;
	private String gander;
	public Person() {
		super();
	}
	public Person(String name, int age, String gander) {
		super();
		this.name = name;
		this.age = age;
		this.gander = gander;
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
	public String getGander() {
		return gander;
	}
	public void setGander(String gander) {
		this.gander = gander;
	}
	
	public void eat(){
		System.out.println("³Ô·¹...");
	}
	
	public void sleep(){
		System.out.println("Zzz...");
	}
}
