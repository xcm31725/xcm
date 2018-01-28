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
 * Properties��IO����ϵĹ��ܣ� 
 *			void load(Reader reader) 
 *			void list(PrintWriter out)
 *			void store(Writer writer, String comments)
 *			Object setProperty(String key, String value) 
 * 		
 * @author sudong
 * @date 2018��1��22�� ����11:56:00  
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
	 * method3 Properties��IO�����ʹ�ã�������ȡ�ļ��е�����
	 * TODO ��������������
	 * TODO ����Properties����
	 * TODO ʹ��load()��������ȡ�ļ��е��ļ�
	 * TODO �ͷ���Դ
	 * TODO �Ѷ�ȡ����Ϣ��ӡ�ڿ���̨
	 * @Title: method3  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @throws FileNotFoundException
	 * @param @throws IOException    �趨�ļ�  
	 * @return void    ��������  
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
	 * method2 Properties��IO�����ʹ�ã��������ı�д����
	 * TODO �������������
	 * TODO ����properties����
	 * TODO ��setProperty()������properties���Ԫ��
	 * TODO ʹ��list()����������д���ļ���
	 * TODO �ͷ���Դ
	 * @Title: method2  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @throws FileNotFoundException    �趨�ļ�  
	 * @return void    ��������  
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
	 * method1 Properties��IO�����ʹ�ã��������ı�д����
	 * TODO �������������
	 * TODO ����properties����
	 * TODO ��setProperty()������properties���Ԫ��
	 * TODO ʹ��store()���������Properties�е�Ԫ��д���ļ���
	 * TODO �ͷ���Դ
	 * @Title: method1  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @throws IOException    �趨�ļ�  
	 * @return void    ��������  
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
