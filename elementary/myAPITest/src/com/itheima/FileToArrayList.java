package com.itheima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayList {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
		
		ArrayList<Student> array = new ArrayList<Student>();
		
		
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
		
		System.out.println("学号\t姓名\t年龄\t地址");
		for(int i=0;i<array.size();i++){
			Student s = array.get(i);
			
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}

}
