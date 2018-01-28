package com.regex;

public class RegexDemo {

	public static void main(String[] args) {
		String s = "qaq";
		
		boolean flag = method(s);
		System.out.println(flag);
	}

	private static boolean method(String s) {
		//String ss = s.toLowerCase();
		return s.matches(".[aeiou].");
	}

}
