package com.itheima;
/*
 * 多态的成员特点：
 * 		成员变量：编译时看左边，运行时看左边
 * 		成员方法：编译时看左边，运行时看右边
 * 		静态方法：编译时看左边，运行时看左边
 * 
 * 编译时都看左边，运行时成员方法看右边，其余（成员变量，静态方法）的都看左边
 * */
public class PoymorphicDemo1 {

	public static void main(String[] args) {
		Dad d = new Kid();
		System.out.println(d.num);
		d.method();
		d.function();
	}

}

class Dad{
	int num = 20;
	
	public void method(){
		System.out.println("我是父类的成员方法");
	}
	
	public static void function(){
		System.out.println("我是父类的静态方法");
	}
}

class Kid extends Dad{
	int num = 10;
	
	public void method(){
		System.out.println("我是子类的成员方法");
	}
	
	public static void function(){
		System.out.println("我是子类的静态方法");
	}
}