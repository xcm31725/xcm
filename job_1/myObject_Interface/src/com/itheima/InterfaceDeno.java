package com.itheima;
/*
 * Java���Ը������ṩ��һ�ֻ��ƣ����ڴ���̳е�һ�����Եģ��ӿ�
 * 
 * �ӿڣ��ӿھ���һ���ȳ����໹������࣬�Ϳ��������еķ����ǳ����෽�����ӿں���ĸ�ϵ��ʵ�֣�implements
 * 
 * interest
 * 
 * ��ʽ��
 * 		interest �ӿ���{
 * 			
 * 		}
 * */
public class InterfaceDeno {

	public static void main(String[] args) {
		BillGates bg = new BillGates();
		bg.code();
	}

}

class Boss{
	public void manage(){
		System.out.println("����˾");
	}
}

class Programma{
	public void code(){
		System.out.println("����Աд����...");
	}
}

class BillGates extends Programma{

}