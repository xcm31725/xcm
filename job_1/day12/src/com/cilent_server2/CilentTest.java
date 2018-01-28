package com.cilent_server2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class CilentTest {

	public static void main(String[] args) throws IOException {
		//创建客户端对象
		Socket s = new  Socket(InetAddress.getByName("sudong-PC"), 520);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		pw.println(username);
		pw.println(password);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str = br.readLine();
		System.out.println(str);
		
		s.close();
		
		
	}

}
