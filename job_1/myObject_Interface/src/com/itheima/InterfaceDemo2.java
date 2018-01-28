package com.itheima;
/*
 * 类与类：继承关系，单一继承，多层继承
 * 类与接口：实现关系，多实现
 * 接口与接口：继承关系，多继承
 * 
 * 接口的优点：
 * 		a: 类与接口的关系，实现关系，而且是多实现，一个类可以实现多个接口
 * 			类与类之间是继承关系，java中的继承是单一继承，一个类只能有一个父类
 * 				打破了继承的局限性		
 * 		b: 对外提供规则（USB接口）
 * 		c: 降低了程序的耦合性（可以实现模块化开发，定义好规则，每个人实现自己的模块，提高了开发效率）
 * 
 * */
public class InterfaceDemo2 {

	public static void main(String[] args) {
		

	}

}

interface InterA extends InterB{
	public abstract void show();
}

interface InterB{
	public abstract void manager();
}

interface InterC extends InterA{
	
}

class Cat1 implements InterC/*InterA,InterB*/{

	@Override
	public void manager() {
		System.out.println("");
		
	}

	@Override
	public void show() {
		System.out.println("");
		
	}

	
	
}