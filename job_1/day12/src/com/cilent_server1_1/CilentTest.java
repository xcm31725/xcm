package com.cilent_server1_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CilentTest {

	public static void main(String[] args) throws IOException {
		//�������Ͷ˶���
		Socket s = new Socket("sudong-PC", 520);
		//��ȡ���������
		OutputStream os = s.getOutputStream();
		//��������
		os.write("hello cj".getBytes());
		
		//��ȡ����������
		InputStream is = s.getInputStream();
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		//�������
		System.out.println(new String(bys, 0, len));
		
		//�ͷ���Դ
		s.close();
		
	}

}
