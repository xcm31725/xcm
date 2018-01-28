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
 * 7、根据要求,用代码实现
		已知配置文件config.properties中有三个键值对
			name=zhangsan
			age=20
			address=beijing
   		使用IO字节流对象和Properties类结合使用,将配置文件中的age键的值修改为30

 * @author sudong
 * @date 2018年1月21日 下午9:34:20  
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
