package com.ithiema_01;
/*
 * �����ַ�������
 * 
 * ע��:��.���и��ַ�����ʱ��.��ʾͨ��������ԾͰ��ַ��������ˣ����Խ����һ������Ϊ0 ������
 * �����һ���ַ�����û�е��ַ����и��ô���в��������Խ����һ������Ϊ1 �����飬�����Ԫ�ػ�������ַ���
 * */
public class StringTest08 {

	public static void main(String[] args) {
		String s = "javahao,javabang,javaguaguajiao";
		String[] strs = s.split("java");
		String s1 = "";
		for (int i = 0; i < strs.length; i++) {
			s1+=/*"****"+*/strs[i];
		}
		System.out.println(s1);
	}

}
