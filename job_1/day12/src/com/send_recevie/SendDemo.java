package com.send_recevie;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class SendDemo {

	public static void main(String[] args) throws IOException {
		//�������Ͷ�Socket����
		DatagramSocket ds = new DatagramSocket();
		//����������
		
		String s = "hello xcmj!";
		byte[] bys = s.getBytes();
		int length = s.length();
		InetAddress address = InetAddress.getByName("sudong-PC");
		int port = 31725;
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
		//��������
		ds.send(dp);
		//�ͷ���Դ
		ds.close();
	}

}
