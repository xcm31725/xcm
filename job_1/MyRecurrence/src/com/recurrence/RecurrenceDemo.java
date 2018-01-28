package com.recurrence;
/*
 * 需求：求5的阶乘
 * 5! = 5 * 4 * 3 * 2 * 1;  //120
 * 5! = 5 * 4!;					//120
 * 		4! = 4 * 3!;			//24
 * 			3! = 3 * 2!;		//6
 * 				2! = 2 * 1!;	//2
 * 					1! = 1;     //1
	n! = n * (n - 1)!
	
	递归：把大问题拆成很多小问题，然后再把小问题拆成更多的小问题，
			当我们把更多小问题解决了，小问题也解决了
				随着小问题的解决，大问题也随之解决了
	在方法本身不断的调用方法自己
	
	递归注意事项：
			递归一定要有出口，内存溢出
			递归次数不宜过多，内存溢出
			
	public void show(int n) {//5
		//出口
		if(n == 0) {
			return;
		}
		
		show(n - 1);
	}
**/
public class RecurrenceDemo {

	public static void main(String[] args) {
		int jc = jC(5);
		System.out.println(jc);
	}
	
	//求一个数的阶乘
	public static int jC(int n) {
		//必须有出口
		if(n == 1){
			return 1;
		}else {
			return n * jC(n - 1);
		}
	}
}
