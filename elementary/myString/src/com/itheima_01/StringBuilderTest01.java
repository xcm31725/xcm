package com.itheima_01;
/*
 * StringBuilder和String的互换
 * 
 * StringBuilder -- String
 * 		public String toString():通过同String()就可以实现吧StringBuilder转换成String
 * String -- StringBuilder 
 * 		StringBuilder(String str):
 * */
public class StringBuilderTest01 {

	public static void main(String[] args) {
		//StringBuilder -- String
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world");
		
		String s = sb.toString();
		System.out.println(s);
		System.out.println("--------");
		
		//String -- StringBuilder
		String s1 = "helloworld";
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println(sb1);
	}

}
