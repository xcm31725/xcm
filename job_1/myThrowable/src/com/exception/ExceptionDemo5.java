package com.exception;
/*
 * 要求：写一个方法，接收考试成绩的范围在0-100之间则属于正常，否则属于异常
 * 
 * throws：处理异常的一种方式，把异常抛出，有调用者来处理
 * throw：制造异常的方式，并且结束方法
 * 
 * 注意：如果抛出（throw）的是编译时期异常，必须在方法声明处抛出
 * 
 * 如何定义一个异常类
 * 		非常简单，写一个类去继承Exception或者RuntimeException，然后实现多个构造即可
 * */
public class ExceptionDemo5 {

	public static void main(String[] args) {
	
		try {
			checkScore(110);
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void checkScore(int score) {
		
		if(score < 0 || score > 100){
			throw new RuntimeException("你输入的成绩不合法");
		}
		
		System.out.println("输入成功");
	}

}
