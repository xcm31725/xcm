package com.itheima;
/*
 * ��Ա�ڲ���
 * 		����ĳ�Աλ�ã��ͳ�Ա�����Լ���Ա�������ڵ�λ����һ����
 * 		���ڲ��൱�У�����ֱ�ӷ����ⲿ��ĳ�Ա������˽�е�
 * */
public class InnerDenon {

	public static void main(String[] args) {
		//Outer o = new Outer();
		//o.method();
		
		Outer.Inner i = new Outer().new Inner();
		i.function();

	}

}

class Outer{
	private int num = 10;
	
	public void method(){
		Inner i = new Inner();
		i.function();
	}
	
	class Inner{
		public void function(){
			System.out.println(num);
		}
	}
}
