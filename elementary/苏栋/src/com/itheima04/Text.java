package com.itheima04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
	2. user.txt文件中初始存放的用户信息有如下：
		jack,123
		rose,123
		tom,123
	3.要求完成如下功能：
	  程序运行时：控制台提示用户输入注册的用户名和密码；
	   验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
	   是：控制台提示：用户名已存在
	   否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；

 * */
public class Text {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入用户名:");
		String username = sc.nextLine();
		
		System.out.print("请输入密码:");
		String password = sc.nextLine();

		boolean flag = false;
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));
		String line = null;
	
		while((line = br.readLine()) != null) {
			
			int index = line.indexOf(",");
			
			String user = line.substring(0, index);
			if(username.equals(user)) {
				flag = true;
			}
		}
		br.close();
		if(flag) {
			System.out.println("不好意思用户名已经存在");
		} else {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
			
			bw.newLine();
			bw.write(username+","+password);

			bw.close();
			
			System.out.println("用户名和密码注册成功");
		}
	}

}
