package com.itheima;

public class InterfaceDemo {

	public static void main(String[] args) {
		System.out.println(Animal.MUN);
		
		Cat c = new Cat();
		c.eat();

	}

}

interface Animal {
	public static final int MUN = 10;
	public abstract void eat();
}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("√®≥‘”„");
		System.out.println("");
	}
	
}