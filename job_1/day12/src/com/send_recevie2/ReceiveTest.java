package com.send_recevie2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveTest {

	public static void main(String[] args) throws IOException {
		//�������ն˶���
		DatagramSocket ds = new DatagramSocket(520);		
		//�����������
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		//��ȡ��������
		ds.receive(dp);
		//��������
		//��ȡ���Ͷ˵�IP
		InetAddress address = dp.getAddress();
		//��ȡ�ֽ���������
		byte[] data = dp.getData();
		//��ȡ����
		int len = dp.getLength();
		//�������
		System.out.println("send --->" + address.getHostAddress());
		System.out.println(new String(bys, 0, len));
	}

}
