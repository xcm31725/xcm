package com.itheima1;

public class Cat1 extends Animal implements TiaoGao {

	@Override
	public void tiaoGao() {
		System.out.println("�������");

	}

	@Override
	public void eat() {
		System.out.println("è����");

	}

}
