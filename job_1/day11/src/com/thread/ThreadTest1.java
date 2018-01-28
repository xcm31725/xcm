package com.thread;
/*
 * Thread���е�run()����ʵ��
 * 		@Override
	    public void run() {
	        if (target != null) {//�ж�����������Ƿ�Ϊnull
	            target.run();
	        }
	    }
	
	�������߳�ʱ,ϵͳ�����run()����,˭��run()����? �߳�������run()
 */
public class ThreadTest1 {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {	//�������
					
						@Override
						public void run() {
							System.out.println("Runnable xcm");
						}
					}) {
						@Override
						public void run() {	//�̶߳���
							System.out.println("Thread xgd");
						}
					};
					
		t.start();
	}

}
