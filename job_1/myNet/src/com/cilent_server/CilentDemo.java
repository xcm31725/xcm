package com.cilent_server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 
 * @ClassName: CilentDemo  
 * @Description: TODO(������һ�仰��������������)  
 * @author sudong
 * @date 2018��1��23�� ����9:45:03  
 *
 */
public class CilentDemo {

	public static void main(String[] args) throws IOException{
		//�������Ͷ�Socket����
		Socket s = new Socket(InetAddress.getByName("sudong-PC"), 31725);
		//��ȡ���������
		OutputStream os = s.getOutputStream();
		//��������
		String str = "hello xcm!!!";
		os.write(str.getBytes());
		//�ͷ���Դ
		s.close();
	}

}
