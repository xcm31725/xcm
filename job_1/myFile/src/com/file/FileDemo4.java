package com.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/*
 *	��ȡ����
 		File getAbsoluteFile()  
 * 		String getAbsolutePath() 
 * 		String getParent()  
 * 		File getParentFile() 
 * 		String getName() 
 * 		String getPath()  
  		long lastModified() 
  		long length() 
  	�޸Ĺ��ܣ�
 		boolean renameTo(File dest)
 */
public class FileDemo4 {

	public static void main(String[] args) throws IOException {
		//method();
		//method1();
		//method2();
		
		File f = new File("D:\\eclipse��ϰ\\exc.a.txt");
		File f1 = new File("c\\a.txt");
		
		//boolean renameTo(File dest): ����ǰFile������ָ���·�� �޸�Ϊ ָ��File��ָ���·��
		//ע�⣺�޸ĵ��ļ�·�����ܴ��ڣ�����������޸�ʧ��
		System.out.println(f.renameTo(f1));
	}

	private static void method2() {
		File f = new File("a.txt");
		File f1 = new File("D:\\eclipse��ϰ\\exc.a.txt");
		File f2 = new File("c");
		
		//String getName()  : ��ȡ�ļ����ļ��е�����
		//System.out.println(f.getName());
		//System.out.println(f1.getName());
		//System.out.println(f2.getName());
		
		//String getPath() : ���ش���File����ʱ����·��
		//System.out.println(f.getPath());
		//System.out.println(f1.getPath());
		//System.out.println(f2.getPath());
		
		//long lastModified():�Ժ���ֵ����ʽ��������޸�ʱ�� 
		//System.out.println(f.lastModified());
		
		//Date d = new Date(1516366405993L);
		//System.out.println(d.toLocaleString());
		
		//long length(): �����ļ����ֽ���
		System.out.println(f.length());
	}

	private static void method1() {
		//File f = new File("b");
		//File f1 = new File("c","a.txt");
		//System.out.println(f1.createNewFile());
		
		File parent = new File("c");
		File f2 = new File(parent,"c.txt");
		if(!parent.exists()){
			parent.mkdirs();
		}
		//String getParent()  
		System.out.println(f2.getParent());
		//File getParentFile() 
		System.out.println(f2.getParentFile());
	}

	private static void method() {
		File f = new File("b");
		File f1 = new File("D:\\eclipse��ϰ\\exc.a.txt");
		
		//File getAbsoluteFile() ����File�������ʽ���ص�ǰFile��������ָ��ľ���·��
		System.out.println(f1.getAbsoluteFile());
		//String getAbsolutePath() : ����File������ָ��ľ���·��
		System.out.println(f1.getAbsolutePath());
	}

}
