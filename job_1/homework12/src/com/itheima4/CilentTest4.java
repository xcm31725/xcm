package com.itheima4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @ClassName: CilentTest4  
 * @Description: TODO
 * 4、客户端向服务器端写字符串(键盘录入),服务器将字符串中robin的替换为*写回
		String中的replaceAll(String regex, String replacement) 方法可以实现替换
 * @author sudong
 * @date 2018年1月24日 下午9:02:03  
 *
 */
public class CilentTest4 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("sudong-PC", 520);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.nextLine();
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		pw.println(str);
		//pw.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(br.readLine());
		s.close();
	}

}
