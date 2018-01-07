package com.ithiema_01;
/*
 * 创建字符串对象
 * 
 * 注意:用.来切割字符串的时候.表示通配符，所以就把字符串切碎了，所以结果是一个长度为0 的数组
 * 如果拿一个字符串中没有的字符来切割，那么就切不动，所以结果是一个长度为1 的数组，数组的元素还是这个字符串
 * */
public class StringTest08 {

	public static void main(String[] args) {
		String s = "javahao,javabang,javaguaguajiao";
		String[] strs = s.split("java");
		String s1 = "";
		for (int i = 0; i < strs.length; i++) {
			s1+=/*"****"+*/strs[i];
		}
		System.out.println(s1);
	}

}
