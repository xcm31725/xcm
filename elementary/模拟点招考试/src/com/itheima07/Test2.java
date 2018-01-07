package com.itheima07;

import java.util.Scanner;

/*  
 * 分析以下需求，并用代码实现（10分）
 *	键盘录入一个小数，要求小数点后的小数位最少3位
 *	定义方法，实现保留小数点后的两位小数(只舍不进)
 * 	比如： 输入5.6789 输出5.67,输入5.67389 输出5.67
 * 
 * */
public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个小数（要求小数点后的小数位最少3位）：");
		double d = sc.nextDouble();
		String s = d+"";
		
		int i = s.indexOf(".");
		/*if((s.length()-i)>3){
			String s1 = s.substring(0, i);
			String s2 = s.substring(i,i+3);
		
			System.out.println(s1+s2);
			
		}else{
			System.out.println("你输入的不合法");
		}*/
		
		String ss = s.substring(0,i+3);
		System.out.println(ss);
		/*if((s.length()-i)>3){
			String s1 = s.substring(0, i);
			String s2 = s.substring(i+2);
			
			String s3 = s1+"."+s2;
			System.out.println(s3);
		}else if((s.length()-i)==0){
			String s4 = "0."+s.substring(i+1);
			System.out.println(s4);
		}else{
			System.out.println("你输入的不合法");
		}*/	
	}

}
