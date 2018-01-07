package com.itheima_06;
/*
 * 三种循环的区别：
 * 		A:do...while至少执行一次循环体
 * 		B:for,while循环先判断条件是否成立，然后决定是否执行循环体
 * 
 * for和while的小区别：
 * 		for循环的初始化变量，在循环结束后，不可以被访问。而while循环的初始化变量，是可以被继续使用的。
 * 		如果初始化变量，后面还要继续访问，就使用while，否则，推荐使用for。
 * 
 * 循环的使用推荐：
 * 		for -- while -- do...while
 */
public class DoWhileDemo2 {
	public static void main(String[] args) {
		/*
		int x = 3;
		while(x<3) {
			System.out.println("我爱林青霞");
			x++;
		}
		System.out.println("--------------");
		int y = 3;
		do {
			System.out.println("我爱林青霞");
			y++;
		}while(y<3);
		*/
		
		
		for(int x=1; x<=10; x++){
			System.out.println("爱生活，爱Java");
		}
		//这里的x无法继续访问
		//System.out.println(x);
		System.out.println("-----------------");
		
		int y = 1;
		while(y<=10) {
			System.out.println("爱生活，爱Java");
			y++;
		}
		System.out.println(y);
	}
}
