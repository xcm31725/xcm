package com.itheima;

public class Test1_Extends {

	public static void main(String[] args) {
		Zi z = new Zi();
		z.eat();
		z.sleep();

	}

}

class Fu{

	public void eat(){
		System.out.println("С������");
	}
	
	public void sleep(){
		System.out.println("����˯��");
	}
}

class Zi extends Fu{
	public void eat(){
		System.out.println("�úóԷ�");
	}
}