package com.itheima.listener.uilistener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public static void main(String[] args) {
		//1.����С���ڶ��󣺣��������Ķ���
		MyFrame myFrame = new MyFrame();
		//���ô��ڵĿ��
		myFrame.setBounds(500, 300, 200, 180);
		//2.���ô�����ʾ��
		myFrame.setVisible(true);
		
		//���¼�Դ�ϰ󶨼�������
		myFrame.addWindowListener(new MyWindownListener());
	}
}

/**
 * ����������
 */

class MyWindownListener implements WindowListener {
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�رմ���...");
		System.exit(0);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
	
}