package com.itheima_03;

public class Phone {
	private String brank;
	private int price;
	public Phone() {
		
	}
	public Phone(String brink, int price) {
		this.brank = brink;
		this.price = price;
	}
	public String getBrink() {
		return brank;
	}
	public void setBrink(String brink) {
		this.brank = brink;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void call(String name){
		System.out.println("用"+brank+"手机给"+name+"打电话");
	}
}
