package com.thorwable;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
			System.out.println(2/0);
		} catch (Exception e) {
			//System.out.println(e.getMessage());//ԭ��
			//System.out.println(e.toString());//���ͺ�ԭ��
			e.printStackTrace();//����ԭ���λ��
		}
	}
}
