package com.itheima1;
/**
 * 
 * @ClassName: Test1  
 * @Description: TODO
 * дһ������,ÿ��һ�������ǰʱ��,�����ʽ����:
 *		2016��07��28�� 16ʱ50��30��
 * @author sudong
 * @date 2018��1��23�� ����8:05:32  
 *
 */
public class Test1 {

	public static void main(String[] args) {
		DateThread dt = new DateThread();
		Thread t = new Thread(dt);
		t.setName("��ǰʱ��");
		t.start();
	}

}
