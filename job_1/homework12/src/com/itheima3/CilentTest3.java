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
 * 3、客户端向服务器写字符串(键盘录入),服务器统计字符串中各字符出现的次数,
		并写到文件中,格式如下:
			a=2
			b=3
			g=1 
 * @author sudong
 * @date 2018年1月24日 下午9:01:18  
 *
 */
public class CilentTest3 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("sudong-PC", 520);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
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
