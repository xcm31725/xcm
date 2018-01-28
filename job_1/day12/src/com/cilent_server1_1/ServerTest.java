package com.cilent_server1_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		//创建接收端数据
		ServerSocket ss = new ServerSocket(520);
		//监听（阻塞）
		Socket s = ss.accept();
		//获取输入流对象
		byte[] bys = new byte[1024];
		InputStream is = s.getInputStream();
		//获取长度
		int len = is.read(bys);
		String str = new String(bys, 0, len);
		System.out.println(str);
		
		//获取输出流对象
		OutputStream os = s.getOutputStream();
		os.write(str.toUpperCase().getBytes());
		
		s.close();
		ss.close();
		
	}

}
