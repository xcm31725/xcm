package com.itheima3;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��һ���齱�������б���1-100���ֵ�ƹ����,�����������ȥ�齱,
		��ӡ��ĺ���,ֱ�����齱���е�ƹ����ȡ��  
 */
public class NumThread implements Runnable{

	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	private static NumThread num;
	
	private NumThread() {
		
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
	}
	
	public static NumThread lanHan(){
		synchronized(NumThread.class) {
			if(num == null) {
				num = new NumThread();
			}
		}
		return num;
	}
	
	

	@Override
	public void run() {
		
		Random r = new Random();
		
		while(true) {
			synchronized (this) {
				if(list.size() > 0 ) {
					Integer result = list.remove(r.nextInt(list.size()));
					
					System.out.println(Thread.currentThread().getName() + "�鵽��" + result + "��");
				}else {
					return;
				}
				
			}
		}
	}
	
	
	/*private int n = 100;
	@Override
	public void run() {
		while(true) {
			synchronized (NumThread.class) {
				
				if(n > 0){
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + ":" + n--);
				}
			}
		}
	}*/

}
