package com.itheima02;

public class PoymorphicDemo2 {

	public static void main(String[] args) {
		Animal1 a = new Dog();//向上转型
		//a.eat();
		
		Dog d = (Dog)a;//强制类型转换
		d.swim();//向下类型转换

	}

}

class Animal1{
	public void eat(){
		System.out.println("吃东西");
	}
}

class Dog extends Animal1{
	public void eat(){
		System.out.println("啃骨头");
	}
	
	public void swim(){
		System.out.println("游泳");
	}
}