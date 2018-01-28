package com.object_in_out_stream;
/**
 * 
 * @ClassName: ObjiectOutputStreamDemo1  
 * @Description: TODO
 * 解决对象输入流读取对象出现异常的问题
 * 把对象存入集合中
 * @author sudong
 * @date 2018年1月22日 上午10:40:17  
 *
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamTest1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//method1();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b\\b.txt"));

		Object obj = ois.readObject();
		ArrayList<Student> list = (ArrayList<Student>) obj;

		for (Student student : list) {
			System.out.println(student);
		}
		
		ois.close();
	}

	/**
	 *
	 * method1  把一个对象写入文件中
	 * TODO 创建对象输出流
	 * TODO 创建集合对象
	 * TODO 给集合添加元素
	 * TODO 把集合中的元素添加到对象输出流写入文件
	 * TODO 释放资源
	 * @Title: method1  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @throws IOException
	 * @param @throws FileNotFoundException    设定文件  
	 * @return void    返回类型  
	 * @throws
	 */
	private static void method1() throws IOException, FileNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b\\b.txt"));
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("xcm", 17));
		list.add(new Student("xgd", 22));
		list.add(new Student("zc", 18));
		list.add(new Student("sd", 23));
		
		oos.writeObject(list);
		
		oos.close();
	}

}
