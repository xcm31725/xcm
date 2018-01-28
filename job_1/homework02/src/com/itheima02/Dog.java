package com.itheima02;

public class Dog extends Animal {
	
	public Dog() {
		super();
	}

	public Dog(String color, int leg) {
		super(color, leg);
	}

	@Override
	public void eat() {
		System.out.println(getColor()+"π∑≥‘»‚");
	}
	
	public void lookHome(){
		System.out.println("ø¥º“");
	}
}
