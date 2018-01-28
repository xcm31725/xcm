package com.outo_in_stream_writer_reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * 
 * @ClassName: OutputStreamWriterDemo1  
 * @Description: TODO 
 * ���󣺶�ȡ��Ŀ��Ŀ¼�µ�FileDemo.java���������������
 * 
 * ����Դ����ĿĿ¼�µ�FileDemo.java BufferedReader
 * Ŀ�ĵأ�������
 * 
 * ���ڱ�׼�������һ���ֽ������,����ֻ������ֽڻ����ֽ����飬
 * �������Ƕ�ȡ�����������ַ��������������������Ҫת�����ֽ�����
 * 
 * ����Ҫ��ͨ����׼���������ַ������ѱ�׼�����ת����һ���ַ���������ɣ�
 * OutputStreamWriter
 * 
 * OutputStreamWriter(OutputStream out) :ת���������ֽ������ת�����ַ������
 * 
 * @author sudong
 * @date 2018��1��21�� ����6:15:38  
 *
 */
public class OutputStreamWriterDemo1 {

	public static void main(String[] args) throws IOException {
		//method1();
		
		//method2();
		
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//Writer w = new OutputStreamWriter(System.out);//��̬��������ִ���������
		
		String line;
		
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.write("\r\n");
			bw.flush();
		}
		
		br.close();
		bw.close();
		
		
	}

	private static void method2() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		
		Writer w = new OutputStreamWriter(System.out);//��̬��������ִ���������
		
		String line;
		
		while((line = br.readLine()) != null) {
			w.write(line);
			w.write("\r\n");
			w.flush();
		}
		
		br.close();
		w.close();
	}

	private static void method1() throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		
		//OutputStreamWriter osw = new OutputStreamWriter(System.out);
		//�������������
		OutputStream osw = System.out;
		
		
		String line;
		
		while((line = br.readLine()) != null) {
			osw.write(line.getBytes());//���ַ���ת�����ַ�
			osw.write("\r\n".getBytes());
			osw.flush();
		}
		
		br.close();
		osw.close();
	}

}
