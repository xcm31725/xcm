package com.itheima;
/*
 * 多态的向上转型和向下转型：

	引用类型之间的转换：
		向上转型：
			由小到大(子类型转换成父类型)
		向下转型：
			由大到小
	基本类型之间的转换：
		自动类型转换：
			由小到大：byte short char --- int ---long --- float --- double
		强制类型转换
			由大到小
 * */
public class PoymorphicDemo2 {

	public static void main(String[] args) {
		Animal1 a = new Dog();
		a.eat();//向上类型转换
		
		Dog d = (Dog)a;//强转
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
		System.out.println("吃骨头");
	}
	
	public void swim(){
		System.out.println("狗刨");
	}
}

