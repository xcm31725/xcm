package com.itheima1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 写一个程序,每隔一秒输出当前时间,输出格式如下:
 *		2016年07月28日 16时50分30秒
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
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日 HH时mm分ss秒");
		
		Date d = new Date();
		
		String s = sdf.format(d);
		return s;
	}
	
}
