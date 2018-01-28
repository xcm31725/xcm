package com.outo_in_stream_writer_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

/**
 * 
 * @ClassName: InputSteamDemo  
 * @Description: TODO
 * 
 * 需求：读取键盘录入的数据，并输出到项目根目录下的a.txt文件中
 * 
 * 数据源：读取键盘录入的数据	System.in
 * 目的地：项目根目录下的a.txt	FileWriter
 * 
 * 转换流：需要把字节输入流转换成字符输入流，InputStreamReader
 * InputStreamReader(InputStream in) 
 * @author sudong
 * @date 2018年1月22日 上午10:06:14  
 *
 */
public class InputSteamDemo {

	public static void main(String[] args) throws IOException {
		//method1();
		
		InputStream is = System.in;
	    
		Reader r = new InputStreamReader(is);
		
 		PrintWriter pw = new PrintWriter(new FileWriter("a.txt"), true);
 		
 		int len;
		char[] chs = new char[1024];
		while((len = r.read(chs)) != -1) {
			String s = new String(chs, 0, len);
			
			//当输入Esc时结束输入
			if(s.contains("Esc")) {
				break;
			}
			
			pw.print(s);
		}
		
		is.close();
		pw.close();
 		
	}

	private static void method1() throws IOException {
		InputStream is = System.in;
		
		InputStreamReader isr = new InputStreamReader(is);
		
		FileWriter fr = new FileWriter("a\\a.txt");
		
		int len;
		char[] chs = new char[1024];
		while((len = isr.read(chs)) != -1) {
			String s = new String(chs, 0, len);
			
			//当输入Esc时结束输入
			if(s.contains("Esc")) {
				break;
			}
			
			fr.write(s);
			fr.flush();
		}
		
		is.close();
		fr.close();
	}

}
