package com.itheima01;

public class PresonDemo_02 {

	public static void main(String[] args) {
		Preson02 p = new Preson02();
		p.show();
		System.out.println("--------------------");
		
		Preson02 p1 = new Preson02("����",23);
		p1.show();

	}

}

/*
 *A:������ʾ
 		*���췽��������
 		*���أ���������ͬ���뷵��ֵ�����޹أ����췽��û�з���ֵ����ֻ�������б�
 *B:���췽��ע������
 		*a:�������û�и������췽����ϵͳ�����Զ��ṩһ���޲εĹ��췽����
 		*b:������Ǹ����˹��췽����ϵͳ������ʹ���ṩĬ�ϵ��޲ι��췽����
 			*ע�⣺���ʱ����������뻹ʹ���޲ι��췽�����ͱ����Լ�������������Զ�Լ����޲εĹ��췽��
 * */
class Preson02{
	private String name;
	private int age;
	
	public Preson02(){     //�ղι���
		System.out.println("�ղι���");
	}
	
	public Preson02(String name,int age){// �вι���
		this.name = name;
		this.age = age;
		System.out.println("�вι���");
	}
	
	public void show(){
		System.out.println(name+"..."+age);
	}
	
}
