package com.itheima02;

public class PoymorphicDemo {

	public static void main(String[] args) {
		Animal a = new Cat();//一个变量如果是引用类型的话，初始化值是null或者是该类型的对象或者子类对象
		a.eat();

	}

}

class Animal {
	public void eat(){
		System.out.println("吃东西");
	}
}

class Cat extends Animal {
	public void eat(){
		System.out.println("猫吃鱼");
	}
}