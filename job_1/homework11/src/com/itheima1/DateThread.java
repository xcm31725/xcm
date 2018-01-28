package com.itheima1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * дһ������,ÿ��һ�������ǰʱ��,�����ʽ����:
 *		2016��07��28�� 16ʱ50��30��
 */
public class DateThread implements Runnable{
	int num = 10;
	@Override
	public void run() {
		while(num > 0) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String s = currentDate();
			System.out.println(Thread.currentThread().getName() + ":" + s);			
			num--;
		}
	}

	private String currentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY��MM��dd�� HHʱmm��ss��");
		
		Date d = new Date();
		
		String s = sdf.format(d);
		return s;
	}
	
}
