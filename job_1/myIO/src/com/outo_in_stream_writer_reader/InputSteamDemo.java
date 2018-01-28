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
 * ���󣺶�ȡ����¼������ݣ����������Ŀ��Ŀ¼�µ�a.txt�ļ���
 * 
 * ����Դ����ȡ����¼�������	System.in
 * Ŀ�ĵأ���Ŀ��Ŀ¼�µ�a.txt	FileWriter
 * 
 * ת��������Ҫ���ֽ�������ת�����ַ���������InputStreamReader
 * InputStreamReader(InputStream in) 
 * @author sudong
 * @date 2018��1��22�� ����10:06:14  
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
			
			//������Escʱ��������
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
			
			//������Escʱ��������
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
