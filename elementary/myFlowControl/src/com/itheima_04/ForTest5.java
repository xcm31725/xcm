package com.itheima_04;
/*
 * 需求：统计”水仙花数”共有多少个
 * 
 * 分析：
 * 		A:定义统计变量，初始化值是0
 * 		B:获取三位数，用for循环实现
 * 		C:获取三位数的个位，十位，百位
 * 		D:判断这个三位数是否是水仙花数，如果是，统计变量++
 * 		E:输出统计结果就可以了
 */
public class ForTest5 {
	public static void main(String[] args) {
		//定义统计变量，初始化值是0
		int count = 0;
		
		//获取三位数，用for循环实现
		for(int x=100; x<1000; x++) {
			//获取三位数的个位，十位，百位
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
			
			//判断这个三位数是否是水仙花数，如果是，统计变量++
			if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x) {
				count++;
			}
		}
		
		//输出统计结果就可以了
		System.out.println("水仙花数共有："+count+"个");
	}
}
