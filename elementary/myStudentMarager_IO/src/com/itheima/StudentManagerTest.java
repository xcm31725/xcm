package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * �����ҵ�ѧ������ϵͳ
 * 
 * �½�ѧ����
 * ����������
	 * 1��������ı�д
	 * 2����ѯѧ����Ϣ
	 * 3�����ѧ����Ϣ
	 * 4��ɾ��ѧ����Ϣ
	 * 5����ѯѧ����Ϣ
	 * 6���˳�
 * 
 * */
public class StudentManagerTest {

	public static void main(String[] args) throws IOException {
		//�������϶�����������ѧ����Ϣ
		//ArrayList<Student> array = new ArrayList<Student>();
		
		//�����ļ�·��
		String fileName = "student.txt";
		
		//ʹ��ѭ����ʵ���ظ�1��2��3��4����
		while(true){
			System.out.println("---------��ӭ����ѧ������ϵͳ---------");
			System.out.println("1����ѯѧ����Ϣ");
			System.out.println("2�����ѧ����Ϣ");
			System.out.println("3��ɾ��ѧ����Ϣ");
			System.out.println("4���޸�ѧϰ��Ϣ");
			System.out.println("5���˳�");
			
			System.out.print("���������ѡ��");
			//����¼��
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			
			//�ж����ĸ���֧
			switch(choiceString){
			case "1":
				//�鿴ѧ����Ϣ
				findAllStudent(fileName);
				break;
			case "2":
				//���ѧ����Ϣ
				addStudent(fileName);
				break;
			case "3":
				//ɾ��ѧ����Ϣ
				deleteStudent(fileName);
				break;
			case "4":
				//�޸�ѧ����Ϣ
				updateStudent(fileName);
				break;
			case "5":
			default:
				System.out.println("��ӭ��ʹ��");
				System.exit(0);//����JVM
			}
		}
	}

	//��ȡ�ļ��е�����
	public static void readerData(String fileName,ArrayList<Student> array) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		while((line=br.readLine())!=null){
			String[] str = line.split(",");
			
			Student s = new Student();
			
			s.setId(str[0]);
			s.setName(str[1]);
			s.setAge(str[2]);
			s.setAddress(str[3]);
			
			array.add(s);
		}
		
		br.close();
	}
	
	//�Ѽ��ϵ�����д���ļ�
	public static void writerData(String fileName,ArrayList<Student> array) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			
			bw.write(sb.toString());
			
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}
	
	//��ѯѧ����Ϣ
	public static void findAllStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readerData(fileName,array);
		
		if(array.size()==0){
			System.out.println("������˼��û����Ҫ��ѯ��ѧ����Ϣ�����ȥ��������");
			return;
		}
		
		System.out.println("ѧ��\t����\t����\t��ַ");
		for(int i=0;i<array.size();i++){
			Student s = array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	
	//���ѧ����Ϣ
	public static void addStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readerData(fileName,array);
		
		Scanner sc = new Scanner(System.in);
		
		String id;
		
		while(true){
			System.out.println("������ѧ����ѧ�ţ�");
			id = sc.nextLine();
			
			//������
			boolean flag = false;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				
				if(s.getId().equals(id)){
					flag = true;
					break;
				}
			}
			
			if(flag){
				System.out.println("�������ѧ�ű�ռ�ã�������������ѧ��");
			}else{
				break;
			}
		}
		
		System.out.println("������ѧ����������");
		String name = sc.nextLine();
		
		System.out.println("������ѧ�������䣺");
		String age = sc.nextLine();
		
		System.out.println("������ѧ���ĵ�ַ��");
		String address = sc.nextLine();
		
		//����ѧ������
		Student s = new Student();
		
		//��ȡѧ������Ϣ
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//��ѧ��������ӵ�������
		array.add(s);
		
		writerData(fileName,array);
		
		System.out.println("��ӳɹ�");
		
	}
	
	//ɾ��ѧ����Ϣ
	public static void deleteStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readerData(fileName,array);
		
		//�����жϼ�������û��ѧ����Ϣ
		if(array.size()==0){
			System.out.println("������˼��û����Ҫɾ����ѧ����Ϣ�����ȥ��������");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������Ҫɾ��ѧ����ѧ�ţ�");
		String id = sc.nextLine();
		
		//�������պ��ж�ѧ�����������
		int index = -1;
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("������˼��û����Ҫɾ����ѧ����Ϣ�����ȥ�������ѡ��");
		}else{
			array.remove(index);
			writerData(fileName,array);
			System.out.println("ɾ���ɹ�");
		}
	}	

	//�޸�ѧ����Ϣ
	public static void updateStudent(String fileName) throws IOException{
		
		ArrayList<Student> array = new ArrayList<Student>();
		
		readerData(fileName,array);
		
		//�����жϼ�������û��ѧ����Ϣ
		if(array.size()==0){
			System.out.println("������˼��û����Ҫ�޸ĵ�ѧ����Ϣ�����ȥ��������");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
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
			System.out.println("������˼��û��֪��Ҫ�޸ĵ�ѧ����Ϣ�����ȥ�������ѡ��");
		}else{
			System.out.println("��������������֣�");
			String name = sc.nextLine();
			
			System.out.println("��������������䣺");
			String age = sc.nextLine();
			
			System.out.println("����������µ�ַ��");
			String address = sc.nextLine();
			
			Student s = new Student();
			
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			array.set(index, s);
			
			writerData(fileName,array);
			
			System.out.println("�޸ĳɹ�");
		}
	}

}

