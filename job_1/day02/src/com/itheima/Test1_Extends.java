package com.itheima;

public class Test1_Extends {

	public static void main(String[] args) {
		Zi z = new Zi();
		z.eat();
		z.sleep();

	}

}

class Fu{

	public void eat(){
		System.out.println("小喝两口");
	}
	
	public void sleep(){
		System.out.println("吃完睡觉");
	}
}

class Zi extends Fu{
	public void eat(){
		System.out.println("好好吃饭");
	}
}