package com.exception;
/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 *	at com.itheima_01.ExceptionDemo.main(ExceptionDemo.java:5)
 *	������д�����ʱ�򣬾����ĳ���һЩС���⣬��ôΪ�˷������Ǵ�����Щ���⣬javaΪ�����ṩ���쳣����
 *	
 *	�쳣�����˴�������͡�ԭ���Լ�λ��
 *	
 *	�쳣���������������ڴ����ʱ����ֵı����������ʱ�Ĵ���
 *	
 *	�쳣����ϵ�ṹ��
 *			Throwable����㣩
 *					Error:���ֵĲ��ܹ��������������
 *					Exception:���Դ��������
 *					
 *	���Ի��ˣ�
 *		ϵͳ�ж�����װϵͳ�Ϳ�����
 *		���廵�ˣ���һ̨�µ�
 * 
 * 
 * �쳣�Ĵ���ʽ��
 * 			������
 * 				try...catch���
 * 
 * 				try {
 * 					�п��ܳ�������Ĵ���;
 * 				} catch(ArithmeticException ae) {
 * 					�����쳣;
 * 				}
 * 
 * 				try...catch��ִ��˳��
 * 					����ִ��try���
 * 						��������쳣���쳣����Ĵ��벻��ִ�У�ֱ������catch����У�catch������������try...catch����
 * 						���û�з����쳣��try���ִ�н�����try...catchֱ�ӽ����� ����ִ��catch���
 * 
 * 			�׳�ȥ
 * 				�����ǲ��봦���쳣������û�����������ʱ�����ǿ���ѡ���׳��쳣��˭���÷���˭�����쳣
 * 				ʹ�ùؼ���throws�ڷ������������׳��쳣
 *
 *  jvm�����쳣�ķ�ʽ��
 *  	��������쳣����û�д���jvm������ǽ��д���������쳣�����ͣ�ԭ����λ����ʾ��������
 *  	���һ���ֹ�˳����쳣����Ĵ��뽫����ִ��
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		try{
			System.out.println("1");
			System.out.println(2/0);
			System.out.println(2);
		}catch(Exception e){
			System.out.println("��������Ϊ0");
		}
		System.out.println(3);
	}

}
