package com.itheima03;

import java.util.ArrayList;

import com.itheima02.Student;

public class StudentsTool {
	public void listStudents(Students[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+"\t"+arr[i].getName()+"\t"+arr[i].getScore());
		}
	}
	
	public int getMaxScore(Students[] arr){
		ArrayList<Students> array = new ArrayList<Students>();
		
		for (int i = 0; i < arr.length; i++) {
			array.add(arr[i]);
		}
		
		int max = 0;
		for (int i = 0; i < array.size(); i++) {
			
			Students stu = array.get(i);
			if(stu.getScore()>max){
				max = stu.getScore();
			}

		}
		//System.out.println(array.get(n).getName()+"\t"+array.get(n).getAge()+"\t"+max);
		return max;
	}
	
	public Students getMaxStudent(Students[] arr){
		ArrayList<Students> array = new ArrayList<Students>();
		
		for (int i = 0; i < arr.length; i++) {
			array.add(arr[i]);
		}
		
		int max = 0;
		int n = -1;
		for (int i = 0; i < array.size(); i++) {
			
			Students stu = array.get(i);
			if(stu.getScore()>max){
				max = stu.getScore();
				n = i;
			}
		}
		Students s = array.get(n);
		
		return s;
	}
	
	public int getAverageScore(Students[] arr){
		ArrayList<Students> array = new ArrayList<Students>();
		
		for (int i = 0; i < arr.length; i++) {
			array.add(arr[i]);
		}
		
		int n = 0;
		for (int i = 0; i < array.size(); i++) {
			
			Students stu = array.get(i);
			
			n += stu.getScore();
		}
		//System.out.println(array.get(n).getName()+"\t"+array.get(n).getAge()+"\t"+max);
		int avg = n/array.size();
		return avg;
	}
	
	public int getCount(Students[] arr){
		ArrayList<Students> array = new ArrayList<Students>();
		
		for (int i = 0; i < arr.length; i++) {
			array.add(arr[i]);
		}
		
		int count = 0;
		for (int i = 0; i < array.size(); i++) {
			
			Students stu = array.get(i);
			if(stu.getScore()<60){
				count++;
			}

		}
		//System.out.println(array.get(n).getName()+"\t"+array.get(n).getAge()+"\t"+max);
		return count;
	}
}
