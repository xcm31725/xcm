package com.itheima03;

public class TestStudentTool {

	public static void main(String[] args) {
		Students[] arr = new Students[5];
		Students s = new Students("С��è",17,100);
		Students s1 = new Students("����è",18,98);
		Students s2 = new Students("����",17,90);
		Students s3 = new Students("����",22,80);
		Students s4 = new Students("ɵ��",23,58);
		
		arr[0] = s;
		arr[1] = s1;
		arr[2] = s2;
		arr[3] = s3;
		arr[4] = s4;
		
		
		StudentsTool t = new StudentsTool();
		
		t.listStudents(arr);
		
		int maxScore = t.getMaxScore(arr);
		System.out.println("maxScore:"+maxScore);
		
		Students maxStudent = t.getMaxStudent(arr);		
		System.out.println(maxStudent.getName()+"\t"+maxStudent.getAge()+"\t"+maxStudent.getScore());

		int averageScore = t.getAverageScore(arr);
		System.out.println("averageScore:"+averageScore);
		
		int count = t.getCount(arr);
		System.out.println("����������:"+count);
		
	}

	

}
