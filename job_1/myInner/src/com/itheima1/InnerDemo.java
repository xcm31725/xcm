package com.itheima1;
/*
 * �ֲ��ڲ���
		�ڷ������棬���������Ͳ���ʹ����
 * */
public class InnerDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();

	}

}

class Outer{
	public void method(){
		class Inner{
			public void function(){
				System.out.println("function");
			}
		}
		
		Inner i = new Inner();
		i.function();
	}
}