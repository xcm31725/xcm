package com.itheima;

import com.itheima.Outer.Inner;

/*
 * ��Ա�ڲ�������η�
		���ǿ���ʹ��Ȩ�����η����γ�Ա�ڲ��࣬�����ʹ��˽�����Σ����޷����������з���
		���ǿ���ʹ��static���γ�Ա�ڲ��࣬�����ٴ����ⲿ�������
	���ǿ���ʹ��abstract��final���γ�Ա�ڲ���
 * */
public class InnerDemo2 {

	public static void main(String[] args) {
		//Outer1.Inner1 i = new Outer1().new Inner1();
		//i.function();
		
		Outer1.Inner1.function();
	}

}

class Outer1{	
	public void method(){
		Inner1 i = new Inner1();
		i.function();
	}
	
	static class Inner1{
		public static void function(){
			System.out.println("function");
		}
	}
}