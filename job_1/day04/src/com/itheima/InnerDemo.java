package com.itheima;
/*��ţ������������Ｆ����
 * �ڲ������У���ʵ�����Ѿ�����Outer������ô�������������ֱ��ʹ���������Ϳ�����
 *		�ⲿ������this����ʾ�ľ����ڲ������д������ⲿ����󣬱��磺OUter.this
 * 
 * �ؼ��֣�
 * 		public default final static private abstract protected this super void class new package interface implements extends 
 * */


public class InnerDemo {

	public static void main(String[] args) {
		//Outer o = new Outer();
		//o.method();
		
		Outer.Inner i = new Outer().new Inner();
		i.function();

	}
}

class Outer {
	private int num = 10;
	
	public void method() {
		Inner i = new Inner();
		i.function();
	}
	class Inner {
		public void function(){
			System.out.println(num);
		}
	}
}
