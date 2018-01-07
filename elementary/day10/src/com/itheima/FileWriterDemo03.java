package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 如何实现数据的换行?
 * 		\n可以实现换行，但是windows系统自带的记事本打开并没有换行，这是为什么呢?因为windows识别的换行不是\n，而是\r\n
 * 		windows:\r\n
 * 		linux:\n
 * 		mac:\r
 * 如何实现数据的追加写入?
 * 		FileWriter(String fileName, boolean append)
 */

public class FileWriterDemo03 {

	public static void main(String[] args) throws IOException {
		// FileWriter fw = new FileWriter("a.txt");
		FileWriter fw = new FileWriter("a.txt", true);// 表示追加写入，后面的默认为false

		for (int i = 0; i < 10; i++) {
			fw.write("helo" + i);
			fw.write("\r\n");// Windows实现换行
		}

		fw.close();

	}

}
