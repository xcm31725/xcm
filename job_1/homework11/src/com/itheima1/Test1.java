package com.itheima1;
/**
 * 
 * @ClassName: Test1  
 * @Description: TODO
 * 写一个程序,每隔一秒输出当前时间,输出格式如下:
 *		2016年07月28日 16时50分30秒
 * @author sudong
 * @date 2018年1月23日 下午8:05:32  
 *
 */
public class Test1 {

	public static void main(String[] args) {
		DateThread dt = new DateThread();
		Thread t = new Thread(dt);
		t.setName("当前时间");
		t.start();
	}

}
