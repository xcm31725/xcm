package com.itheima07;

import java.util.ArrayList;

/*
 * 定义ArrayList集合，存入如下字符串："abc"，"12"， "java"，"mysql"，
 遍历集合,将长度小于4的元素左边填充字符串0，并在控制台打印输出修改后集
 合中所有元素

 * */
public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("abc");
		array.add("12");
		array.add("java");
		array.add("mysql");
		
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			while(s.length()<4){
				s = "0"+s;
			}
			/*if(s.length()<4){
				StringBuilder sb = new StringBuilder(s);
				sb.reverse();
				for(int j=sb.length();j<4;j++){
					sb.append("0");
				}
				sb.reverse();
				String ss = sb.toString();
				System.out.println(ss);
			}else{
				System.out.println(s);
			}*/
			array.set(i, s);
			//System.out.println(s);
		}
		System.out.println(array);
	}

}
