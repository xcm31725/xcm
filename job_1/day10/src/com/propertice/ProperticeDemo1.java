package com.propertice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class ProperticeDemo1 {

	public static void main(String[] args) throws IOException {
		//method();
		
		//method1();
		
		//���������б����
		Properties p = new Properties();
		
		//���ӳ���ϵ
		p.setProperty("xcm", "18");
		p.setProperty("xgd", "23");
		p.setProperty("zc", "17");
		p.setProperty("sd", "22");
		
		//�������������
		FileWriter fw = new FileWriter("e.txt");
		
		p.store(fw, "helloworld");
		
		fw.close();
	}

	private static void method1() throws FileNotFoundException, IOException {
		//���������б����
		Properties p = new Properties();
		
		//����һ������������
		FileReader fr = new FileReader("d.txt");
		
		p.load(fr);
		
		//�ͷ���Դ
		fr.close();
		
		System.out.println(p);
	}

	private static void method() throws FileNotFoundException {
		Properties p = new Properties();
		
		p.setProperty("xcm", "18");
		p.setProperty("xgd", "23");
		p.setProperty("zc", "17");
		p.setProperty("sd", "22");
		
		//������ӡ������
		PrintWriter pw = new PrintWriter("d.txt");
		
		p.list(pw);
		
		pw.close();
	}

}
