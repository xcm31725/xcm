package com.itheima_03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		while(true){
		
			System.out.println("-----����ѧ������ϵͳ����ҳ��-----");
			System.out.println("1���鿴ѧ����Ϣ");
			System.out.println("2�����ѧ����Ϣ");
			System.out.println("3��ɾ��ѧ����Ϣ");
			System.out.println("4���޸�ѧ����Ϣ");
			System.out.println("5���˳�");
			System.out.println("���������ѡ��");
			
			Scanner sc = new Scanner(System.in);
			String choiceStudent = sc.nextLine();
			
			switch(choiceStudent){
			case "1":
				//�鿴��Ϣ
				findAllStudent(array);
				break;
			case "2":
				//���ѧ��
				addStudent(array);
				break;
			case "3":
				//ɾ��
				deleteStudent(array);
				break;
			case "4":
				//�޸�ѧ��
				updateStudent(array);
				break;
			case "5":
				//�˳�
				
			default:
				System.out.println("лл���ʹ��");
				System.exit(0);
			}
		}
	}
	//�޸�ѧ����Ϣ
	public static void updateStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������޸ĵ�ѧ�ţ�");
		String id = sc.nextLine();
		
		int index = -1;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("û���ҵ�Ҫ�޸ĵģ����ȥ������Ĳ���");
		}else{
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
			
			array.set(index, s);
			System.out.println("�޸ĳɹ�");
		}
	}
	
	//ɾ��ѧϰ��Ϣ
	public static void deleteStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ѧ�ţ�");
		String id = sc.nextLine();
		
		int index = -1;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("û���ҵ�Ҫɾ���ģ����ȥ������Ĳ���");
		}else{
			array.remove(index);
			System.out.println("ɾ���ɹ�");
		}
		
	}
	
	//���ѧ����Ϣ
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
				System.out.println("����������ѧ�ţ�");
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
	
	//�鿴ѧ����Ϣ
	public static void findAllStudent(ArrayList<Student> array){
		if(array.size()==0){
			System.out.println("û��ѧ����Ϣ�����ȥ������Ĳ���");
			return;
		}
		
		System.out.println("ѧ��\t\t����\t����\t��ַ");
		for(int i=0;i<array.size();i++){
			Student s = array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
}
