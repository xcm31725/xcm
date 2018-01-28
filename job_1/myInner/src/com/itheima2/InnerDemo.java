package com.itheima2;
/*
 * 匿名内部类：
		可以吧匿名内部类看成是一个没有名字的局部内部类
		定义在方法中
		必须在定义在匿名内部类的时候创建他的对象
	格式：
		new 类/接口(){
			如果是创建了继承这个类的子类对象，我们可以重写父类方法
			如果是创建了实现这个接口的子类对象，我们必须要实现该接口的所有方法
		};
	原理：而是创建了继承这个类的子类对象或者是创建了实现这个接口的子类对象

 * */
public class InnerDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();

	}

}

interface Inner{
	public void function();
}

class Outer{
	public void method(){
		/*new Inner(){
			@Override
			public void function() {
				System.out.println("function");
				
			}
			
		}.function();*/
		
		Inner i = new Inner(){
			@Override
			public void function() {
				System.out.println("function");
				
			}
			
		};
		
		i.function();
		i.function();
		
	}
}