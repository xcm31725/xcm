package com.itheima01;

public abstract class Player extends Person{
	
	public Player() {
		super();
	}

	public Player(String name, int age, String gander) {
		super(name, age, gander);
	}

	public abstract void sutdy(); 
}
