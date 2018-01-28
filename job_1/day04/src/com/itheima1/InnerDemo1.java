package com.itheima1;

public class InnerDemo1 {

	public static void main(String[] args) {
		//show(new Cat());
		//show(new Dog());
		show(new Animal(){

			@Override
			public void eat() {
				System.out.println("√®≥‘”„");
				
			}
		}
		);
		
	}
	
	public static void show(Animal a) {
		a.eat();
	}

}
