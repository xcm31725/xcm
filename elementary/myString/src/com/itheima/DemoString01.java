package com.itheima;

public class DemoString01 {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "Hello";
		
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("----------------");
		System.out.println("s1==s3:"+(s1==s3));
		System.out.println("----------------");
		System.out.println("s3==s4:"+(s3==s4));
	}

}
