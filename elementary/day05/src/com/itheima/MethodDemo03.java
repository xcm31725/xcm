package com.itheima;
/*
 * �������أ���ͬһ�����У������˷�������ͬ�������
 * �������ص��ص㣺
 * 		��������ͬ�������б�ͬ���뷵��ֵ�޹ء�
 * 		�����б�ͬ��
 * 			�����ĸ�����ͬ
 * 			������Ӧ���������Ͳ�ͬ
 * 			�������͵�˳��ͬ
 * 
 * ע�⣺
 * 		�ڵ��÷�����ʱ��java�������ͨ�������б�Ĳ�ͬ������ͬ���ķ���
 * �������صĺô���������ͬ�ķ��������ǰ���Щ�������óɻ�Ϊ���ص���ʽ���������Է�������ߵ��ã�ʹ�����ⲻ��Ҫ����ܶ�ķ�����
 * 
 * */
public class MethodDemo03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		int result = sum(a,b);
		System.out.println(result);
	}
	
	//�������ĺ�
	public static int sum(int a, int b){
		return a + b;
	}
	
	//�������ĺ�
	public static int sum(int a, int b, int c){
		return a + b + c;
	}
	
	public static double sum(double a, double b){
		return a + b;
	}
}
















