package com.itheima3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

/**
 * 
 * @ClassName: Test3  
 * @Description: TODO
 * 3、键盘录入数据,把录入的数据用打印流输出到当前项目下的log.txt文件中,
		当输入"quit"时,程序结束.
 * @author sudong
 * @date 2018年1月21日 下午8:32:21  
 *
 */
public class Test3 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		//InputStreamReader is = new InputStreamReader(System.in);
		Reader r = new InputStreamReader(is);
		
		FileWriter fw = new FileWriter("b\\log.txt");
//		PrintWriter pw = new PrintWriter("b\\log.txt");
		
		int len;
		char[] chs = new char[1024];
		while((len = r.read(chs)) != -1) {
			String s = new String(chs, 0, len);
			
			if(s.contains("quit")){
				break;
			}
			
			fw.write(s);
			fw.write("\r\n");
			fw.flush();
		}
		
		is.close();
		fw.close();
		
	}

}
