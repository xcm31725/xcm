package com.itheima_02;

import java.util.Scanner;

/*
 * 键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
 * 90-100	优秀
 * 80-90	好
 * 70-80	良
 * 60-70	及格
 * 60以下	不及格
 * 
 * 分析：
 * 		A:键盘录入学生考试成绩
 * 			三步骤
 * 		B:通过简单的分析，我们决定采用if语句格式3来实现
 * 
 * 程序一定要考虑周全了。
 * 		安全数据
 * 		边界数据
 * 		错误数据
 */
public class IfTest2 {
	public static void main(String[] args) {
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据
		System.out.println("请输入学生的考试成绩：");
		int score = sc.nextInt();
		
		//if语句格式3
		/*
		if(score>=90 && score<=100){
			System.out.println("你的成绩属于优秀");
		}else if(score>=80 && score<90){
			System.out.println("你的成绩属于好");
		}else if(score>=70 && score<80){
			System.out.println("你的成绩属于良");
		}else if(score>=60 && score<70){
			System.out.println("你的成绩属于及格");
		}else {
			System.out.println("你的成绩属于不及格");
		}
		*/
		
		//我们发现程序不够健壮,加入错误数据的判断
		if(score<0 || score>100){
			System.out.println("你的成绩是错误的");
		}else if(score>=90 && score<=100){
			System.out.println("你的成绩属于优秀");
		}else if(score>=80 && score<90){
			System.out.println("你的成绩属于好");
		}else if(score>=70 && score<80){
			System.out.println("你的成绩属于良");
		}else if(score>=60 && score<70){
			System.out.println("你的成绩属于及格");
		}else {
			System.out.println("你的成绩属于不及格");
		}
	}
}
