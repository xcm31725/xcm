package com.itheima02;
/*
 * 3.有一定义好的字符串:  2A0a@0wz8qq0EE0#08，编写一个程序，获取数据中所有的数字，并按照固定的格式在控制台打印输出。
	打印格式：文件中所包含的数字有：20080808


 * */
public class StringTest {

	public static void main(String[] args) {
		String s = "2A0a@0wz8qq0EE8#08";
		//System.out.println(s.length());
		//char[] chs = new char[s.length()];
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				System.out.print(s.charAt(i));
			}
		}
		
		//System.out.println(str);
	}

}
