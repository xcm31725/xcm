package com.send_receive1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 
 * @ClassName: SendDemo  
 * @Description: TODO  
 * UDPЭ���շ����ݵ�ע�����
 * 		�˿ںŴ������ݿ���������������������쳣�������ղ�������
 * 		Exception in thread "main" java.net.BindException: Address already in use: Cannot bind
 * 			�˿ں��Ѿ����� 
 * @author sudong
 * @date 2018��1��23�� ����9:12:08  
 *
 */
public class SendDemo {

	public static void main(String[] args) throws IOException {
		//�������Ͷ�Socket����
		DatagramSocket ds = new DatagramSocket();
		
		//����������
		byte[] bys = "hello xcm!".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("sudong-PC"), 31725);
		
		//��������
		ds.send(dp);
		
		//�ͷ���Դ
		ds.close();
	}

}
