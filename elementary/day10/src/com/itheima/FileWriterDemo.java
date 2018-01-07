package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �������ļ���д����
 * 		д����--�����--FileWriter
 * FileWriter��
 * 		FileWriter(String fileWriter):����һ���ļ�����
 * 
 * �����д���ݵĲ���
 * 		A:�������������
 * 		B:��������������д���ݵķ���
 * 		C:�ͷ���Դclose()��filsh()����������
 * 		filsh()��ˢ�»���������������Լ�������
 * 		close()����ˢ�»�������Ȼ��֪ͨϵͳ�ͷ���Դ�������󲻿��Ա�ʹ���ˡ�
 * */
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// ����IO������
		FileWriter fw = new FileWriter("d:\\a.txt");
		/*
		 * �������������д�����ݷ��� 
		 * A:����ϵͳ��Դ������һ���ļ� 
		 * B:������������� 
		 * C�������������ָ���ļ�
		 */

		// �������������д����ͼ��
		// дһ����ĸ
		fw.write("IO�����");
		// ����û��ֱ��д���ļ�����ʵ��д�����ڴ�
		fw.flush();

		// �ͷ���Դ
		// ͨ��ϵͳ�ͷź͸��ļ���ص���Դ
		fw.close();

	}

}
