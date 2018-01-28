package com.itheima01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 4,求键盘录入5个学生(姓名是String类型,年龄是int类型,成绩是double类型)成绩的平均值
		键盘录入5个学生信息,格式为:姓名,年龄,成绩
			如:明星,19,99
		提示:
			Integer类中有一个方法parseInt(String s)将字符串转换为int值
			需要将键盘录入的数据封装到对象中
			容器的选取:
				5个学生需要选择一个容器		
 * */
public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"个学生的姓名：");
			String name = sc.next();
			
			System.out.println("请输入第"+(i+1)+"个学生的年龄：");
			int age = sc.nextInt();
			
			System.out.println("请输入第"+(i+1)+"个学生的成绩：");
			double score = sc.nextDouble();
			
			Student s = new Student();
			s.setName(name);
			s.setAge(age);
			s.setScore(score);
			
			list.add(s);
			System.out.println("第"+(i+1)+"个完成");
		}
		
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			sum += s.getScore();
		}
		
		double avg = (sum+0.0)/list.size();
		System.out.println("学生成绩的平均值:"+avg);
	}

}
