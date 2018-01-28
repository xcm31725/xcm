package com.cilent_server3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		//��������˶���
		ServerSocket ss = new ServerSocket(520);
		//������������
		Socket s = ss.accept();
		//��������������
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//��ȡ����
		String username = br.readLine();
		String password = br.readLine();
		//ȷ����λ
		boolean flag = false;
		//�������Ϻ�User���󣬽��бȶ�
		List<User> users = UserDB.getUser();
		User user = new User(username,password);
		if(users.contains(user)) {
			flag = true;
		}
		
		//�������������
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		//�ж��Ƿ���Ϸ��Ϸ��ص�¼�ɹ��������¼ʧ��
		if(flag) {
			pw.println("��¼�ɹ�");
		}else {
			pw.println("��¼ʧ��");
		}
		//�ͷ���Դ
		s.close();
		ss.close();
		
	}

}
