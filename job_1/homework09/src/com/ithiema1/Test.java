package com.ithiema1;

import java.io.File;
import java.util.Scanner;

import javax.xml.soap.SAAJResult;

/*
 * 1����дһ��������ͳ���ļ�����ָ�������ļ��ĸ��������磺.ext,.java,.doc��
		�������������û������·���Լ�ָ������չ������÷����У����ظ�Ŀ¼�����з��ϸ���չ���ļ��ĸ���
		���磺����E:\\bbb  ���ļ���չ��Ϊ .java ��ô��Ҫͳ����E:\\bbb  ��������չ��Ϊ.java�ļ��ĸ��������ļ����з����������ļ�ҲҪͳ�ƽ�ȥ��

		����:
			1,����һ������,����File f,String str
			2,����һ��ͳ�Ʊ���,����ͳ�Ʒ����������ļ��ĸ���
			3,�ж��Ƿ����ļ���
				�����,����
				�������,�˳�
			4,��ȡ��ǰĿ¼�����е��ļ��Լ��ļ���
			5,����,�õ�ÿһ��File����,�ж��Ƿ����ļ�
				�����,�ж��ǲ�������ָ���������ļ�,����ǽ����ļ��Ĵ�С�ۼӵ�ͳ�Ʊ�����
				�������,���÷���(�Լ�)
 * */
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������·����");
		String file = sc.nextLine();
		
		System.out.println("�������׺����");
		String str = sc.nextLine();
		
		File f = new File(file);
		
		System.out.println(fileNum(f,str));
	}
	
	public static int fileNum(File f, String str) {
		int count = 0;
		
		if(f.isDirectory()) {
			File[] files = f.listFiles();
			for (File file : files) {
				count += fileNum(file,str);
			}
		}else {
			count++;
		}
		
		/*if(f.isDirectory()) {
			File[] files = f.listFiles();
			
			for (File file : files) {
				if(file.isFile()) {
					if(file.getName().endsWith(str)) {
						System.out.println(file.getName());
						count = 1;
					}
				}else {
					fileNum(file,str);
				}
			}
		}*/
		return count;
	}
	
	public static int fileNum1(File f, String str) {
		int count = 0;
	
		if(!f.exists()) {
			return 0;
		}
		
		if(f.isFile()) {
			if(f.getName().endsWith(str)) {
				System.out.println(f.getName());
				count++;
			}
		}else {
			File[] files = f.listFiles();
			for (File file : files) {
				fileNum1(file,str);
			}
		}
		return count;
	}
}
