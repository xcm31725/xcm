package com.itheima1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @ClassName: Test1  
 * @Description: TODO
 * 1、根据要求,用代码实现
		使用BufferedReader+FileReader读取文本文件
			打印流PrintWriter写出文本文件,使用自动刷新
			将a\\d.txt复制到b\\d.txt
 * @author sudong
 * @date 2018年1月21日 下午8:08:07  
 *
 */
public class Test1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a\\d.txt"));
		
		PrintWriter pw = new PrintWriter(new FileOutputStream("b\\d.txt"), true);
		
		String line;
		
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		
		pw.close();
		br.close();
	}

}
