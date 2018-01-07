package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 学生管理系统
 * 
 * 主界面
 * 		1、查看学生信息
 * 		2、添加学生信息
 * 		3、删除学生信息
 * 		4、修改学生信息
 * 		5、退出
 * */
public class StudentManager {
	public static void main(String[] args) throws IOException {
		String fileName = "student.txt";
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("-----------欢迎来到学生管理系统-----------"); 
			System.out.println("这是我的主页");
			System.out.println("1、查看学生信息");
			System.out.println("2、添加学生信息");
			System.out.println("3、删除学生信息");
			System.out.println("4、修改学生信息");
			System.out.println("5、退出");
			
			System.out.println("请输入你的选择：");
			String num = sc.nextLine();
			
			switch(num){
			case "1":
				//查询学生信息
				findToStudent(fileName);
				break;
			case "2":
				//添加学生信息
				addStudent(fileName);
				break;
			case "3":
				//删除学生信息
				deleteStudent(fileName);
				break;
			case "4":
				//修改学生信息
				updateStudent(fileName);
				break;
			case "5":
				//退出
			default:
				System.out.println("欢迎使用");
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
	
	//查询学生信息
	public static void findToStudent(String fileName) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		readData(fileName,list);
		
		if(list.size()==0){
			System.out.println("不好意思，没有你要查询的学生信息，请回去从新选择");
			return;
		}
		
		System.out.println("学号\t姓名\t年龄\t地址");
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	
	//添加学生信息
	public static void addStudent(String fileName) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		readData(fileName,list);
		
		Scanner sc = new Scanner(System.in);
		String id;
		
		while(true){
			System.out.println("请输入学生的学号:");
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
				System.out.println("你输入的学号已被占用请从新输入");
			}else{
				break;
			}
		}
		
		
		
		System.out.println("请输入学生 的姓名:");
		String name = sc.nextLine();
		
		System.out.println("请输入学生的年龄：");
		String age = sc.nextLine();
		
		System.out.println("请输入学生的地址：");
		String address = sc.nextLine();
		
		Student s  = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		list.add(s);
		
		writeData(fileName,list);
		System.out.println("添加成功");
	}
	
	//删除学生信息
	public static void deleteStudent(String fileName) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		readData(fileName,list);
		
		if(list.size()==0){
			System.out.println("不好意思，没有你要删除的学生信息，请回去从新选择");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		String id;
		
		int index = -1;
		
		System.out.println("请输入要删除学生的学号:");
		id = sc.nextLine();
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("不好意思，没有要删除的学生，请回去从新选择");
		}else{
			list.remove(index);
			
			writeData(fileName,list);
			System.out.println("删除成功");
		}
	}
	
	//修改学生信息
	public static void updateStudent(String fileName) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		readData(fileName,list);
		
		if(list.size()==0){
			System.out.println("不好意思，没有你要修改的学生信息，请回去从新选择");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		String id;
		
		
		int index = -1;
		
		System.out.println("请输入要修改学生的学号:");
		id = sc.nextLine();
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			
			if(s.getId().equals(id)){
				index = i;
				break;
			}
		}
		
		if(index == -1){
			System.out.println("不好意思，没有要修改的学生，请回去从新选择");
		}else{
			System.out.println("请输入学生 的姓名:");
			String name = sc.nextLine();
			
			System.out.println("请输入学生的年龄：");
			String age = sc.nextLine();
			
			System.out.println("请输入学生的地址：");
			String address = sc.nextLine();
			
			Student s  = new Student();
			
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			list.set(index, s);
			
			writeData(fileName,list);
			System.out.println("修改成功");
		}
		
	}
}















