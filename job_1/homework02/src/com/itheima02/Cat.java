package com.itheima02;

public class Cat extends Animal {
	
	public Cat() {
		super();
	}

	public Cat(String color, int leg) {
		super(color, leg);
	}

	@Override
	public void eat() {
		System.out.println(getColor()+"Ã¨³ÔÓã");
	}
	
	public void catchMouse(){
		System.out.println("×¥ÀÏÊó");
	}
}
