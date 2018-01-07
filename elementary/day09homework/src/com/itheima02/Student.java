package com.itheima02;

public class Student {
	private String id;
	
	private String name;
	
	private String xingBie;
	
	private int age;
	
	private double hight;

	public Student() {
	}

	public Student(String id, String name, String xingBie, int age, double hight) {
		this.id = id;
		this.name = name;
		this.xingBie = xingBie;
		this.age = age;
		this.hight = hight;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getXingBie() {
		return xingBie;
	}

	public void setXingBie(String xingBie) {
		this.xingBie = xingBie;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	
	
}
