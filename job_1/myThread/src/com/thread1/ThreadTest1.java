package com.thread1;
/**
 * 
 * @ClassName: ThreadTest1  
 * @Description: TODO
 * ģ���վ��Ʊ
 * 		������
 * 			������Ҫ�л𳵵���Ʊ����ÿ�۳�һ��Ʊ��������һ
 * 			����Ʊ������С��1��ʱ��ֹͣ��Ʊ
 * 			ʹ�ö��߳�ģ�������ڽ�����Ʊ
 * 			����Ʊȫ�����꣬��վҲһ���������Ż�ӭ����
 * 
 * static void sleep(long millis, int nanos) �õ�ǰ�߳���Ϣ���Ժ���ֵΪ׼
 * @author sudong
 * @date 2018��1��22�� ����4:20:04  
 *
 */
public class ThreadTest1 {

	public static void main(String[] args) {
		TicketThread tt = new TicketThread();
		
		Thread t = new Thread(tt);
		t.setName("����1");
		
		Thread t2 = new Thread(tt);
		t2.setName("����2");
		
		Thread t3 = new Thread(tt);
		t3.setName("����3");
		
		t.start();
		t2.start();
		t3.start();
	}

}
