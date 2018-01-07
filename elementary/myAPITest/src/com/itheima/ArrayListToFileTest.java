package com.itheima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ����¼��3��ѧ����Ϣ(ѧ��,����,����,��ס��)���뼯�ϡ�
 * Ȼ��������ϰ�ÿһ��ѧ����Ϣ�����ı��ļ�(ÿһ��ѧ����ϢΪһ�����ݣ��Լ�����ָ���)
 * 
 * ������
 * 		A:����ѧ����
 * 		B:�������϶���
 * 		C:д����ʵ�ּ���¼��ѧ����Ϣ������ѧ��������ΪԪ����ӵ�����
 * 		D:�����������������
 * 		E:��������,�õ�ÿһ��ѧ����Ϣ������ѧ����Ϣ����һ���ĸ�ʽд���ı��ļ�
 * 			������heima001,������,30,����
 * 		F:�ͷ���Դ
 */
public class ArrayListToFileTest {

	public static void main(String[] args) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>();
		
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			
			String str = sb.toString();
			
			bw.write(str);
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
