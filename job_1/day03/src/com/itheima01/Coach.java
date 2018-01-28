package com.itheima01;

public abstract class Coach extends Person {

	public Coach() {
		super();
	}

	public Coach(String name, int age, String gander) {
		super(name, age, gander);
	}
	
	public abstract void teach();
}
