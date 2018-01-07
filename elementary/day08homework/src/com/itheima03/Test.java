package com.itheima03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入大字符串：");
		String scrStr = sc.nextLine();

		System.out.print("请输入小字符串：");
		String delster = sc.nextLine();
		
		String[] str = scrStr.split(delster);
		
		int index=0;
		int count = 0;
		while((index=scrStr.indexOf(delster))!=-1){
			String s1 = scrStr.substring(0, index);
			String s2 = scrStr.substring(index+delster.length());
			scrStr = s1+s2;
			count++;	
		}
		
		/*String s = "";
		int count = -1;
		for (int i = 0; i < str.length; i++) {
			s += ""+str[i];
			count++;
		}*/
		System.out.println("源字符串中总共包含:"+count+" 个"+delster+" 删除"+delster+"后的字符串为:"+scrStr);

	}

}
