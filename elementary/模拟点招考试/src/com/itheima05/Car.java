package com.itheima05;
// *  1.成员属性: brand (品牌)：String类型, price (价格):int类型，属性使用private修饰。为所有属性提供set/get方法。
public class Car {
	private String brand;
	private int price;
	public Car() {
	}
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
