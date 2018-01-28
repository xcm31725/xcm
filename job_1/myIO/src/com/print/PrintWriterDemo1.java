package com.print;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @ClassName: PrintWriterDemo1  
 * @Description: TODO
 * ��ӡ����
 * 		PrintStream
 * 		PrintWriter
 * 			�����Զ����У�println()
 * 			��������ֽڣ����ǿ������������������
 * 			ͨ��ĳЩ���ã�����ʵ���Զ�ˢ�£�ֻ���ڵ��� println��printf �� format�����ã�
 * 			Ҳ�ǰ�װ�������߱�д������
 * 			���԰��ֽ������ת�����ַ������
 * 
 * ��ӡ�������й��ܣ�
 * 		�Զ����� ʹ�÷���println()ʵ���Զ�����
 * 		�Զ�ˢ��  ����PrintWriter����ʱ�����Զ�ˢ�¿��أ�����ʹ��println��3����������ʵ���Զ�ˢ��
 * 
 * ע�⣺����FileWriter����ʱboolean�������Ƿ�׷�ӣ�
 * 		��������ӡ�������boolean���Ͳ������Ƿ��Զ�ˢ��
 *		ֻ�������������
 * @author sudong
 * @date 2018��1��22�� ����10:27:36  
 *
 */
public class PrintWriterDemo1 {

	public static void main(String[] args) throws IOException {
		//method1();
		
		PrintWriter pw = new PrintWriter(new FileWriter("b.txt"), true);
		
		pw.println("zcj");
		pw.println("xnj");
		pw.println("txj");
		
		pw.close();
	}

	private static void method1() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("a\\b.txt");
		
		pw.write("xcm");
		pw.write("xgd");
		pw.write("cj");
		
		pw.close();
	}

}
