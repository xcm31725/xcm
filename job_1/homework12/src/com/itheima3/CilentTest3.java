package com.itheima3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @ClassName: CilentTest3  
 * @Description: TODO
 * 3���ͻ����������д�ַ���(����¼��),������ͳ���ַ����и��ַ����ֵĴ���,
		��д���ļ���,��ʽ����:
			a=2
			b=3
			g=1 
 * @author sudong
 * @date 2018��1��24�� ����9:01:18  
 *
 */
public class CilentTest3 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("sudong-PC", 520);
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = sc.nextLine();
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		pw.println(str);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		PrintWriter serverPW = new PrintWriter(new FileWriter("b.txt"), true);
		String line;
		while((line = br.readLine()) != null) {
			serverPW.println(line);
		}
		
		s.close();
	}

}
