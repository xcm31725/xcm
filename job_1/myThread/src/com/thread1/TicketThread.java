package com.thread1;
/**
 * 
 * @ClassName: TicketThread  
 * @Description: TODO
 * ������ֵ�ԭ��
 * 		Ҫ�ж���߳�
 * 		Ҫ�б�����߳������������
 * 		����̲߳����ķ��ʹ��������
 * 
 * synchronized:ͬ�����������������δ����ͷ����������εĴ����ͷ���һ����ĳ���̷߳��ʣ���ֱ����ס�������߳̽��޷�����
 * 
 * ͬ������飺
 * 		synchronized(������) {
 * 			
 * 		}
 * 
 * ע�⣺������Ҫ�������߳�������
 * 
 * ͬ������ȫ�Ըߣ�Ч�ʵ�
 * ��ͬ����Ч�ʸߣ���ȫ�Ե�
 * 
 * ͬ��������ʹ�ùؼ���synchronized���εķ�����һ����һ���̷߳��ʣ�����������ȫ����ס�������߳��޷�����
 * 
 * synchronized
 * 
 * ע�⣺
 * 		�Ǿ�̬ͬ��������������this
 * 		��̬ͬ���������������ǵ�ǰ����ֽ������
 * 
 * @author sudong
 * @date 2018��1��22�� ����5:08:31  
 *
 */
public class TicketThread implements Runnable{
	static int ticket = 50;
	Object obj = new Object();
	
	@Override
	public void run() {
		while(true) {
			
			/*synchronized (obj) {
				method();
			}*/
			
			//method();
			method1();
		}
	}

	private static synchronized void method1() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(ticket > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + ticket--);
		}
	}
	
	private synchronized void method() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(ticket > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + ticket--);
		}
	}

}
