package com.itheima;

import java.util.Scanner;

/*
 * 字符串反转
 * 举例：键盘录入“abc”
 * 输出：“cba”
 * */
public class StringTest05 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("请输入一个字符串：");
		 String s = sc.nextLine();
		 
		 //String result = reverse(s);
		 String result1 = reverse1(s);
		 
		// System.out.println(result);
		 System.out.println(result1);
	}
	
	//把字符串反着遍历
	public static String reverse(String s){
		String ss = "";
		for(int i=s.length()-1; i>=0; i--){
			
			ss += s.charAt(i);
		}
		
		return ss;
	}
	
	//把字符串转换为字符数组，然后对字符数组进行反转，最后把字符数组转化为字符串
	public static String reverse1(String s){
		//把字符串转换为字符数组
		char[] arr = s.toCharArray();
		for(int start=0,end=arr.length-1;start<=end;end--,start++){
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		//把字符数组转化为字符串,通过创建对象来实现
		String s1 = new String(arr);
		return s1;
	}

}
