package com.thorwable;

public class ExceptionDemo {

	public static void main(String[] args) {
		show();
	}

	private static void show() {
		try {
			System.out.println(1);
			System.out.println(2/0);
			System.out.println(2);
		} catch (Exception e) {
			System.out.println("除数不能为零");
			//e.printStackTrace();
		}
		System.out.println(3);
	}

}
