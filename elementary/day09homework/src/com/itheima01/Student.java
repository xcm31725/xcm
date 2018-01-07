package com.itheima01;

public class Student {
	private String id;
	
	private String name;
	
	private double hight;
	
	public Student() {
	}

	public Student(String id, String name, double hight) {
		this.id = id;
		this.name = name;
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

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}
	
	
}
