package com.cilent_server;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @ClassName: SeverDemo  
 * @Description: TODO
 * ʹ��TCPЭ���������
 		�������ն�Socket����
 		������������
 		��ȡ����������
 		��ȡ����
 		�������
 		�ͷ���Դ
 		
 	ServerSocket�����նˣ������Socket
 	ServerSocket(int port) 
 	Socket accept() 
 * @author sudong
 * @date 2018��1��23�� ����11:40:36  
 *
 */
public class SeverDemo {
	public static void main(String[] args) throws IOException {
		//�������ն�Socket����
		ServerSocket ss = new ServerSocket(31725);
		//������������
		Socket s = ss.accept();
		//��ȡ����������
		InputStream is = s.getInputStream();
		//��ȡ����
		byte[] bys = new byte[1024];
		int len;
		len = is.read(bys);
		//�������
		InetAddress address = s.getInetAddress();
		
		System.out.println("client --->" + address.getHostName());
		System.out.println(new String(bys, 0, len));
		
		s.close();
	}
}
