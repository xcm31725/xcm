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
 * 这是我的学生管理系统的主类
 * 
 * 步骤：
 * A:定义学生类
 * B:学生管理系统的主页面
 * C:查看页面
 * D:增加页面
 * E:删除页面
 * F:修改页面
 * */
public class StudentManagerTest {

	public static void main(String[] args) throws IOException {
		String fileName = "student.txt";
		
		Scanner sc = new Scanner(System.in);
		//ArrayList<Student> array = new ArrayList<Student>();
				
		while(true){
			System.out.println("-------这是我的学生管理系统主页-------");
			System.out.println("1 查看学生信息");
			System.out.println("2 添加学生信息");
			System.out.println("3 删除学生信息");
			System.out.println("4 修改学生信息");
			System.out.println("5 退出");
//			System.out.println("请输入你要操作内容：");
			
			//Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要操作内容：");
			String choiceString = sc.nextLine();
			
			switch(choiceString){
			case "1":
				findAllStudent(fileName);
				//查看学生信息
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
				System.out.println("你输入的有误");
				System.exit(0);
				
			}
		}
	}
	
	//读取文件中的数据传到集合中
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
	
	//把文件写入文本中
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
	
	//修改学生信息
	public static void updateStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(fileName,array);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改学生的学号：");
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
			System.out.println("不好意思，你要修改的学生信息不存在，请回去继续你的选择");
		}else{
			System.out.println("请输入学生的姓名：");
			String name = sc.nextLine();
			
			System.out.println("请输入学生的年龄：");
			String age = sc.nextLine();
			
			System.out.println("请输入学生的地址：");
			String address = sc.nextLine();
			
			Student s = new Student();
			
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			array.set(index, s);
			writeData(fileName,array);
			System.out.println("修改成功");
			
		}
	}
	
	//删除学生信息
	public static void deleteStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(fileName,array);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除的学生的学号：");
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
			System.out.println("不好意思，你删除的学生信息不存在，请回去从新选择");
		}else{
			array.remove(index);
			writeData(fileName,array);
			System.out.println("删除成功");
		}
		
	}
	
	//添加学生信息
	public static void addStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(fileName,array);
		Scanner sc = new Scanner(System.in);
		String id;
		
		
		while(true){
			System.out.println("请输入学号：");
			id = sc.nextLine();
			
			//定义标记
			boolean flag = false;
			for (int i = 0; i < array.size(); i++) {
				Student s = array.get(i);
				if(s.getId().equals(id)){
					flag  = true;
					break;
				}
			}
			
			if(flag){
				System.out.println("你输入的id已经占用，请从新输入");
			}else{
				break;
			}
		}
		
		System.out.println("请输入名字：");
		String name = sc.nextLine();
		
		System.out.println("请输入年龄：");
		String age = sc.nextLine();
		
		System.out.println("请输入地址：");
		String address = sc.nextLine();
		
		//创建学生对象
		Student s = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		/*for (int i = 0; i < array.size(); i++) {
			Student str = array.get(i);
			array.add(s);
		}*/
		//获取集合的值
		array.add(s);
		
		writeData(fileName,array);
		
		System.out.println("添加学生成功");
	}
	
	//查看学生信息
	public static void findAllStudent(String fileName) throws IOException{
		ArrayList<Student> array = new ArrayList<Student>();
		
		readData(fileName,array);
		//判断是否有信息
		if(array.size()==0){
			System.out.println("当前没有学生的信息，请先添加学生信息");
			return;
		}
		
		System.out.println("学号\t\t姓名\t年龄\t地址");
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	

}
