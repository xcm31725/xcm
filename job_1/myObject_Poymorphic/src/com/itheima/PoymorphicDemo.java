package com.itheima;
/*
 * ��̬��ǰ�᣺
 * 		�Ӹ���ļ̳й�ϵ
 * 		��������д
 * 		��������ָ���������
 * 
 * ��̬�󶨣������ڼ���õķ������Ǹ�������������
 * */
public class PoymorphicDemo {

	public static void main(String[] args) {
		/*Cat c = new  Cat();
		c.eat();*/
		
		//��������  Animal a
		//ָ��  =
		//�������  new Cat()
		
		Animal a = new Cat();
		a.eat();
	}

}

class Animal{
	public void eat(){
		System.out.println("�Զ���");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("è����");
	}
}
