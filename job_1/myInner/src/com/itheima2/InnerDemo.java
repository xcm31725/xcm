package com.itheima2;
/*
 * �����ڲ��ࣺ
		���԰������ڲ��࿴����һ��û�����ֵľֲ��ڲ���
		�����ڷ�����
		�����ڶ����������ڲ����ʱ�򴴽����Ķ���
	��ʽ��
		new ��/�ӿ�(){
			����Ǵ����˼̳�����������������ǿ�����д���෽��
			����Ǵ�����ʵ������ӿڵ�����������Ǳ���Ҫʵ�ָýӿڵ����з���
		};
	ԭ�����Ǵ����˼̳������������������Ǵ�����ʵ������ӿڵ��������

 * */
public class InnerDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();

	}

}

interface Inner{
	public void function();
}

class Outer{
	public void method(){
		/*new Inner(){
			@Override
			public void function() {
				System.out.println("function");
				
			}
			
		}.function();*/
		
		Inner i = new Inner(){
			@Override
			public void function() {
				System.out.println("function");
				
			}
			
		};
		
		i.function();
		i.function();
		
	}
}