package com.itheima02;

public class PoymorphicDemo {

	public static void main(String[] args) {
		Animal a = new Cat();//һ������������������͵Ļ�����ʼ��ֵ��null�����Ǹ����͵Ķ�������������
		a.eat();

	}

}

class Animal {
	public void eat(){
		System.out.println("�Զ���");
	}
}

class Cat extends Animal {
	public void eat(){
		System.out.println("è����");
	}
}