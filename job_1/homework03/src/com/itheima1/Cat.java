package com.itheima1;

public class Cat extends Animal {
	
	public Cat() {
		super();
	}

	public Cat(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat() {
		System.out.println(getName()+"è����");
	}

}
