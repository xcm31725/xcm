package com.outorinStream;
/*
 * ���󣺶�ȡ��Ŀ��Ŀ¼�µ�SystemInOutDemo.java���������������
 * 
 * ����Դ����Ŀ��Ŀ¼�µ�SystemInOutDemo.java	BufferedReader
 * Ŀ�ĵأ�������	System.out
 * 
 * 
 * ���ڱ�׼�������һ���ֽ������������ֻ������ֽڻ����ֽ����飬�������Ƕ�ȡ�������������ַ��������������������Ҫת�����ֽ�����
 * ����Ҫ��ͨ����׼���������ַ������ѱ�׼�����ת����һ���ַ���������ɣ�OutputStreamWriter
 * 
 * OutputStreamWriter(OutputStream out) :ת���������ֽ������ת�����ַ������
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		method();
		
		//method1();
		
		//method2();
		
	}

	private static void method2() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));

		//�������������
		//OutputStream os = System.out;
		Writer w = new OutputStreamWriter(System.out);//��̬������������ָ���������
		
		BufferedWriter bw = new BufferedWriter(w);
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			
			//w.write(line);
			//w.write("\r\n");
		}
		
		br.close();
		bw.close();
	}

	private static void method1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		OutputStream ow = System.out;
		
		String line;
		while((line = br.readLine()) != null) {
			ow.write(line.getBytes());
			ow.write("\r\n".getBytes());
		}
		
		ow.close();
		br.close();
	}

	private static void method() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
