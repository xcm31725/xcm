package com.itheima02;
/*
 * ��֪è��(Cat)�͹�(Dog)�ࣺ
				����:ë����ɫ,�ȵĸ���
				��Ϊ:�Է�
				è������Ϊ:ץ����catchMouse
				��������Ϊ:����lookHome
 * */
public class TestAnimal {

	public static void main(String[] args) {
		Cat c = new Cat("��è",4);
		c.eat();
		c.catchMouse();
		
		Dog d = new Dog("�ڹ�",2);
		d.eat();
		d.lookHome();
	}

}
