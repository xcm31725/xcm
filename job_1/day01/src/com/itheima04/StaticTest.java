package com.itheima04;

public class StaticTest {
	static {
		System.out.println("StaticTest��̬�����");
	}
	
	{
		System.out.println("StaticTest�ֲ������");
	}
	public static void main(String[] args) {
		Static s = new Static();
	}

}

class Static{
	static {
		System.out.println("Static��̬�����");
	}
	
	public Static() {
		System.out.println("Static��������");
	}
	
	{
		System.out.println("Static�ֲ������");
	}
}