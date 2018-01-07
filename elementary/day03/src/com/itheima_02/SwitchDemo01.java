package com.itheima_02;

import java.util.Scanner;

/*
 * switch格式解释：
 * 		表达式：byte、short、int、char
 * 			JDK5以后可以是枚举
 * 			JDK7以后可以是字符串
 * 		case后面的值：就是用来和表达式的值进行匹配的内容
 * 		break：表示中断的意思
 * 		default：所有的值都不匹配的时候，就执行default
 * 执行流程：
 * 		A：首先计算表达式的值
 * 		B：拿着这个计算出来的值，依次和case后面的值进行比较，一旦有匹配的，就执行对应的语句体，在执行的过程中，遇到break就结束
 * */
//选择控制第几步用switch
public class SwitchDemo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入星期（1~7）之间:");
		int weekday = sc.nextInt();
		
		/*switch(weekday){
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("你输入的星期有误");
			break;
		}
		*/
		
		//穿透效果
		switch(weekday){
		case 1:	
		case 2:	
		case 3:	
		case 4:	
		case 5:
			break;
		case 6:
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("你输入的星期有误");
			break;
		}

	}

}
