package com.itheima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));
		
		while(true){
			System.out.println("请输入要存储信息：");
			String s = sc.nextLine();
			
			if(s.equals("886")){
				break;
			}
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}

}
