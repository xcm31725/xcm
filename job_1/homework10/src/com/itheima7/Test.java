package com.itheima7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Properties;

/**
 * 
 * @ClassName: Test7  
 * @Description: TODO
 * 7������Ҫ��,�ô���ʵ��
		��֪�����ļ�config.properties����������ֵ��
			name=zhangsan
			age=20
			address=beijing
   		ʹ��IO�ֽ��������Properties����ʹ��,�������ļ��е�age����ֵ�޸�Ϊ30

 * @author sudong
 * @date 2018��1��21�� ����9:34:20  
 *
 */
public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a\\config.properties"));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a\\config.properties", true));
			
		Properties p = new Properties();
		
		p.setProperty("age", "30");
		
		p.store(oos, null);
		
		oos.close();
		
	}

	private static void method() throws IOException, FileNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a\\config.properties"));
		
		Properties p = new Properties();
		
		p.setProperty("name", "zhangsan");
		p.setProperty("age", "20");
		p.setProperty("address", "beijing");
		
		p.store(oos, null);
		
		oos.close();
	}

}
