package com.itheima2;
/**
 * 
 * @ClassName: Test2  
 * @Description: TODO
 * 2��ʹ�ö��߳�ģ������ͨ��һ��ɽ��,���ɽ��ÿ��ֻ��ͨ��һ����,
		ÿ����ͨ��ɽ����ʱ��Ϊ5��,3�������ͨ��ɽ��,��ʾһ��ÿ��ͨ��ɽ���˵�����
 * @author sudong
 * @date 2018��1��23�� ����8:22:06  
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
