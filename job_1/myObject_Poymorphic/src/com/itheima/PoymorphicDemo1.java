package com.itheima;
/*
 * ��̬�ĳ�Ա�ص㣺
 * 		��Ա����������ʱ����ߣ�����ʱ�����
 * 		��Ա����������ʱ����ߣ�����ʱ���ұ�
 * 		��̬����������ʱ����ߣ�����ʱ�����
 * 
 * ����ʱ������ߣ�����ʱ��Ա�������ұߣ����ࣨ��Ա��������̬�������Ķ������
 * */
public class PoymorphicDemo1 {

	public static void main(String[] args) {
		Dad d = new Kid();
		System.out.println(d.num);
		d.method();
		d.function();
	}

}

class Dad{
	int num = 20;
	
	public void method(){
		System.out.println("���Ǹ���ĳ�Ա����");
	}
	
	public static void function(){
		System.out.println("���Ǹ���ľ�̬����");
	}
}

class Kid extends Dad{
	int num = 10;
	
	public void method(){
		System.out.println("��������ĳ�Ա����");
	}
	
	public static void function(){
		System.out.println("��������ľ�̬����");
	}
}