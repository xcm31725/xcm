package com.exception;
/*
 * ��δ������쳣��
 * 		����ʹ�ö��try...catch���
 * 		ʹ��һ��try�Ͷ��catch
 * 
 * ���catch֮���˳��
 * 		���catch֮��������Ӹ����ϵ
 * 		ͬ���������⻥��λ��
 * 		��������Ӹ����ϵ�ˣ��������ź���
 * */
public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			int[] arr = new int[5];
			System.out.println(arr[6]);
			System.out.println(2 / 0);
		} catch (NullPointerException e) {
			System.out.println("��ָ���쳣");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Ǳ�Խ��");
		} catch (Exception e) {
			System.out.println("�����쳣��");
		}
	}

}
