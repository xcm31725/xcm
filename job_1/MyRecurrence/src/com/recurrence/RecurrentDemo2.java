package com.recurrence;
/*
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 		     小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
 *  	     问第二十个月的兔子对数为多少？
 *  
 *  第一月：1 = 1 + 0
 *  第二月：1 = 1 + 0
 *  第三月：2 = 1 + 1
 *  第四月：3 = 2 + 1
 *  第五月：5 = 3 + 2
 *  第六月：8 = 5 + 3
 *  
 *  斐波那契数列
 * */
public class RecurrentDemo2 {

	public static void main(String[] args) {
		int num = tu(20);
		System.out.println(num);
	}
	
	public static int tu(int n){
		if(n == 1){
			return 1;
		}else if(n == 2){
			return 1;
		}else{
			return tu(n - 1) + tu(n - 2);
		}
	}
}
