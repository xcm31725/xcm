package com.cilent_server3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CilentTest {

	public static void main(String[] args) throws IOException {
		//创建客户端对象
		Socket s = new Socket("sudong-PC", 520);
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		//创建输出流对象
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		//发送数据
		pw.println(username);
		pw.println(password);
		
		//创建输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//读取数据
		String str = br.readLine();
		//输出数据
		System.out.println(str);
		//释放资源
		s.close();
	}

}
