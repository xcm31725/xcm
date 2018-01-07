package com.itheima;

public class Demo01_Car {
	public static void main(String[] args) {
		//Car c1 = new Car();
		//Car c2 = new Car();
		
		//show(c1);
		//show(c2);
		//Òþº¬¶¨Òå
		show(new Car());
		
		show(new Car());
		
	}
	public static void show(Car c){
		c.color = "red";
		c.num = 8;
		c.run();
		//System.out.println(c.color + "..." + c.num);
	}

}

class Car{
	String color;
	int num;
	
	public void run(){
		System.out.println(color + "..." + num);
	}
}