package com.object_in_out_stream;
/**
 * 
 * @ClassName: ObjiectOutputStreamDemo1  
 * @Description: TODO
 * ���������������ȡ��������쳣������
 * �Ѷ�����뼯����
 * @author sudong
 * @date 2018��1��22�� ����10:40:17  
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
	 * method1  ��һ������д���ļ���
	 * TODO �������������
	 * TODO �������϶���
	 * TODO ���������Ԫ��
	 * TODO �Ѽ����е�Ԫ����ӵ����������д���ļ�
	 * TODO �ͷ���Դ
	 * @Title: method1  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @throws IOException
	 * @param @throws FileNotFoundException    �趨�ļ�  
	 * @return void    ��������  
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
