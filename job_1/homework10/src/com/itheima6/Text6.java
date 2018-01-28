package com.itheima6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Properties;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.tools.FileObject;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileManager.Location;

/**
 * 
 * @ClassName: Text6  
 * @Description: TODO 6��ɾ���ļ�(day10_student.properties)��ܽ�ؽ�����Ϣ
 * @author sudong
 * @date 2018��1��21�� ����9:13:41  
 *
 */
public class Text6 {

	public static void main(String[] args) throws IOException {
		//method();
		
		Properties p = new Properties();
		
		p.load(new FileReader("day10_student.properties"));
		p.remove("ܽ�ؽ��");
		p.store(new FileWriter("day10_student.properties"), null);
	}

	private static void method() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day10_student.properties"), "utf-8"));
		
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("day10_student.properties"), "ISO-8859-1"));
		
		ArrayList<String> list = new ArrayList<String>();
		
		String line;
		
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		
		PrintWriter pw = new PrintWriter(new FileWriter("day10_student.properties"), true);
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(!"ܽ�ؽ��=24".equals(s)) {
				pw.println(s);
			}
		}
		
		
		/*//System.out.println(list);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("day10_student.properties"), "utf-8"));
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(!"ܽ�ؽ��=24".equals(s)) {
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
		}*/
		
		br.close();
		//bw.close();
		pw.close();
	}

}
