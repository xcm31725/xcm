package com.itheima;

import java.util.Scanner;

/*
 * �����Ķ��壺
 * 
 * �����ʽ��
 	* ���η� ����ֵ���� ������ (�������� ����1,�������� ����2...){//��������
 	* 	������;    
 	* 	return ����ֵ;
 	* }
 	* 
 	*  �����Ķ��岿��
 	*  		�����Ķ����ʽ��
 	*  ����ֵ���ͣ������ص���ʲô���;�дʲô���ͣ�û�з���ֵ���;���void
 	*  �����б������洫��ȥ����ʲô���;���ʲô���ͣ����û��Ҫ���ݵ�ֵ�Ǿ�ʲô����д
 	*  
 	* �����ĵ��ã�ֱ�ӵ���   ������(�в������ݲ�����û�о�ʲô����д);
 	* 		      �������   System.out.println( ������(�в������ݲ�����û�о�ʲô����д));
 	* 		      ��ֵ����   ����ֵ���� ������ = ������(�в������ݲ�����û�о�ʲô����д);
 	* 				System.out.println(������);
 	* ˵�����ַ���ֵ��Ҫд����ֵ���ͣ�Ҫ��ӡ������������Ľ����дvoid
 * */
public class MethodDowe01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������һ������");
		int a = sc.nextInt();
		
		System.out.print("������ڶ�������");
		int b = sc.nextInt();
		
		System.out.print("���������������");
		int c = sc.nextInt();
		
		//sum(a,b);
		System.out.println(sum(a,b));
		System.out.println("--------------");
		
		int sum = sum(a,b);
		System.out.println(sum);
		System.out.println("--------------");
		
		int result = max(a,b);
		System.out.println(result);
		System.out.println("--------------");
		
		int result1 = min(a,b);
		System.out.println(result1);
		System.out.println("--------------");
		
		boolean result2 = compare(a,b);
		System.out.println(result2);
		
		System.out.println("--------------");
		int result3 = getMax(a,b,c);
		System.out.println(result3);
		
		System.out.println("--------------");
		printHelloWorld();
		
		System.out.println("--------------");
		printNumber(a);
	}

	//ע�ⷽ�����������з�����
	public static int sum(int a, int b){
		return a+b;
	}
	
	//��������������
	public static int max(int a, int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	
	//����������С����
	public static int min(int a, int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
	
	//�Ƚ��������Ƿ����
	public static boolean compare(int a, int b){
		return a == b;
	}
	
	//�� �������������ֵ
	public static int getMax(int a, int b, int c){
		if (a>b) {
			if (a>c) {
				return a;
			}else {
				return c;
			}
		} else {
			if (b>c) {
				return b;
			} else {
				return c;
			}
		}
	}
	
	//�޷���ֵ�ĵ���  ���10��HelloWorld
	public static void printHelloWorld(){
		for(int i=0; i<10; i++){
			System.out.println("HelloWorld");
		}
	}
	
	//���1~n֮�����е��� �޷���ֵ����
	public static void printNumber(int a){
		for (int i = 0; i < a; i++) {
			System.out.println(i+1);
		}
	}
}




















