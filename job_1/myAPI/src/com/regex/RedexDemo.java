package com.regex;
/*
 * 验证扣扣号
 * 		5-15位
 * 		不能以0开始
 * 		全是数字
 * */
public class RedexDemo {

	public static void main(String[] args) {
		String qq = "12356";
		
		boolean flag = qq.matches("[1-9][0-9]{4,14}");
		System.out.println(flag);
		/*qq.toLowerCase();
		[a-z][aeiou][a-z];*/
	}

}
