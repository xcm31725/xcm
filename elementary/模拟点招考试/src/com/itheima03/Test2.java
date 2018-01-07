package com.itheima03;
//2.	获取10~99（包含10和99）的“总和”与“奇数”的个数，并在控制台打印输出
public class Test2 {
	public static void main(String[] args) {
		int sum = 0;
		int count =0;
		for(int i=10;i<100;i++){
			if(i%2!=0){
				count++;
			}
			sum += i;
		}
		
		System.out.println("sum:"+sum);
		System.out.println("count:"+count);
	}
}
