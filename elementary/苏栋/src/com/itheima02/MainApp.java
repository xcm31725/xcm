package com.itheima02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.itheima01.Student;

public class MainApp {

	public static void main(String[] args) throws IOException {
		ArrayList<Student> array = new ArrayList<Student>();
		readerData(array);
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			if(s.getName().equals("Â¬¿¡Òå")){
				s.setName("Ê·ÎÄ¹§");
			}
		}
		
		writerData(array);

	}
	
	public static void writerData(ArrayList<Student> array) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("name.txt"));
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			bw.write(s.getId()+","+s.getName()+","+s.getSex()+","+s.getAge());
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		
	}
	
	public static void readerData(ArrayList<Student> array) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("name.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			String[] str = line.split(",");
			
			Student s = new Student();
			
			s.setId(str[0]);
			s.setName(str[1]);
			s.setSex(str[2]);
			s.setAge(str[3]);
			
			array.add(s);
		}
		
		br.close();
	} 

}
