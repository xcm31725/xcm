package com.itheima;
/*
 * ��̬������ת�ͺ�����ת�ͣ�

	��������֮���ת����
		����ת�ͣ�
			��С����(������ת���ɸ�����)
		����ת�ͣ�
			�ɴ�С
	��������֮���ת����
		�Զ�����ת����
			��С����byte short char --- int ---long --- float --- double
		ǿ������ת��
			�ɴ�С
 * */
public class PoymorphicDemo2 {

	public static void main(String[] args) {
		Animal1 a = new Dog();
		a.eat();//��������ת��
		
		Dog d = (Dog)a;//ǿת
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
		System.out.println("�Թ�ͷ");
	}
	
	public void swim(){
		System.out.println("����");
	}
}

