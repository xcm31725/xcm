package com.itheima;
/*
 * (1),定义一个方法 boolean isEmpty(String str),判断给定字符串是否是null或者""
			如果给定字符串是null,返回true
			如果给定字符串是"",返回true
			否则返回false
		(2),定义一个方法 boolean equals(String str1, String str2),判断给定的字符串是否相等
			如果str1和str2都是null的话,返回true
			如果str1和str2里内容相同,返回true
			否则返回false
		提示:工具类里所有的方法都应该是静态的
			构造方法应该私有,避免外界创建对象
 * */
public class StringUtil {
	private StringUtil(){}
	
	public static boolean isEmpty(String str){
		if((str == null)||(str == "")){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean equals(String str1, String str2){
		if(((str1 == null)&&(str2 == null))||(str1 == str2)){
			return true;
		}else{
			return false;
		}
	}
}
