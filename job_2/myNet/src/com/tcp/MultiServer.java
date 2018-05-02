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
	JTextField jF1;//用于输入服务端口
	JTextArea jT1,jT2;//jT1用于显示接收到的信息,jT2用于显示系统处理信息
	ServerSocket server;//用于打开服务器
	
	BufferedReader cin;//输入流成员变量
	PrintStream cout;//输出流成员变量
	Socket socket;//套接字成员变量
	
		static Vector clients = new Vector<>();
	public MultiServer() {
		super("多客户信息广播系统-服务器端");
		jL1 = new JLabel("监听端口");
		jL1.setBounds(15, 5, 60, 30);
		jF1 = new JTextField("520", 15);
		jF1.setBounds(85, 5, 100, 30);
		jB1 = new JButton("开始监听");
		jB1.setBounds(200, 5, 100, 30);
		jB1.addActionListener(this);
		
		jL2 = new JLabel("链接信息");
		jL2.setBounds(15, 45, 60, 30);
		jT1 = new JTextArea();
		JScrollPane jS1 = new JScrollPane(jT1);
		jS1.setBounds(15, 75, 310, 100);
		jL3 = new JLabel("系统信息");
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
			//打开服务器
			server = new ServerSocket(Integer.parseInt(jF1.getText()));
			jT2.append("系统提示：聊天服务系统开始启动...\n");
		} catch (IOException e1) {
			jT2.append("服务器端口打开出错\n");
		}
		if(server != null) {
			//开始用户链接
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
				jT1.append("输入流建立异常\n");
			}
		}
		
		public void run() {
			String str = "";
			while(true) {
				try {
					str = cin.readLine();
					cout.println("服务器反馈信息"+str);
				} catch (IOException e) {
					jT1.append("输入输出异常\n");
				}
				if(str.equals("QUIT")) {
					try {
						socket.close();
					} catch (IOException e) {
						jT1.append("套接字关闭异常\n");
					}
					break;
				}else {
					jT1.append("从服务器端读入如下的信息:"+str+"\n");
				}
				
				
			}
		}
	}
	
	public void run() {//将多用户链接过程在run()方法中实现
		while(true) {
			try {
				socket = server.accept();
			}catch(IOException e) {
				jT1.append("用户链接服务器出错\n");
			}
			if(socket != null) {
				//创建收发信息线程对象
				ReadMEssageThread randThread = new ReadMEssageThread(socket);
				//激活线程
				randThread.start();
			}
			
		}
		
	}

}


















