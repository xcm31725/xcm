package com.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * 
 * @ClassName: PropertiesDemo2  
 * @Description: TODO
 * Properties和IO流结合的功能： 
 *			void load(Reader reader) 
 *			void list(PrintWriter out)
 *			void store(Writer writer, String comments)
 *			Object setProperty(String key, String value) 
 * 		
 * @author sudong
 * @date 2018年1月22日 上午11:56:00  
 *
 */
public class PropertiesDemo2 {

	public static void main(String[] args) throws IOException {
		//method1();
		//method2();
		method3();
	}
	
	/**
	 *
	 * method3 Properties和IO流结合使用，用来读取文件中的数据
	 * TODO 创建输入流对象
	 * TODO 创建Properties对象
	 * TODO 使用load()方法来读取文件中的文件
	 * TODO 释放资源
	 * TODO 把读取的信息打印在控制台
	 * @Title: method3  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @throws FileNotFoundException
	 * @param @throws IOException    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	private static void method3() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("a\\d.txt");
		
		Properties p = new Properties();
		
		p.load(fr);
		
		fr.close();
		
		System.out.println(p);
	}
	
	/**
	 *
	 * method2 Properties和IO流结合使用，用来给文本写数据
	 * TODO 创建输出流对象
	 * TODO 创建properties对象
	 * TODO 用setProperty()方法给properties添加元素
	 * TODO 使用list()方法把数据写到文件中
	 * TODO 释放资源
	 * @Title: method2  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @throws FileNotFoundException    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	private static void method2() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("a\\d.txt");
		
		Properties p = new Properties();
		
		p.setProperty("zcj", "18");
		p.setProperty("kaj", "18");
		p.setProperty("txj", "18");
		p.setProperty("cmj", "18");	
		
		p.list(pw);
		
		pw.close();
	}
	
	/**
	 *
	 * method1 Properties和IO流结合使用，用来给文本写数据
	 * TODO 创建输出流对象
	 * TODO 创建properties对象
	 * TODO 用setProperty()方法给properties添加元素
	 * TODO 使用store()这个方法把Properties中的元素写到文件中
	 * TODO 释放资源
	 * @Title: method1  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @throws IOException    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	private static void method1() throws IOException {
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a\\c.txt"));
		FileWriter fr = new FileWriter("a\\c.txt");
		
		Properties p = new Properties();
		
		p.setProperty("zcj", "18");
		p.setProperty("kaj", "18");
		p.setProperty("txj", "18");
		p.setProperty("cmj", "18");
		
		p.store(fr, "Hello!");
		
		fr.close();
	}

}
