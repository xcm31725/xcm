package com.itheima;
/*
 * 接口的特点：
 * 		只能有抽象方法
 * 		只能有长量
 * 		默认使用public&abstract修饰方法
 * 		只能使用public&abstract修饰方法
 * 		默认使用public static final来修饰成员变量
 * 
 * 建议：建议手动的给上默认的修饰符
 * 
 * 注意：
 * 		接口不能创建对象（不能实例化）
 * 		类与接口的关系是实现关系，一个类实现一个接口必须实现它所有的方法
 * */
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();

	}

}

interface Animal{
	public static final int leg = 10;
	
	public abstract void eat();
}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("吃饭");
		
	}
	
}
