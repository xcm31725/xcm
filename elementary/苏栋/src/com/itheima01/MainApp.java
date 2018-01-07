package com.itheima01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Test2_2.txt"));
		
		printStudent(array);
		printStudent(array);
		printStudent(array);
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			bw.write(s.getId()+","+s.getName()+","+s.getSex()+","+s.getAge());
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}
	
	public static void printStudent(ArrayList<Student> array){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ����ѧ�ţ�");
		String id = sc.nextLine();
		System.out.println("������ѧ����������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����Ա�");
		String sex = sc.nextLine();
		System.out.println("������ѧ�������䣺");
		String age = sc.nextLine();
		
		Student s = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setSex(sex);
		s.setAge(age);
		
		array.add(s);
		System.out.println("��ӳɹ�");
	}

}
