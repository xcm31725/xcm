package com.itheima;
/*
 * �ӿڵ��ص㣺
 * 		ֻ���г��󷽷�
 * 		ֻ���г���
 * 		Ĭ��ʹ��public&abstract���η���
 * 		ֻ��ʹ��public&abstract���η���
 * 		Ĭ��ʹ��public static final�����γ�Ա����
 * 
 * ���飺�����ֶ��ĸ���Ĭ�ϵ����η�
 * 
 * ע�⣺
 * 		�ӿڲ��ܴ������󣨲���ʵ������
 * 		����ӿڵĹ�ϵ��ʵ�ֹ�ϵ��һ����ʵ��һ���ӿڱ���ʵ�������еķ���
 * */
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();

	}

}

interface Animal{
	public static final int leg = 10;
	
	public abstract void eat();
}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("�Է�");
		
	}
	
}
