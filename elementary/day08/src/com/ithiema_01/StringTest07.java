package com.ithiema_01;

public class StringTest07 {

	public static void main(String[] args) {
		String str = "woaijava,javazhenbang,javahao";
		int index = 0;
		int count = 0;
		while((index=str.indexOf("java"))!=-1){//�ý�ȡ��ֵ���жϣ���ִ��ѭ������
			String str1 = str.substring(0,index);//��ȡ���֮����ַ���
			String str2 = str.substring(index+"java".length());
			str = str1+str2;
			count++;
		}
		System.out.println(str);
		System.out.println(count);

	}

}
