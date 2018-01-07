package com.itheima;
/*
 * È¥³ý×Ö·û´®Á½¶Ë¿Õ¸ñ
 * 		String trim();
 * °´ÕÕÖ¸¶¨·ûºÅ·Ö¸î×Ö·û´®
 * 		String[] split(String str);
 * */
public class StringDemo04 {

	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = "  helloworld  ";
		String s3 = "  hello  world  ";
		System.out.println("---"+s1+"---");
		System.out.println("---"+s1.trim()+"---");
		System.out.println("---"+s2+"---");
		System.out.println("---"+s2.trim()+"---");
		System.out.println("---"+s3+"---");
		System.out.println("---"+s3.trim()+"---");
		
		String s4 = "aa,ss,dd,f,fg";
		String[] arr = s4.split(",");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}

}
