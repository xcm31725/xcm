package com.file;

import java.io.File;

/*
 * File:�ļ���Ŀ¼·�����ĳ����ʾ��ʽ��File ���ʵ���ǲ��ɱ��
 * 
 * ���췽����
 * 		File(File parent, String child) 
 * 		File(String pathname) 
 * 		File(String parent, String child) 
 * 
 * File�ĳ��ù��ܣ�
 * 		��������
 * 			boolean createNewFile()  
 * 			boolean mkdir()  
 * 			boolean mkdirs()  
 * 		ɾ������
 * 			boolean delete() 

 * 		��ȡ����
 * 			File getAbsoluteFile()  
 * 			String getAbsolutePath() 
 * 			String getName()  
 * 			String getParent()  
 * 			File getParentFile() 
 * 			String getPath()  
  			long lastModified() 
  			long length()  
 * 		�жϹ���
 * 			 boolean exists()  
 * 			 boolean isAbsolute()  
 * 			 boolean isDirectory() 
 			 boolean isFile()  
 			 boolean isHidden()  
 		�޸��ļ�����
 			boolean renameTo(File dest)  
 *
 */
public class FileDemo1 {

	public static void main(String[] args) {
		//File(File parent, String child) 
//		File file2 = new File(new File("D:\\eclipse��ϰ\\exc"),"a.txt");
		
		//File(String pathname) 
//		File file = new File("D:\\eclipse��ϰ\\exc\\a.txt");
		
		//File(String parent, String child) 
		File file1 = new File("D:\\eclipse��ϰ\\exc","a.txt");
		
	}

}
