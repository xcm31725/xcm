package com.itheima;

import com.itheima.Outer.Inner;

/*
 * 成员内部类的修饰符
		我们可以使用权限修饰符修饰成员内部类，但如果使用私有修饰，则无法在其他类中访问
		我们可以使用static修饰成员内部类，不用再创建外部类对象了
	我们可以使用abstract，final修饰成员内部类
 * */
public class InnerDemo2 {

	public static void main(String[] args) {
		//Outer1.Inner1 i = new Outer1().new Inner1();
		//i.function();
		
		Outer1.Inner1.function();
	}

}

class Outer1{	
	public void method(){
		Inner1 i = new Inner1();
		i.function();
	}
	
	static class Inner1{
		public static void function(){
			System.out.println("function");
		}
	}
}