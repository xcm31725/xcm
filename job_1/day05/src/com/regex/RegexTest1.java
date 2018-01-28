package com.regex;
/*
 * 字符串"传智播客有一个讲师讲JavaSE,名字是风清扬,讲的特备好,重要的事说三遍,风清扬,风清扬,风清扬";
 * 将上面的字符串中的"风清扬"替换为"***"
 * 
 * replaceAll(String regex, String replacement) :使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
 * String replaceFirst(String regex, String replacement) :使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
 * 
 * */
public class RegexTest1 {

	public static void main(String[] args) {
		String str = "传智播客有一个讲师讲JavaSE,名字是风清扬,讲的特备好,重要的事说三遍,风清扬,风清扬,风清扬";
		String replaceAllStr = str.replaceAll("风清扬", "***");
		System.out.println(replaceAllStr);
	}

}
