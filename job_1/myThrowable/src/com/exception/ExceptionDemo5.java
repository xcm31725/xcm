package com.exception;
/*
 * Ҫ��дһ�����������տ��Գɼ��ķ�Χ��0-100֮�����������������������쳣
 * 
 * throws�������쳣��һ�ַ�ʽ�����쳣�׳����е�����������
 * throw�������쳣�ķ�ʽ�����ҽ�������
 * 
 * ע�⣺����׳���throw�����Ǳ���ʱ���쳣�������ڷ����������׳�
 * 
 * ��ζ���һ���쳣��
 * 		�ǳ��򵥣�дһ����ȥ�̳�Exception����RuntimeException��Ȼ��ʵ�ֶ�����켴��
 * */
public class ExceptionDemo5 {

	public static void main(String[] args) {
	
		try {
			checkScore(110);
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void checkScore(int score) {
		
		if(score < 0 || score > 100){
			throw new RuntimeException("������ĳɼ����Ϸ�");
		}
		
		System.out.println("����ɹ�");
	}

}
