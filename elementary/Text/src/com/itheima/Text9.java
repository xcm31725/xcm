package com.itheima;

import java.util.Random;

public class Text9 {
	public static void main(String[] args) {
		Random ra = new Random();
		int Char = ra.nextInt(26) + 65;
		
		System.out.println("Char:"+Char);
		char a = (char)Char;
		
		System.out.println("a:"+a);
	}
}
