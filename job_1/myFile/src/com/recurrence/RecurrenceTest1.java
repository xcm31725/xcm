package com.recurrence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺽��ƶ�Ŀ¼���������ݣ����Ƶ���һ��Ŀ¼��
 * 
 * ԴĿ¼		Ŀ��Ŀ¼
 * 
 * ������
 * 		��������Ҫ��ȡԴĿ¼�����е��ļ�����Ŀ¼��
 * 			���ǿ��԰�ԴĿ¼��װ��һ��File����
 * 			���ǿ��Ե���File��listFile��������
 * 			���ǿ��Ի�ȡԴĿ¼�����е��ļ�����Ŀ¼��Ӧ��File����
 * 		������ǻ�ȡ�������ļ�
 * 			����Ŀ��Ŀ¼�д������ļ�����Ӧ��Ŀ¼
 * 			�����ļ��ĸ���
 * 		������ǻ�ȡ��������Ŀ¼
 * 			������Ŀ¼�����Ƿ����������ļ��͸����ε���Ŀ¼
 * */
public class RecurrenceTest1 {

	public static void main(String[] args) throws IOException {
		File src = new File("D:\\eclipse��ϰ\\��ҵ���һ�׶�\\myFile");
		File dest = new File("c");
		
		copyDir(src,dest);
	}
	
	public static void copyDir(File src,File dest) throws IOException {
		if(src.isDirectory() && dest.isDirectory()) {
			
			File newDir = new File(dest, src.getName());
			if(!newDir.exists()) {
				newDir.mkdir();
			}
			
			File[] files = src.listFiles();
			
			for (File file : files) {
				if(file.isFile()) {
					FileInputStream fis = new FileInputStream(file);
					FileOutputStream fos = new FileOutputStream(new File(newDir,file.getName()));
					
					int len;
					byte[] bys = new byte[1024];
					
					while((len = fis.read(bys)) != -1) {
						fos.write(bys, 0, len);
					}
					
					fis.close();
					fos.close();
					
				}else{
					copyDir(file, newDir);
				}
			}
		}
	}

}
