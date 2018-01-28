package com.itheima;
/*
 * 成员内部类
 * 		在类的成员位置，和成员变量以及成员方法所在的位置是一样的
 * 		在内部类当中，可以直接访问外部类的成员，包括私有的
 * */
public class InnerDenon {

	public static void main(String[] args) {
		//Outer o = new Outer();
		//o.method();
		
		Outer.Inner i = new Outer().new Inner();
		i.function();

	}

}

class Outer{
	private int num = 10;
	
	public void method(){
		Inner i = new Inner();
		i.function();
	}
	
	class Inner{
		public void function(){
			System.out.println(num);
		}
	}
}
