package com.cilent_server1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		//创建服务端对象
		ServerSocket ss = new ServerSocket(31752);
		//监听
		Socket s = ss.accept();
		//获取输入流对象
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		
		//输出数据
		String str = new String(bys, 0, len);
		System.out.println(str);
		//获取输出流
		OutputStream os = s.getOutputStream();
		//发送数据
		os.write(str.toUpperCase().getBytes());
		//释放资源
		s.close();
	}

}
