package com.itheima04;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		//创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		//用有参构造方传参数
		Student s = new Student("小馋猫",18,100);
		Student s1 = new Student("馋嘴猫",17,98);
		Student s2 = new Student("果冻",22,59);
		Student s3 = new Student("傻瓜",23,50);
		Student s4 = new Student("甜心",19,62);
		
		//给集合赋值
		array.add(s);
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
	
		Student stu = getMaxScore(array);
		System.out.println(stu.getName()+"\t"+stu.getAge()+"\t"+stu.getScore());
		
		int sum = getSum(array);
		System.out.println("sum:"+sum);
		
		int avg = getAvg(array);
		System.out.println("avg:"+avg);
		
		int count = getBuJiGe(array);
		System.out.println("count:"+count);
	}
	
	//求最大学生的信息
	public static Student getMaxScore(ArrayList<Student> array){
		int max = 0;
		int index = -1;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			if(s.getScore()>max){
				max = s.getScore();
				index = i;	
			}	
		}
		//array.get(index).getName()+"\t"+array.get(index).getAge()+"\t"+array.get(index).getScore();
		//Student s = new Student(array.get(index).getName(),array.get(index).getAge(),array.get(index).getScore());
		Student s = array.get(index);
		return s;
	}
	
	//求5个学生的成绩总和
	public static int getSum(ArrayList<Student> array){
		int sum = 0;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			sum += s.getScore();
		}
		
		return sum;
	}
	
	//求5个学生的平均成绩
	public static int getAvg(ArrayList<Student> array){
		int sum = getSum(array);
		
		int avg = sum/array.size();
		
		return avg;
	}
	
	//求不及格的人数
	public static int getBuJiGe(ArrayList<Student> array){
		int count =0;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			if(s.getScore()<60){
				count++;
			}
		}
		return count;
	}
}
