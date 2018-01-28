package com.itheima2;
/**
 * 
 * @ClassName: Test2  
 * @Description: TODO
 * 2、使用多线程模拟多个人通过一个山洞,这个山洞每次只能通过一个人,
		每个人通过山洞的时间为5秒,3个人随机通过山洞,显示一下每次通过山洞人的姓名
 * @author sudong
 * @date 2018年1月23日 下午8:22:06  
 *
 */
public class Test2 {

	public static void main(String[] args) {
		PersonThread person = PersonThread.eHan();
		Thread t = new Thread(person);
		t.setName("xcm");
		t.start();
		
		Thread t1 = new Thread(person);
		t1.setName("xgd");
		t1.start();
		
		Thread t2 = new Thread(person);
		t2.setName("czm");
		t2.start();
	}

}
