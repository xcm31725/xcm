package com.itheima02;

public class PoymorphicDemo2 {

	public static void main(String[] args) {
		Animal1 a = new Dog();//����ת��
		//a.eat();
		
		Dog d = (Dog)a;//ǿ������ת��
		d.swim();//��������ת��

	}

}

class Animal1{
	public void eat(){
		System.out.println("�Զ���");
	}
}

class Dog extends Animal1{
	public void eat(){
		System.out.println("�й�ͷ");
	}
	
	public void swim(){
		System.out.println("��Ӿ");
	}
}