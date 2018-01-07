package com.itheima_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 缓冲流的特殊功能：
 * BufferedWriter
 * 		void newLine():写一个换行符，这个换行符由系统决定
 * BufferedReader
 * 		String readLine():一次读取一行数据，但是不读取换行符
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));
		 * 
		 * for(int i=0;i<10;i++){ bw.write("hello"+(i+1)); bw.newLine();
		 * bw.flush(); } bw.close();
		 */

		BufferedReader br = new BufferedReader(new FileReader("br.txt"));

		/*
		 * String line = br.readLine(); System.out.println(line);
		 * 
		 * line = br.readLine(); System.out.println(line);
		 * 
		 * line = br.readLine(); System.out.println(line);
		 * 
		 * line = br.readLine(); System.out.println(line);
		 */

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}
}
