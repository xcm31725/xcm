package com.cilent_server1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		//��������˶���
		ServerSocket ss = new ServerSocket(31752);
		//����
		Socket s = ss.accept();
		//��ȡ����������
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		
		//�������
		String str = new String(bys, 0, len);
		System.out.println(str);
		//��ȡ�����
		OutputStream os = s.getOutputStream();
		//��������
		os.write(str.toUpperCase().getBytes());
		//�ͷ���Դ
		s.close();
	}

}
