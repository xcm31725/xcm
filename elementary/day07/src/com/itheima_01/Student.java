package com.itheima_01;
/*
 * ��private���εĳ�Ա�����ڱ����п���ֱ�ӷ��ʣ�
 * ����������ֻ��ͨ��������ӵķ��ʣ�setXxx������getXxx�������ʣ���
 * ���ͨ���������ʣ���ô���ǾͿ����ڷ�����׫дһЩ
 * �жϰ�ȫ�ԵĴ��룬�Ӷ��������Ŀ�İ�ȫ��
 * */
public class Student {
	String name;
	private int age;
	
	public void setAge(int a){
		if(a<0&&a>200){
			System.out.println("���������������");
		}else{
			age = a;
		}
	}
	
	public int getAge(){
		return age;
	}
	
	public void show(){
		System.out.println("�ҵ������ǣ�"+name+",�ҵ������ǣ�"+age);
	}
}
