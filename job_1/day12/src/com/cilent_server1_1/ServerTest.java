package com.cilent_server1_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		//�������ն�����
		ServerSocket ss = new ServerSocket(520);
		//������������
		Socket s = ss.accept();
		//��ȡ����������
		byte[] bys = new byte[1024];
		InputStream is = s.getInputStream();
		//��ȡ����
		int len = is.read(bys);
		String str = new String(bys, 0, len);
		System.out.println(str);
		
		//��ȡ���������
		OutputStream os = s.getOutputStream();
		os.write(str.toUpperCase().getBytes());
		
		s.close();
		ss.close();
		
	}

}
