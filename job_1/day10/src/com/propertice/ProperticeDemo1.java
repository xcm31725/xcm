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
		
		//创建属性列表对象
		Properties p = new Properties();
		
		//添加映射关系
		p.setProperty("xcm", "18");
		p.setProperty("xgd", "23");
		p.setProperty("zc", "17");
		p.setProperty("sd", "22");
		
		//创建输出流对象
		FileWriter fw = new FileWriter("e.txt");
		
		p.store(fw, "helloworld");
		
		fw.close();
	}

	private static void method1() throws FileNotFoundException, IOException {
		//创建属性列表对象
		Properties p = new Properties();
		
		//创建一个输入流对象
		FileReader fr = new FileReader("d.txt");
		
		p.load(fr);
		
		//释放资源
		fr.close();
		
		System.out.println(p);
	}

	private static void method() throws FileNotFoundException {
		Properties p = new Properties();
		
		p.setProperty("xcm", "18");
		p.setProperty("xgd", "23");
		p.setProperty("zc", "17");
		p.setProperty("sd", "22");
		
		//创建打印流对象
		PrintWriter pw = new PrintWriter("d.txt");
		
		p.list(pw);
		
		pw.close();
	}

}
