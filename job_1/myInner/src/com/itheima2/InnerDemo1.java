package com.itheima2;
/*
 * �����ڲ����Ӧ�ó�����
		��Ϊ��������
 * */
public class InnerDemo1 {

	public static void main(String[] args) {
		//method(new Dog());
		//method(new Cat());
		
		method(
			new Animal() {
				
				@Override
				public void eat() {
					System.out.println("è����");
					
				}
			}
		);

	}
	
	public static void method(Animal a){
		a.eat();
	}

}
