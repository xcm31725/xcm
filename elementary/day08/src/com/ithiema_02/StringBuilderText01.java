package com.ithiema_02;

public class StringBuilderText01 {
	public static void main(String[] args) {
		/*String s = "helloworld";
		//StringBuilder sb = new StringBuilder(s);
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println(sb);*/
		
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world");
		String s = sb.toString();
		System.out.println(s);
	}
}
