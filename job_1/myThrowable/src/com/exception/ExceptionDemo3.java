package com.exception;
/*
 * String getMessage() 
 * String toString() 
 * void printStackTrace() 
 * */
public class ExceptionDemo3 {

	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		} catch (Exception e) {
			//String getMessage()��ԭ��
			//System.out.println(e.getMessage());
			
			//String toString()�����ͺ�ԭ��
			//System.out.println(e.toString());
			
			//void printStackTrace()������ԭ���λ��
			e.printStackTrace();
		}
		
		System.out.println(317);
	}

}
