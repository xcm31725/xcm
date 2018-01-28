package com.file;

import java.io.File;
import java.io.IOException;

/*
 *	�жϹ���
 * 		boolean exists()  
 * 		boolean isAbsolute()  
 * 		boolean isDirectory() 
 		boolean isFile()  
 		boolean isHidden() 
 */
public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		//method();
		//method1();
		//method2();
		File f = new File("D:\\eclipse��ϰ\\exc.a.txt");
		//boolean isHidden()  :�ж�File����ָ���·���Ƿ����������ԣ�����������򷵻�true�����򷵻�false
		System.out.println(f.isHidden());
	}

	private static void method2() {
		File f = new File("a.txt"); 
		File f1 = new File("b"); 
		//boolean isDirectory()���ж�File����ָ���·���Ƿ����ļ��У�������򷵻�true�����򷵻�false 
		//System.out.println(f.isDirectory());
		//System.out.println(f1.isDirectory());
		
 		//boolean isFile() : �ж�File����ָ���·���Ƿ����ļ���������򷵻�true�����򷵻�false 
		System.out.println(f.isFile());
		System.out.println(f1.isFile());
	}

	private static void method1() {
		File f = new File("D:\\eclipse��ϰ\\exc.a.txt");
		//boolean isAbsolute()  :�ж�File����ָ���·���Ƿ��Ǿ���·��������Ǿ���·���򷵻�true�����򷵻�false
		System.out.println(f.isAbsolute());
	}

	private static void method() throws IOException {
		//boolean exists(): �ж��ļ������ļ����Ƿ���ڣ���������򷵻�true�����򷵻�false
		File f = new File("a.txt");
		f.createNewFile();
		System.out.println(f.exists());
	}

}
