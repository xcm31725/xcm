package com.tcp;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiServer extends JFrame implements ActionListener {
	JLabel jL1,jL2,jL3;
	JButton jB1;
	JTextField jF1;//�����������˿�
	JTextArea jT1,jT2;//jT1������ʾ���յ�����Ϣ,jT2������ʾϵͳ������Ϣ
	ServerSocket server;//���ڴ򿪷�����
	
	BufferedReader cin;//��������Ա����
	PrintStream cout;//�������Ա����
	Socket socket;//�׽��ֳ�Ա����
	
		static Vector clients = new Vector<>();
	public MultiServer() {
		super("��ͻ���Ϣ�㲥ϵͳ-��������");
		jL1 = new JLabel("�����˿�");
		jL1.setBounds(15, 5, 60, 30);
		jF1 = new JTextField("520", 15);
		jF1.setBounds(85, 5, 100, 30);
		jB1 = new JButton("��ʼ����");
		jB1.setBounds(200, 5, 100, 30);
		jB1.addActionListener(this);
		
		jL2 = new JLabel("������Ϣ");
		jL2.setBounds(15, 45, 60, 30);
		jT1 = new JTextArea();
		JScrollPane jS1 = new JScrollPane(jT1);
		jS1.setBounds(15, 75, 310, 100);
		jL3 = new JLabel("ϵͳ��Ϣ");
		jL3.setBounds(15, 75, 60, 30);
		jT2 = new JTextArea();
		JScrollPane jS2 = new JScrollPane(jT2);
		jS2.setBounds(15, 205, 310, 100);
		Container wlContainer = this.getContentPane();
		
		wlContainer.setLayout(null);
		wlContainer.add(jL1);
		wlContainer.add(jF1);
		wlContainer.add(jB1);
		wlContainer.add(jL2);
		wlContainer.add(jS1);
		wlContainer.add(jL3);
		wlContainer.add(jS2);
		
		this.setSize(350,350);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MultiServer w1 = new MultiServer();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			//�򿪷�����
			server = new ServerSocket(Integer.parseInt(jF1.getText()));
			jT2.append("ϵͳ��ʾ���������ϵͳ��ʼ����...\n");
		} catch (IOException e1) {
			jT2.append("�������˿ڴ򿪳���\n");
		}
		if(server != null) {
			//��ʼ�û�����
			ConnectSocket connect = new ConnectSocket();
			connect.start();
		}
		
	}
	
	public class ReadMEssageThread extends Thread {
		
		
		private Socket socket;

		public ReadMEssageThread(Socket socket) {
			this.socket = socket;
			try {
				cin = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
				cout = new PrintStream(this.socket.getOutputStream());
			} catch (IOException e) {
				jT1.append("�����������쳣\n");
			}
		}
		
		public void run() {
			String str = "";
			while(true) {
				try {
					str = cin.readLine();
					cout.println("������������Ϣ"+str);
				} catch (IOException e) {
					jT1.append("��������쳣\n");
				}
				if(str.equals("QUIT")) {
					try {
						socket.close();
					} catch (IOException e) {
						jT1.append("�׽��ֹر��쳣\n");
					}
					break;
				}else {
					jT1.append("�ӷ������˶������µ���Ϣ:"+str+"\n");
				}
				
				
			}
		}
	}
	
	public void run() {//�����û����ӹ�����run()������ʵ��
		while(true) {
			try {
				socket = server.accept();
			}catch(IOException e) {
				jT1.append("�û����ӷ���������\n");
			}
			if(socket != null) {
				//�����շ���Ϣ�̶߳���
				ReadMEssageThread randThread = new ReadMEssageThread(socket);
				//�����߳�
				randThread.start();
			}
			
		}
		
	}

}


















