package com.print;
/*
 * ��ӡ�������й��ܣ�
 * 		�Զ����� ʹ�÷���println()ʵ���Զ�����
 * 		�Զ�ˢ��  ����PrintWriter����ʱ�����Զ�ˢ�¿��أ�����ʹ��println��3����������ʵ���Զ�ˢ��
 * 
 * ע�⣺����FileWriter����ʱboolean�������Ƿ�׷�ӣ�
 * 		��������ӡ�������boolean���Ͳ������Ƿ��Զ�ˢ��
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {

	public static void main(String[] args) throws IOException {
		//PrintWriter pw = new PrintWriter("b.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("b.txt"), true);
		//pw.write("xcm");
		//pw.write("xgd");
		//pw.write("zc");
		
		pw.println("xcm");
		pw.println("xgd");
		pw.println("cc");
		
		pw.close();
	}

}
