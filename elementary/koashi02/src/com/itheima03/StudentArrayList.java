package com.itheima03;

import java.util.ArrayList;

/*
 * 创建一个学生类，包含两个私有属性：姓名（name）和成绩（score），（name的类型为String类型，score的类型为int类型）并提供无参和有参构造，get/set方法 
	创建一个ArrayList集合为list
	添加3个学生对象到list集合中，分别为：
            姓名 成绩
            张三  99
            李四  66
           王五  77
	遍历集合，将list集合中成绩小于70的学生打印出来
	在控制台上打印list集合中成绩大于70的学生的分数平均值

 * */
public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s = new Student("张三",99);
		Student s1 = new Student("李四",66);
		Student s2 = new Student("王五",77);
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		int sum = 0;
		int count = 0;
		System.out.println("成绩小于70：");
		for (int i = 0; i < list.size(); i++) {
			Student str = list.get(i);
			
			if(str.getScore()<70){
				
				System.out.println(str.getName()+"\t"+str.getScore());
			}
			
			
			
		}
		System.out.println("成绩大于70的平均成绩：");
		for (int i = 0; i < list.size(); i++) {
			Student str = list.get(i);
			
			if(str.getScore()>70){	
				sum += str.getScore();
				count++;
				//System.out.println(str.getName()+"\t"+str.getScore());
			}
			
		}
		double avg = (sum+0.0)/count;
		System.out.println("avg:"+avg);
		
	}
}
