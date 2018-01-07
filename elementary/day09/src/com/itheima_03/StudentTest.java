package com.itheima_03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		while(true){
		
			System.out.println("-----这是学生管理系统的主页面-----");
			System.out.println("1、查看学生信息");
			System.out.println("2、添加学生信息");
			System.out.println("3、删除学生信息");
			System.out.println("4、修改学生信息");
			System.out.println("5、退出");
			System.out.println("请输入你的选择：");
			
			Scanner sc = new Scanner(System.in);
			String choiceStudent = sc.nextLine();
			
			switch(choiceStudent){
			case "1":
				//查看信息
				findAllStudent(array);
				break;
			case "2":
				//添加学生
				addStudent(array);
				break;
			case "3":
				//删除
				deleteStudent(array);
				break;
			case "4":
				//修改学生
				updateStudent(array);
				break;
			case "5":
				//退出
				
			default:
				System.out.println("谢谢你的使用");
				System.exit(0);
			}
		}
	}
	//修改学生信息
	public static void updateStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入修改的学号：");
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
			System.out.println("没有找到要修改的，请回去继续你的操作");
		}else{
			System.out.println("请输入姓名：");
			String name = sc.nextLine();
			
			System.out.println("请输入年龄：");
			String age = sc.nextLine();
			
			System.out.println("请输入地址：");
			String address = sc.nextLine();
			
			Student s = new Student();
			
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			
			array.set(index, s);
			System.out.println("修改成功");
		}
	}
	
	//删除学习信息
	public static void deleteStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入学号：");
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
			System.out.println("没有找到要删除的，请回去继续你的操作");
		}else{
			array.remove(index);
			System.out.println("删除成功");
		}
		
	}
	
	//添加学生信息
	public static void addStudent(ArrayList<Student> array){
		Scanner sc = new Scanner(System.in);
		String id;
		while(true){
			System.out.println("请输入学号：");
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
				System.out.println("请重新输入学号：");
			}else{
				break;
			}	
		}

		System.out.println("请输入姓名：");
		String name = sc.nextLine();
		
		System.out.println("请输入年龄：");
		String age = sc.nextLine();
		
		System.out.println("请输入地址：");
		String address = sc.nextLine();
		
		Student s = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		array.add(s);
		
		System.out.println("添加成功");
	}
	
	//查看学生信息
	public static void findAllStudent(ArrayList<Student> array){
		if(array.size()==0){
			System.out.println("没有学生信息，请回去继续你的操作");
			return;
		}
		
		System.out.println("学号\t\t姓名\t年龄\t地址");
		for(int i=0;i<array.size();i++){
			Student s = array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
}
