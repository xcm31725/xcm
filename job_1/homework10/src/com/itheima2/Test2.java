package com.itheima2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 * @ClassName: Test2  
 * @Description: TODO
 * 2������Ҫ��,�ô���ʵ��
		ת������ȡ�ı��ļ�,Դ�ļ�abc.txt��UTF-8����
		���ı��е������ַ����ַ�������ʽ����,���ַ���������洢���ַ�������,
		���ַ����������е��ַ���һ����д�����ļ� abc22.txt,ͬ��Ҳ��UTF-8����

 * @author sudong
 * @date 2018��1��21�� ����8:22:46  
 *
 */
public class Test2 {

	public static void main(String[] args) throws IOException {
		//1,��������������
		/*FileInputStream fis = new FileInputStream("abc.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8"); 
		BufferedReader br = new BufferedReader(isr);*/
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("abc.txt"),"utf-8"));
		//2,�������������
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("abc22.txt",true), "utf-8"), true);
		//�������true��׷�����ݣ�"utf-8"���ַ�����������true���Զ�ˢ�µĿ���
		
		//��������
		String line;
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		
		//�ͷ���Դ
		br.close();
		pw.close();
	}
	
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a\\abc.txt"), "utf-8"));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("b\\abc22.txt"), "utf-8"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
	}*/

}
