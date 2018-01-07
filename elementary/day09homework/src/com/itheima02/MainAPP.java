package com.itheima02;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAPP {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		
		printArrayList(stuList);
		printArrayList(stuList);
		printArrayList(stuList);
		printAll(stuList);
		findMaxHeight(stuList);
	}
	
	public static void printAll(ArrayList<Student> stuList){
		System.out.println("ѧ��\t����\t�Ա�\t����\t���");
		
		for (int i = 0; i < stuList.size(); i++) {
			Student stu = stuList.get(i);
			System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getXingBie()+"\t"+stu.getAge()+"\t"+stu.getHight());
		}
	}
	
	public static void findMaxHeight(ArrayList<Student>stuList){
		System.out.println("ѧ��\t����\t�Ա�\t����\t���");
		double max = 0;
		int n = -1;
		for (int i = 0; i < stuList.size(); i++) {
			
			Student stu = stuList.get(i);
			if(stu.getHight()>max){
				max = stu.getHight();
				n = i;
			}

		}
		System.out.println(stuList.get(n).getId()+"\t"+stuList.get(n).getName()+"\t"+stuList.get(n).getXingBie()+"\t"+stuList.get(n).getAge()+"\t"+max);

	}
	
	
	public static void printArrayList(ArrayList<Student> stuList){
		/*Student s = new Student("it001","�Ʋ�","��",20,1.72);
		Student s1 = new Student("it002","�����","��",22,1.78);
		Student s2 = new Student("it003","������","Ů",18,1.64);
		
		stuList.add(s);
		stuList.add(s1);
		stuList.add(s2);*/
		
		Scanner sc = new Scanner(System.in);
		
		String id;
		
		while(true){
			System.out.println("������ѧ�ţ�");
			id = sc.nextLine();
			
			boolean flag = false;
			for (int i = 0; i < stuList.size(); i++) {
				Student s = stuList.get(i);
				if(s.getId().equals(id)){
					flag = true;
					break;
				}
				
			}
			
			if(flag){
				System.out.println("ѧ�ű�ռ�ã����������");
			}else{
				break;
			}
		}
		
		
		System.out.println("������������");
		String name = sc.nextLine();
		
		System.out.println("�������Ա�");
		String xingBie = sc.nextLine();
		
		System.out.println("���������䣺");
		int age = sc.nextInt();
		
		System.out.println("��������ߣ�");
		double hight = sc.nextDouble();
		
		Student s = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setXingBie(xingBie);
		s.setAge(age);
		s.setHight(hight);
		
		stuList.add(s);
		
		System.out.println("��ӳɹ�");
	}
}













