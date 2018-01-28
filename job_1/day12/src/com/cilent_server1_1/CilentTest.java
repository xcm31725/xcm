package com.cilent_server1_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CilentTest {

	public static void main(String[] args) throws IOException {
		//创建发送端对象
		Socket s = new Socket("sudong-PC", 520);
		//获取输出流对象
		OutputStream os = s.getOutputStream();
		//发送数据
		os.write("hello cj".getBytes());
		
		//获取输入流对象
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		//输出数据
		System.out.println(new String(bys, 0, len));
		
		//释放资源
		s.close();
		
	}

}
