package com.itheima01;

public class TestStatic01 {

	public static void main(String[] args) {
		//Test t = new Test();
		//t.print1();
		
		Test.print2();    // ��̬����һ�ֵ��÷�ʽ������ͨ������.
		

	}

}

class Test{
	int num1 = 10;//�Ǿ�̬��Ա����
	static int num2 = 20;//��̬��Ա����
	
	/*public void print1(){ //�Ǿ�̬�ĳ�Ա�������ȿ��Է��ʾ�̬�ĳ�ԱҲ���Է��ʷǾ�̬��
		System.out.println(num1);
		System.out.println(num2);
	}*/
	
	public static void print2(){//��̬��Ա�������޷��Ӿ�̬�з��ʷǾ�̬����
		//System.out.println(num1);
		System.out.println(num2);
	}
	
}






















