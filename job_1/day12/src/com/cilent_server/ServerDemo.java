package com.cilent_server;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		//��������˶���
		ServerSocket ss = new ServerSocket(317);
		//����
		Socket s = ss.accept();
		//��ȡ����������
		InputStream is = s.getInputStream();
		//��������
		byte[] bys = new byte[1024];
		int len = is.read(bys);

		InetAddress address = s.getInetAddress();
		System.out.println("cilent --->" + address.getHostName());
		System.out.println(new String(bys, 0, len));
		
	}

}
