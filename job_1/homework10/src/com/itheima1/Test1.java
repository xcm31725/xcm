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
 * 1������Ҫ��,�ô���ʵ��
		ʹ��BufferedReader+FileReader��ȡ�ı��ļ�
			��ӡ��PrintWriterд���ı��ļ�,ʹ���Զ�ˢ��
			��a\\d.txt���Ƶ�b\\d.txt
 * @author sudong
 * @date 2018��1��21�� ����8:08:07  
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
