package com.cilent_server1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class CilentTest {

	public static void main(String[] args) throws IOException {
		//�����ͻ��˶���
		Socket s = new Socket(InetAddress.getByName("sudong-PC"), 31752);
		//��ȡ�����
		OutputStream os = s.getOutputStream();
		//��������
		os.write("hello xcj!!!".getBytes());
		
		//��ȡ������
		InputStream is = s.getInputStream();
		
		
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		//�������
		System.out.println(new String(bys, 0, len));
		
		s.close();
		
	}

}
