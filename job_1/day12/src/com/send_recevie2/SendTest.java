package com.send_recevie2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendTest {

	public static void main(String[] args) throws IOException {
		//�������Ͷ˶���
		DatagramSocket ds = new DatagramSocket();
		//�����������
		byte[] bys = "hello zcj!".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("sudong-PC"), 520);
		//��������
		ds.send(dp);
		//�ͷ���Դ
	}

}
