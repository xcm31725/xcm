package com.ithiema;

public class StringDemo02 {

	public static void main(String[] args) {
		//String(String original) 
		String s = new String("hello");
		System.out.println("s:"+s);
		System.out.println("---------------");
		
		//String(char[] value) 
		char[] chs = {'h','e','l','l','o'};
		String s1 = new String(chs);
		System.out.println("s1:"+s1);
		System.out.println("---------------");

		//String(char[] value, int offset, int count) 
		String s2 = new String(chs,1,3);
		System.out.println("s2:"+s2);
		System.out.println("---------------");

		String s3 = "hello";
		System.out.println("s3:"+s3);
		
	}

}
