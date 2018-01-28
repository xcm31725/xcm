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
			//String getMessage()：原因
			//System.out.println(e.getMessage());
			
			//String toString()：类型和原因
			//System.out.println(e.toString());
			
			//void printStackTrace()：类型原因和位置
			e.printStackTrace();
		}
		
		System.out.println(317);
	}

}
