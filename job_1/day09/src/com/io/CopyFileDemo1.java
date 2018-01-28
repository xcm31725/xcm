package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyFileDemo1 {

	public static void main(String[] args) throws IOException {
		//FileReader fr = new FileReader("src\\com\\file\\FileDemo1.java");
		//FileWriter fw = new FileWriter("FileDemo.java");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\com\\file\\FileDemo1.java"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("FileDemo10.java"));
		
		int line;
		while((line=bis.read())!=-1){
			bos.write(line);
			
		}
		
		
		
		bis.close();
		bos.close();
		
		/*int ch;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}*/
		/*
		 * 为了达到最高效率，可要考虑在 BufferedReader 内包装 InputStreamReader。例如： 
 		 *	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 * */
		/*int len;
		char[] chs = new char[1024];
		while((len=fr.read(chs))!=-1){
			fw.write(chs, 0, len);
		}*/
		
		//fr.close();
		//fw.close();
	}

}
