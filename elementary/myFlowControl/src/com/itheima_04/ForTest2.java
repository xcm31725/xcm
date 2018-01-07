package com.itheima_04;
/*
 * 需求：求出1-5之间数据之和
 * 
 * 分析：
 * 		A:定义求和变量，初始化值是0
 * 		B:获取1-5之间的数据，用for循环实现
 * 		C:把每一次获取到的数据，累加起来就可以了
 * 		D:输出求和变量即可
 */
public class ForTest2 {
	public static void main(String[] args) {
		//定义求和变量，初始化值是0
		int sum = 0;
		
		//获取1-5之间的数据，用for循环实现
		for(int x=1; x<=5; x++) {
			//把每一次获取到的数据，累加起来就可以了
			//sum = sum + x;
			/*
			 * 第一次：sum = 0 + 1 = 1
			 * 第二次：sum = 1 + 2 = 3
			 * 第三次：sum = 3 + 3 = 6
			 * 第四次：sum = 6 + 4 = 10
			 * 第五次：sum = 10 + 5 = 15
			 */
			sum += x;
		}
		
		//输出求和结果
		System.out.println("sum:"+sum);
	}
}
