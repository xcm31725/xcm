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
 * * ������������������ڶ�д�������͵Ķ���
 * 		ObjectOutputStream
 * 				writeObject 
 * 				ObjectOutputStream(OutputStream out) 
 * 		ObjectInputStream
 * 				readObject
 * 				ObjectInputStream(InputStream in)
 * 
 * Serializable:���кţ���һ����ʶ�ӿڣ�ֻ���ʶ���ã�û�з���
 * 				��һ����Ķ�����ҪIO�����ж�д��ʱ����������ʵ�ָýӿ�
 * 
 * �����ʵ�����л��ӿڳ��ֵĻ�ɫ��������
 * Exception in thread "main" java.io.InvalidClassException
 * �� Serialization ����ʱ��⵽ĳ���������������֮һʱ���׳����쳣�� 
 *		��������а汾��������ж�ȡ�����������İ汾�Ų�ƥ�� 
 *		�������δ֪�������� 
 *		����û�пɷ��ʵ��޲������췽�� 
 * 
 * ע�⣺
 * 		ʹ�ö��������д������ֻ��ʹ�ö�������������ȡ����
 * 		ֻ�ܽ�֧�� java.io.Serializable �ӿڵĶ���д������
 * 
 * @author sudong
 * @date 2018��1��22�� ����10:40:17  
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
			System.out.println("û��ѧ��������");
		}
	}
	
	/**
	 *
	 * method2 ������ȡ������������
	 * TODO ��������������
	 *  ʹ�ö���������Ͷ�����������д����
	 * 		Exception in thread "main" java.io.NotSerializableException: com.itheima_07.Student
	 * �����
	 * 		Exception in thread "main" java.io.EOFException:��������������⵽���ļ�������ĩβʱ���׳����쳣��
	 * @Title: method2  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @throws IOException
	 * @param @throws FileNotFoundException
	 * @param @throws ClassNotFoundException    �趨�ļ�  
	 * @return void    ��������  
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
	 * method1  ��һ������д���ļ���
	 * TODO �������������
	 * TODO ����ѧ�����󲢸�ֵ
	 * TODO �ͷ���Դ
	 * @Title: method1  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @throws IOException
	 * @param @throws FileNotFoundException    �趨�ļ�  
	 * @return void    ��������  
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
