package com.print;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @ClassName: PrintWriterTest1  
 * @Description: TODO
 *  * 使用打印流复制文本文件
 * 
 * 数据源	FileDemo.java	BufferedReader
 * 目的地	b\\FileDemo.java	PrintWriter
 * 
 * @author sudong
 * @date 2018年1月22日 上午10:34:41  
 *
 */
public class PrintWriterTest1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("b\\FileDemo.java"), true);
		
		String line;
		
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		
		br.close();
		pw.close();
	}

}
