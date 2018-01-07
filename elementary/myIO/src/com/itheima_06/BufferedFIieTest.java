package com.itheima_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BufferedFIieTest {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		readerData(array);
		
		Scanner sc = new Scanner(System.in);
		String username;
		boolean flag = false;
		while(true){
			System.out.println("请输入用户名：");
			username = sc.nextLine();
			
			for (int i = 0; i < array.size(); i++) {
				String s = array.get(i);
				if(s.equals(username)){
					flag = true;
					break;
				}
			}
			
			if(flag){
				System.out.println("你输入的用户名已经存在");
			}else{
				break;
			}
		}
		
		
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		
	}
	
	public static void readerData(ArrayList<String> array) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));
		String line;
		
		while((line=br.readLine())!=null){
			String s = line.split(",")[0];
			
			array.add(s);
		}
		
		br.close();
		
	}
	
	public static void writerData() throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt"));
	}
}
