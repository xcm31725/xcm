package com.itheima;
/*
 * Java语言给我们提供了一种机制，用于处理继承单一局限性的，接口
 * 
 * 接口：接口就是一个比抽象类还抽象的类，就扣里面所有的方法是抽象类方法，接口和类的干系是实现，implements
 * 
 * interest
 * 
 * 格式：
 * 		interest 接口名{
 * 			
 * 		}
 * */
public class InterfaceDeno {

	public static void main(String[] args) {
		BillGates bg = new BillGates();
		bg.code();
	}

}

class Boss{
	public void manage(){
		System.out.println("管理公司");
	}
}

class Programma{
	public void code(){
		System.out.println("程序员写代码...");
	}
}

class BillGates extends Programma{

}