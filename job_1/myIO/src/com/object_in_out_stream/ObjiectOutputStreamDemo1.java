package com.object_in_out_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @ClassName: ObjiectOutputStreamDemo1  
 * @Description: TODO
 * * 对象操作流：可以用于读写任意类型的对象
 * 		ObjectOutputStream
 * 				writeObject 
 * 				ObjectOutputStream(OutputStream out) 
 * 		ObjectInputStream
 * 				readObject
 * 				ObjectInputStream(InputStream in)
 * 
 * Serializable:序列号，是一个标识接口，只起标识作用，没有方法
 * 				当一个类的对象需要IO流进行读写的时候，这个类必须实现该接口
 * 
 * 解决对实现序列化接口出现的黄色警告问题
 * Exception in thread "main" java.io.InvalidClassException
 * 当 Serialization 运行时检测到某个类具有以下问题之一时，抛出此异常。 
 *		该类的序列版本号与从流中读取的类描述符的版本号不匹配 
 *		该类包含未知数据类型 
 *		该类没有可访问的无参数构造方法 
 * 
 * 注意：
 * 		使用对象输出流写出对象，只能使用对象输入流来读取对象
 * 		只能将支持 java.io.Serializable 接口的对象写入流中
 * 
 * @author sudong
 * @date 2018年1月22日 上午10:40:17  
 *
 */
public class ObjiectOutputStreamDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//method1();
		
		//method2();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b\\a.txt"));
		
		try {
			while(true) {
				Object obj = ois.readObject();
				System.out.println(obj);
			}
		} catch (Exception e) {
			System.out.println("没有学生对象了");
		}
	}
	
	/**
	 *
	 * method2 用来读取对象输入流的
	 * TODO 创建对象输入流
	 *  使用对象输出流和读对象输入流写对象
	 * 		Exception in thread "main" java.io.NotSerializableException: com.itheima_07.Student
	 * 解决：
	 * 		Exception in thread "main" java.io.EOFException:当输入过程中意外到达文件或流的末尾时，抛出此异常。
	 * @Title: method2  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @throws IOException
	 * @param @throws FileNotFoundException
	 * @param @throws ClassNotFoundException    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	private static void method2() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b\\a.txt"));
		
		Object obj = ois.readObject();
		System.out.println(obj);
		Object obj1 = ois.readObject();
		System.out.println(obj1);
		Object obj2 = ois.readObject();
		System.out.println(obj2);
	}

	/**
	 *
	 * method1  把一个对象写入文件中
	 * TODO 创建对象输出流
	 * TODO 创建学生对象并赋值
	 * TODO 释放资源
	 * @Title: method1  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @throws IOException
	 * @param @throws FileNotFoundException    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	private static void method1() throws IOException, FileNotFoundException {
		//FileOutputStream fos = new FileOutputStream("b\\a.txt");
		//ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b\\a.txt"));
		
		Student s = new Student("xcm", 17);
		Student s1 = new Student("xgd", 22);
		
		oos.writeObject(s);
		oos.writeObject(s1);
		
		oos.close();
	}

}
