package com.itheima;
/*
 * �����ࣺ�̳й�ϵ����һ�̳У����̳�
 * ����ӿڣ�ʵ�ֹ�ϵ����ʵ��
 * �ӿ���ӿڣ��̳й�ϵ����̳�
 * 
 * �ӿڵ��ŵ㣺
 * 		a: ����ӿڵĹ�ϵ��ʵ�ֹ�ϵ�������Ƕ�ʵ�֣�һ�������ʵ�ֶ���ӿ�
 * 			������֮���Ǽ̳й�ϵ��java�еļ̳��ǵ�һ�̳У�һ����ֻ����һ������
 * 				�����˼̳еľ�����		
 * 		b: �����ṩ����USB�ӿڣ�
 * 		c: �����˳��������ԣ�����ʵ��ģ�黯����������ù���ÿ����ʵ���Լ���ģ�飬����˿���Ч�ʣ�
 * 
 * */
public class InterfaceDemo2 {

	public static void main(String[] args) {
		

	}

}

interface InterA extends InterB{
	public abstract void show();
}

interface InterB{
	public abstract void manager();
}

interface InterC extends InterA{
	
}

class Cat1 implements InterC/*InterA,InterB*/{

	@Override
	public void manager() {
		System.out.println("");
		
	}

	@Override
	public void show() {
		System.out.println("");
		
	}

	
	
}