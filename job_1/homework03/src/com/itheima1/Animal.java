package com.itheima1;

public abstract class Animal {
	//ÐÕÃû
	private String name;
	//ÑÕÉ«
	private String color;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void eat();
	
}	
