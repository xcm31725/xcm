package com.outorinStream;

/*
 * ���󣺶�ȡ����¼������ݣ����������Ŀ��Ŀ¼�µ�a.txt�ļ���
 * 
 * ����Դ����ȡ����¼�������	System.in
 * Ŀ�ĵأ���Ŀ��Ŀ¼�µ�a.txt	FileWriter
 * 
 * 
 * 
 * ת��������Ҫ���ֽ�������ת�����ַ���������InputStreamReader
 * InputStreamReader(InputStream in) 
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		// method();

		InputStream is = System.in;
		Reader r = new InputStreamReader(is);

		FileWriter fw = new FileWriter("a.txt");

		int len;
		char[] chs = new char[1024];
		while ((len = r.read(chs)) != -1) {
			String s = new String(chs, 0, len);
			/*if ("exit".equals(s.replaceAll("\\s", "")))
				break;
			System.out.println(s + "-----");*/
			//if(s.contains("exit"))break;
			
			if(s.matches("[e]*")){
				System.out.println("------------------");
				break;
			}
				
			//System.out.println(s + "-----");
			
			fw.write(s);
			fw.flush();
		}

		fw.close();
		is.close();
	}

	private static void method() throws IOException {
		InputStream is = System.in;

		FileWriter fw = new FileWriter("a.txt");

		int len;
		byte[] bys = new byte[1024];
		while ((len = is.read(bys)) != -1) {
			fw.write(new String(bys, 0, len));
			fw.flush();
		}

		fw.close();
		is.close();
	}

}
