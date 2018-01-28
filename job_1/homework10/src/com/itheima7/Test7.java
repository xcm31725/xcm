package com.itheima7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
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
public class Test7 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//method1();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a\\config.properties"));
		
		Object obj = ois.readObject();
		List<String> list = (List<String>) obj;
		
		for (String string : list) {
			System.out.println(string);
		}
		
		
		/*int len;
		byte[] bys = new byte[1024];
		while((len = ois.readByte()) != -1) {
			//list.add(new String(bys, 0, len));
			Object obj = ois.readObject();
			System.out.println(obj);
		//	list.add(obj);
		}*/
		
		
		
		
	}

	private static void method1() throws IOException {
		
		
		Properties p = new Properties();

		p.setProperty("name", "zhangsan");
		p.setProperty("age", "20");
		p.setProperty("address", "beijing");
		
		//PrintWriter pw = new PrintWriter("config.properties");
		
		ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream("a\\config.properties"));
		
		p.store(oos, "Hello");
		/*p.list(pw);
		
		pw.close();*/
		oos.close();
	}

}
