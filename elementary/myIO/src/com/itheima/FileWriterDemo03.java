package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ʵ�����ݵĻ���?
 * 		\n����ʵ�ֻ��У�����windowsϵͳ�Դ��ļ��±��򿪲�û�л��У�����Ϊʲô��?��Ϊwindowsʶ��Ļ��в���\n������\r\n
 * 		windows:\r\n
 * 		linux:\n
 * 		mac:\r
 * ���ʵ�����ݵ�׷��д��?
 * 		FileWriter(String fileName, boolean append)
 */

public class FileWriterDemo03 {

	public static void main(String[] args) throws IOException {
		// FileWriter fw = new FileWriter("a.txt");
		FileWriter fw = new FileWriter("a.txt", true);// ��ʾ׷��д�룬�����Ĭ��Ϊfalse

		for (int i = 0; i < 10; i++) {
			fw.write("helo" + i);
			fw.write("\r\n");// Windowsʵ�ֻ���
		}

		fw.close();

	}

}
