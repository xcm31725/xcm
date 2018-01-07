package com.itheima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 键盘录入3个学生信息(学号,姓名,年龄,居住地)存入集合。
 * 然后遍历集合把每一个学生信息存入文本文件(每一个学生信息为一行数据，自己定义分割标记)
 * 
 * 分析：
 * 		A:定义学生类
 * 		B:创建集合对象
 * 		C:写方法实现键盘录入学生信息，并把学生对象作为元素添加到集合
 * 		D:创建输出缓冲流对象
 * 		E:遍历集合,得到每一个学生信息，并把学生信息按照一定的格式写入文本文件
 * 			举例：heima001,向问天,30,北京
 * 		F:释放资源
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
				System.out.println("你输入的学号已经存在请从新输入");
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

}
