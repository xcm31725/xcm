package com.itheima4;
/*
 * 5、分析以下需求，并用代码实现：
		(1)有一个数字字符串"25 11 -6 20 102 9",数字之间用空格间隔	
		(2)在控制台打印出此字符串中最大的数字
		提示:用String类提供的split方法(用" "(空格)作为split方法的参数来切割)，
			然后生成对应的数字字符串数组
 * */
public class Test {

	public static void main(String[] args) {
		String s = "25 11 -6 20 102 9";
		String[] arr = s.split(" ");
		int max = Integer.parseInt(arr[0]);
		
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(arr[i]);
			
			if(max<a){
				max=a;
			}
		}
		System.out.println(max);
	}
	

}
