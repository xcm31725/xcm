package com.thorwable;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		} catch (Exception e) {
			//System.out.println(e.getMessage());//原因
			//System.out.println(e.toString());//类型和原因
			e.printStackTrace();//类型原因和位置
		}
	}
}
