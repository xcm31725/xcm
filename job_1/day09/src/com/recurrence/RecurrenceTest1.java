package com.recurrence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RecurrenceTest1 {
	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\sudong\\Desktop\\b");
		File dest = new File("C:\\Users\\sudong\\Desktop\\a");
		
		copyFileOrDir(src,dest);
	}
	
	public static void copyDir(File src, File dest) {
		if(src.isDirectory() && dest.isDirectory()) {
			
		}
	}
	
	//���Կ����ļ���Ҳ���Կ����ļ���
	public static void copyFileOrDir(File src, File dest) throws IOException {
		//����Դ����Ŀ�ĵ���һ�������ڣ�ֱ�ӽ�������
		if(!src.exists() || !dest.exists()) {
			return;
		} 
		//���Ŀ�ĵ���һ���ļ���ֱ�ӽ�������
		if(dest.isFile()) {
			return;
		}
		
		File file = new File(dest, src.getName());//����ָ����һ���ļ���Ҳ����ָ��һ���ļ���
		
		if(src.isDirectory()) {//˵��������һ���ļ���
			file.mkdirs();
			//��ȡԭ�ļ��������е��ļ����ļ���
			File[] files = src.listFiles();
			
			for (File f : files) {
				//��File���󵽵����ļ������ļ��У�����Ҫ����
				copyFileOrDir(f,file);
			}
		}else {
			//˵������Դ��һ���ļ�
			//����Ҫ�����ļ�
			//ֱ�ӿ���
			FileInputStream fis = new FileInputStream(src);
			
			FileOutputStream fos = new FileOutputStream(file);
			
			int len;
			byte[] bys = new byte[1024];
			while((len = fis.read(bys)) != -1) {
				fos.write(bys, 0, len);
			}
			
			fis.close();
			fos.close();
		}
	}
}
