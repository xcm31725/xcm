package com.itheima3;
/**
 * 
 * @ClassName: Test2  
 * @Description: TODO
 * 3����һ���齱�������б���1-100���ֵ�ƹ����,�����������ȥ�齱,
		��ӡ��ĺ���,ֱ�����齱���е�ƹ����ȡ��  
 * @author sudong
 * @date 2018��1��23�� ����8:34:29  
 *
 */
public class Test2 {

	public static void main(String[] args) {
		NumThread nt = NumThread.lanHan();
		
		Thread t = new Thread(nt);
		t.setName("xcm");
		t.start();
		
		Thread t1 = new Thread(nt);
		t1.setName("xgd");
		t1.start();
	}

}
