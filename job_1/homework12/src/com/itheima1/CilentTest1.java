package com.itheima1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @ClassName: Test1  
 * @Description: TODO
 * 1�����ļ��е����ݽ��з�ת,��д���ļ���
		����:
			����ʥ�ͽԼ�į,
			Ω������������.
			
		ִ�����Ч��:
			.������������Ω
			,į�Ž���ʥ����  
 * @author sudong
 * @date 2018��1��24�� ����8:02:42  
 *
 */
public class CilentTest1 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("sudong-PC", 520);
		scanner(s);
		s.shutdownOutput();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(new FileWriter("a.txt"), true);
		String line;
		while((line = br.readLine()) != null) {
			//System.out.println(line);
			pw.println(line);
		}
		//s.shutdownOutput();
		s.close();
	}
	
	public static void scanner(Socket s) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		while(true){
			System.out.println("������һ���ַ�����");
			String str = sc.nextLine();
			pw.println(str);
			
			if(str.contains("Exit")){
				break;
			}
		}
		
		
	}
	
	/*public static void main(String[] args) throws IOException {
		Socket s = new Socket("sudong-PC", 520);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ���ַ�����");
		String str1 = sc.nextLine();
		System.out.println("�������һ���ַ�����");
		String str2 = sc.nextLine();
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		pw.println(str1);
		pw.println(str2);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		String line;
		while((line = br.readLine()) != null){
			if(line.contains("Exit")) {
				System.out.println("-----");
				return;
			}
			pw.println(line);
		}
		
		BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt")));
		PrintWriter pw1 = new PrintWriter(new FileOutputStream("a.txt"), true);
		while((line = br.readLine()) != null){
			pw1.println(line);
		}
		
		s.close();
	}*/

}
