package com.itheima3;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 4、键盘录入任意一个年份，判断该年是闰年还是平年
		提示:
			1,2月份的天数就可以确定该年是闰年还是平年
			2,将时间设置为给定年份的3月1号,然后将时间往前设置一天就是2月份最后一天

			使用Calendar类中的add方法和set方法
			
			set(int year, int month, int day)
			add(int field, int i)
 * */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("请输入年份");
			int a = sc.nextInt();
			//String s = a + "";
			
			Calendar c = Calendar.getInstance();
			
			c.set(a,2,1);
			c.add(Calendar.DAY_OF_MONTH, -1);
			int b = c.get(Calendar.DAY_OF_MONTH);
			if(b == 28){
				System.out.println("平年");
			}else{
				System.out.println("闰年");
			}
			
		} catch (Exception e) {
			System.out.println("你输入的年份不符合要求");
		}
		
		
	}

}
