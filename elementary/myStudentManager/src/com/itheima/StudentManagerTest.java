package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * �����ҵ�ѧ������ϵͳ������
 * 
 * ���裺
 * A:����ѧ����
 * B:ѧ������ϵͳ����ҳ��
 * C:�鿴ҳ��
 * D:����ҳ��
 * E:ɾ��ҳ��
 * F:�޸�ҳ��
 * */
public class StudentManagerTest {

	public static void main(String[] args) throws IOException {
		String fileName = "student.txt";
		
		Scanner sc = new Scanner(System.in);
		//ArrayList<Student> array = new ArrayList<Student>();
				
		while(true){
			System.out.println("-------�����ҵ�ѧ������ϵͳ��ҳ-------");
			System.out.println("1 �鿴ѧ����Ϣ");
			System.out.println("2 ���ѧ����Ϣ");
			System.out.println("3 ɾ��ѧ����Ϣ");
			System.out.println("4 �޸�ѧ����Ϣ");
			System.out.println("5 �˳�");
//			System.out.println("��������Ҫ�������ݣ�");
			
			//Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�������ݣ�");
			String choiceString = sc.nextLine();
			
			switch(choiceString){
			case "1":
				findAllStudent(fileName);
				//�鿴ѧ����Ϣ
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
				//�˳�
				
			default:
				System.out.println("�����������");
				System.exit(0);
				
			}
		}
	}
	
	//��ȡ�ļ��е����ݴ���������
	public static void readData(String fileName,ArrayList<Student> array) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		while((line=br.readLine())!=null){
			String[] arr = line.split(",");
			
			Student s = new Student();
			
			s.setId(arr[0]);
			s.setName(arr[1]);
			s.setAge(arr[2]);
			s.setAddress(arr[3]);
			
			array.add(s);
		}
		br.close();
	}
	
	//���ļ�д���ı���
	public static void writeData(String fileName,ArrayList<Student> array) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		
		for (int i = 0; i < array.size(); i++) {
			Student str = array.get(i);
			
			StringBuilder sb = new StringBuilder();
			sb.append(str.getId()).append(",").append(str.getName()).append(",").append(str.getAge()).append(",").append(str.getAddress());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	//�޸�ѧ����Ϣ
	public static void updateStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(fileName,array);
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�޸�ѧ����ѧ�ţ�");
		String id = sc.nextLine();
		
		int index = -1;
		for(int i=0; i<array.size(); i++){
			Student s = array.get(i);
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("������˼����Ҫ�޸ĵ�ѧ����Ϣ�����ڣ����ȥ�������ѡ��");
		}else{
			System.out.println("������ѧ����������");
			String name = sc.nextLine();
			
			System.out.println("������ѧ�������䣺");
			String age = sc.nextLine();
			
			System.out.println("������ѧ���ĵ�ַ��");
			String address = sc.nextLine();
			
			Student s = new Student();
			
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			array.set(index, s);
			writeData(fileName,array);
			System.out.println("�޸ĳɹ�");
			
		}
	}
	
	//ɾ��ѧ����Ϣ
	public static void deleteStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(fileName,array);
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫɾ����ѧ����ѧ�ţ�");
		String id = sc.nextLine();
		
		int index = -1;
		for(int i=0; i<array.size(); i++){
			Student s = array.get(i);
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("������˼����ɾ����ѧ����Ϣ�����ڣ����ȥ����ѡ��");
		}else{
			array.remove(index);
			writeData(fileName,array);
			System.out.println("ɾ���ɹ�");
		}
		
	}
	
	//���ѧ����Ϣ
	public static void addStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(fileName,array);
		Scanner sc = new Scanner(System.in);
		String id;
		
		
		while(true){
			System.out.println("������ѧ�ţ�");
			id = sc.nextLine();
			
			//������
			boolean flag = false;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if(s.getId().equals(id)){
					flag  = true;
					break;
				}
			}
			
			if(flag){
				System.out.println("�������id�Ѿ�ռ�ã����������");
			}else{
				break;
			}
		}
		
		System.out.println("���������֣�");
		String name = sc.nextLine();
		
		System.out.println("���������䣺");
		String age = sc.nextLine();
		
		System.out.println("�������ַ��");
		String address = sc.nextLine();
		
		//����ѧ������
		Student s = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		/*for (int i = 0; i < array.size(); i++) {
			Student str = array.get(i);
			array.add(s);
		}*/
		//��ȡ���ϵ�ֵ
		array.add(s);
		
		writeData(fileName,array);
		
		System.out.println("���ѧ���ɹ�");
	}
	
	//�鿴ѧ����Ϣ
	public static void findAllStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(fileName,array);
		//�ж��Ƿ�����Ϣ
		if(array.size()==0){
			System.out.println("��ǰû��ѧ������Ϣ���������ѧ����Ϣ");
			return;
		}
		
		System.out.println("ѧ��\t\t����\t����\t��ַ");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	

}
