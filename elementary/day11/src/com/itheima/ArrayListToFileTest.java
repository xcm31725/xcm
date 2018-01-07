package com.itheima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToFileTest {

	public static void main(String[] args) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>();
		
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			StringBuffer sb = new StringBuffer();
			
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	public static void addStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		String id;
		
		while(true){
			System.out.println("������ѧ�ţ�");
			id = sc.nextLine();
			
			boolean flag = false;
			
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				
				if(s.getId().equals(id)){
					flag = true;
					break;
				}
				
			}
			
			if(flag){
				System.out.println("�������ѧ���Ѿ��������������");
			}else{
				break;
			}
		}
		
		System.out.println("������������");
		String name = sc.nextLine();
		System.out.println("���������䣺");
		String age = sc.nextLine();
		System.out.println("�������ַ��");
		String address = sc.nextLine();
		
		Student s = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		array.add(s);
		
		System.out.println("��ӳɹ�");
	}

}
