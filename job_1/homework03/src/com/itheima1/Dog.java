package com.itheima1;

public class Dog extends Animal {
	
	public Dog() {
		super();
	}

	public Dog(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat() {
		System.out.println(getName()+"π∑≥‘»‚");
	}

}
