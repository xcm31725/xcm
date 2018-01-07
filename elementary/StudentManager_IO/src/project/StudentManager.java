package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ѧ������ϵͳ
 * 
 * ������
 * 		1���鿴ѧ����Ϣ
 * 		2�����ѧ����Ϣ
 * 		3��ɾ��ѧ����Ϣ
 * 		4���޸�ѧ����Ϣ
 * 		5���˳�
 * */
public class StudentManager {
	public static void main(String[] args) throws IOException {
		String fileName = "student.txt";
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("-----------��ӭ����ѧ������ϵͳ-----------"); 
			System.out.println("�����ҵ���ҳ");
			System.out.println("1���鿴ѧ����Ϣ");
			System.out.println("2�����ѧ����Ϣ");
			System.out.println("3��ɾ��ѧ����Ϣ");
			System.out.println("4���޸�ѧ����Ϣ");
			System.out.println("5���˳�");
			
			System.out.println("���������ѡ��");
			String num = sc.nextLine();
			
			switch(num){
			case "1":
				//��ѯѧ����Ϣ
				findToStudent(fileName);
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
				System.out.println("��ӭʹ��");
				System.exit(0);
			}
		}
		
	}
	
	public static void readData(String fileName,ArrayList<Student> list) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		while((line=br.readLine())!=null){
			String[] str = line.split(",");
			
			Student s = new Student();
			s.setId(str[0]);
			s.setName(str[1]);
			s.setAge(str[2]);
			s.setAddress(str[3]);
			
			list.add(s);
		}
		br.close();
	}
	
	public static void writeData(String fileName,ArrayList<Student> list) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			
			StringBuilder sb = new StringBuilder();
			sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
			
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	//��ѯѧ����Ϣ
	public static void findToStudent(String fileName) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		readData(fileName,list);
		
		if(list.size()==0){
			System.out.println("������˼��û����Ҫ��ѯ��ѧ����Ϣ�����ȥ����ѡ��");
			return;
		}
		
		System.out.println("ѧ��\t����\t����\t��ַ");
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	
	//���ѧ����Ϣ
	public static void addStudent(String fileName) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		readData(fileName,list);
		
		Scanner sc = new Scanner(System.in);
		String id;
		
		while(true){
			System.out.println("������ѧ����ѧ��:");
			id = sc.nextLine();
			
			boolean flag = false;
			for (int i = 0; i < list.size(); i++) {
				Student str = list.get(i);
				
				if(str.getId().equals(id)){
					flag = true;
					break;
				}
			}
			
			if(flag){
				System.out.println("�������ѧ���ѱ�ռ�����������");
			}else{
				break;
			}
		}
		
		
		
		System.out.println("������ѧ�� ������:");
		String name = sc.nextLine();
		
		System.out.println("������ѧ�������䣺");
		String age = sc.nextLine();
		
		System.out.println("������ѧ���ĵ�ַ��");
		String address = sc.nextLine();
		
		Student s  = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		list.add(s);
		
		writeData(fileName,list);
		System.out.println("��ӳɹ�");
	}
	
	//ɾ��ѧ����Ϣ
	public static void deleteStudent(String fileName) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		readData(fileName,list);
		
		if(list.size()==0){
			System.out.println("������˼��û����Ҫɾ����ѧ����Ϣ�����ȥ����ѡ��");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		String id;
		
		int index = -1;
		
		System.out.println("������Ҫɾ��ѧ����ѧ��:");
		id = sc.nextLine();
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("������˼��û��Ҫɾ����ѧ�������ȥ����ѡ��");
		}else{
			list.remove(index);
			
			writeData(fileName,list);
			System.out.println("ɾ���ɹ�");
		}
	}
	
	//�޸�ѧ����Ϣ
	public static void updateStudent(String fileName) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		readData(fileName,list);
		
		if(list.size()==0){
			System.out.println("������˼��û����Ҫ�޸ĵ�ѧ����Ϣ�����ȥ����ѡ��");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		String id;
		
		
		int index = -1;
		
		System.out.println("������Ҫ�޸�ѧ����ѧ��:");
		id = sc.nextLine();
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("������˼��û��Ҫ�޸ĵ�ѧ�������ȥ����ѡ��");
		}else{
			System.out.println("������ѧ�� ������:");
			String name = sc.nextLine();
			
			System.out.println("������ѧ�������䣺");
			String age = sc.nextLine();
			
			System.out.println("������ѧ���ĵ�ַ��");
			String address = sc.nextLine();
			
			Student s  = new Student();
			
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			list.set(index, s);
			
			writeData(fileName,list);
			System.out.println("�޸ĳɹ�");
		}
		
	}
}















