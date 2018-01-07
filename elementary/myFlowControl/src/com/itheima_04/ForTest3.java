package com.itheima_04;
/*
 * 需求：求出1-100之间偶数和
 * 
 * 分析：
 * 		A:定义求和变量，初始化值是0
 * 		B:获取1-100之间的数据，用for循环实现
 * 		C:把获取到的数据进行判断，看是否是偶数
 * 			如果是，就累加
 * 		D:输出求和结果
 */
public class ForTest3 {
	public static void main(String[] args) {
		//定义求和变量，初始化值是0
		int sum = 0;
		
		//获取1-100之间的数据，用for循环实现
		for(int x=1; x<=100; x++) {
			//把获取到的数据进行判断，看是否是偶数
			if(x%2 ==0) {
				sum += x;
			}
		}
		
		//输出求和结果
		System.out.println("sum:"+sum);
	}
}
