package com.itheima02;

public abstract class Animal {
	private String color;
	private int leg;
	public Animal() {
		super();
	}
	public Animal(String color, int leg) {
		super();
		this.color = color;
		this.leg = leg;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public abstract void eat();
}
