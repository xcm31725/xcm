package com.regex;

public class RegexTest {

	public static void main(String[] args) {
		//method();
		//method1();
		String s = "213xcm23xcm11xcm-243";
		String[] arr = s.split("xcm");
		print(arr);
			
	}
	private static void method1() {
		String s = "-1 99   24   342  3";
		String[] arr = s.split(" +");
		print(arr);
	}
	private static void method() {
		String s = "aa,bb,cc";
		String[] arr = s.split(",");
		print(arr);
	}
	public static void print(String[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	} 

}
