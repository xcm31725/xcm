package com.itheima_02;

public class TestString {

	public static void main(String[] args) {
		String s = "2A0a@0wz8qq0EE8#08";
		
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if(ch>='0'&&ch<='9'){
				System.out.print(ch);
			}
		}
	}

}
