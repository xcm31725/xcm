package com.cilent_server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class CilentDemo {

	public static void main(String[] args) throws IOException {
		//�����ͻ��˶���
		Socket s = new Socket(InetAddress.getByName("sudong-PC"), 317);
		//��ȡ���������
		OutputStream os = s.getOutputStream();
		//��������
		String str = "hello xcmj";
		os.write(str.getBytes());
		//�ͷ���Դ
		s.close();
	}

}
