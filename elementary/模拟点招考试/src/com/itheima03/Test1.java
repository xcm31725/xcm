package com.itheima03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1.	按需求完成指定功能，题目如下（8分）
	项目根路径创建1个文件data.txt，用于存放程序写入的字符串 （文件的创建可以手动创建，无需使用程序创建）.
	使用循环语句，循环写入4个键盘录入的字符串到文件data.txt中，写入字符串之前需要提示当前录入的是第几个字符串.
	演示格式具体如下：图1为输入演示，图2为data.txt存入字符串的格式.


 * */
public class Test1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new FileWriter("data1.txt"));
		
		for(int i=0;i<4;i++){
			System.out.println("请输入第"+(i+1)+"个字符串");
			String s = sc.nextLine();
			
			StringBuilder sb = new StringBuilder(s);
			
			/*sb.append("第").append(i+1).append("行：").append(s);
			
			bw.write(sb.toString());*/
			bw.write("第"+(i+1)+"行："+s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}
