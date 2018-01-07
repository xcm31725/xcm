package com.itheima;

public class StudentDemo {

	public static void main(String[] args) {
		Student[] sts = new Student[3];
		
		Student s1 = new Student("xcm",17);
		Student s2 = new Student("xka",18);
		Student s3 = new Student("xgd",22);
		
		sts[0] = s1;
		sts[1] = s2;
		sts[2] = s3;
		
		for (int i = 0; i < sts.length; i++) {
			Student ss = sts[i];
			System.out.println(ss.getName()+"---"+ss.getAge());
		}
	}

}
