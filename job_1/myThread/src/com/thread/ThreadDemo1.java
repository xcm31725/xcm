package com.thread;
/**
 * 
 * @ClassName: ThreadDemo1  
 * @Description: TODO
 * ���̵߳�ʵ�ַ�ʽ��
 * 		��ʽ1��һ�ַ����ǽ�����Tread�����ࡣ������Ӧ��дThread���run���������������Է��䲢�����������ʵ��
 * 
 * Thread
 * 		String getName()�����ظ��̵߳����ơ�
 * 		void setName()���ı��̵߳����ƣ�ʹ֮�����name��ͬ��
 * CPUִ�г���������
 * @author sudong
 * @date 2018��1��22�� ����3:01:30  
 *
 */
public class ThreadDemo1 {

	public static void main(String[] args) {
		//�����߳�ʵ��
		MyThread mt = new MyThread();
		//��д�̵߳�����
		mt.setName("zc");
		
		//�����߳�
		mt.start();
		
		//�����߳�ʵ��
		MyThread mt1 = new MyThread();
		//��д�̵߳�����
		mt1.setName("sd");
		
		//�����߳�
		mt1.start();
	}

}
