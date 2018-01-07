package com.itheima01;

public class RectangleTest {//Rectangle ¾ØÐÎ

	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,4);
		System.out.println(r.getLength());
		System.out.println(r.getArea());
		System.out.println("-------------------");
		
		Rectangle r1 = new Rectangle();
		r1.setWidth(4);
		r1.setHigh(5);
		System.out.println(r1.getLength());
		System.out.println(r1.getArea());
	}

}

class Rectangle {
	private int width; //width  ¿í
	private int high;  //high   ¸ß
	
	public Rectangle() {
	}
	
	public Rectangle(int width, int high) {
		this.width = width;
		this.high = high;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}
	
	public int getLength(){
		return (width+high)*2;
	}
	
	public int getArea(){
		return width*high;
	}
	
}















