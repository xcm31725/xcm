package com.file;

import java.io.File;
import java.io.IOException;

/*
 * 	��������
 * 		boolean createNewFile()  
 * 		boolean mkdir()  
 * 		boolean mkdirs()  
 * 	ɾ������
 * 		boolean delete() 
 * 
 *  ����·�����̶����ɸı��·�������̷���ͷ
 *  ���·�������ĳ��������������̷���ͷ
 *  		��eclipse�����·�����Ӧ��ǰ��Ŀ�ĸ�Ŀ¼
 *  
 *  
 *  ע�⣺ɾ��һ���ļ��У�����ļ������治�����������ļ����ļ�
 * */
public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		//File f1 = new File("a.txt");
		//boolean createNewFile(): ��ָ���ļ�������ʱ�����ļ�������true�����򷵻�false 
		//System.out.println(f1.createNewFile());
		
		//boolean mkdir(): ��ָ���ļ��в�����ʱ�����ļ��в�����true�����򷵻�false
		//File f2 = new File("b");
		//System.out.println(f2.mkdirs());
		
		//boolean mkdirs() : ����ָ���ļ��У����ļ������ڵ�Ŀ¼�����ڣ���˳��һ�鴴����
		//File f3 = new File("a\\b\\c");
		//System.out.println(f3.mkdirs());
		
		File f4 = new File("b.txt");
		//System.out.println(f4.mkdir());
		
		//boolean delete() :��ָ�����ļ����ļ��д���ʱɾ���ļ������ļ��� ������true�����򷵻�false
		//System.out.println(f1.delete());
		//System.out.println(f3.delete());
		System.out.println(f4.delete());
		
	}

}
