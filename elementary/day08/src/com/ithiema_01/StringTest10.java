package com.ithiema_01;

import java.util.Scanner;

public class StringTest10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		String s = sc.nextLine();
		String str = reverse(s);
		System.out.println(str);
		
	}
	
	public static String reverse(String s){
		char[] chs = s.toCharArray();
		
		for (int i = 0,j = chs.length-1; i < j; i++, j--) {
			char temp = chs[i];
			chs[i] = chs[j];
			chs[j] = temp;
			
		}
		String ss = new String(chs);
		return ss;
	}
	
	

}
