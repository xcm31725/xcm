package com.thread;
/**
 * 
 * @ClassName: ThreadDemo2  
 * @Description: TODO
 * �����̵߳���һ�ַ���������ʵ�� Runnable �ӿڵ��ࡣ����Ȼ��ʵ�� run ������
 * Ȼ����Է�������ʵ�����ڴ��� Thread ʱ��Ϊһ�����������ݲ�������
 * �������ַ���ͬһ������������ʾ��
 * 
 * Thread(Runnable target) : �����µ� Thread ����
 * static Thread currentThread() : ���ضԵ�ǰ����ִ�е��̶߳�������á� 
 * 
 * @author sudong
 * @date 2018��1��22�� ����3:40:15  
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread1 mt = new MyThread1(100);
		Thread t = new Thread(mt);
		t.setName("xcm");
		
		t.start();
		
		MyThread1 mt1 = new MyThread1(100);
		new Thread(mt1).setName("czm");
		new Thread(mt1).start();
	}

}
