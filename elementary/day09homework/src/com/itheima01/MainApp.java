package com.itheima01;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		Student s = new Student("it001","黄渤",1.72);
		Student s1 = new Student("it002","孙红雷",1.78);
		Student s2 = new Student("it003","章子怡",1.64);
		Student s3 = new Student("it004","杨颖",1.68);
		
		array.add(s);
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		System.out.println("学号\t姓名\t身高");
		for (int i = 0; i < array.size(); i++) {
			Student stu = array.get(i);
			System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getHight());
		}
		
		System.out.println("len:"+array.size());
		
		System.out.println("第三个学员对象的属性值："+array.get(2).getId()+"\t"+array.get(2).getName()+"\t"+array.get(2).getHight());
		
		array.remove(3);
		
		System.out.println("len:"+array.size());
		
		Student s4 = new Student("it005","撒贝宁",1.67);
		array.set(0, s4);
		
		for(int i=0;i<array.size();i++){
			Student stu1 = array.get(i);
			if(stu1.getHight()>=1.70){
				System.out.println(stu1.getId()+"\t"+stu1.getName()+"\t"+stu1.getHight());
			}
		}

		for(int i=0;i<array.size();i++){
			Student stu1 = array.get(i);
			if(stu1.getName().startsWith("孙")){
				System.out.println(stu1.getId()+"\t"+stu1.getName()+"\t"+stu1.getHight());
			}
		}
		
		
	}

}

















