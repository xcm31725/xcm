package com.itheima1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @ClassName: Test1  
 * @Description: TODO
 * 1、将文件中的内容进行反转,回写到文件中
		例如:
			古来圣贤皆寂寞,
			惟有饮者留其名.
			
		执行完后效果:
			.名其留者饮有惟
			,寞寂皆贤圣来古  
 * @author sudong
 * @date 2018年1月24日 下午8:02:42  
 *
 */
public class Test1 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("sudong-PC", 520);
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		String str1 = sc.nextLine();
		System.out.println("请输入第一个字符串：");
		String str2 = sc.nextLine();
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		pw.println(str1);
		pw.println(str2);
		*/
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		String line;
		while((line = br.readLine()) != null){
			/*if(line.contains("Exit")) {
				System.out.println("-----");
				return;
			}*/
			pw.println(line);
		}
		
		BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt")));
		PrintWriter pw1 = new PrintWriter(new FileOutputStream("a.txt"), true);
		while((line = br.readLine()) != null){
			pw1.println(line);
		}
		
		s.close();
	}

}
