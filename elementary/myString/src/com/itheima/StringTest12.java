package com.itheima;

import java.util.Scanner;

/*
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�֣������ַ����ֵĴ������������������ַ���
 * 
 * �ַ��ж�	���磺
 	* ch>='A'&& ch<='Z';
 * */
public class StringTest12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		
		int shu = 0, da = 0, xiao = 0;
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if((ch>='A')&&(ch<='Z')){
				da++;
			}else if((ch>='a')&&(ch<='z')){
				xiao++;
			}else if((ch>='0')&&(ch<='9')){
				shu++;
			}else{
				System.out.println("�в������������ַ�"+ch);
			}
		}
		System.out.println("��д����"+da+"�Σ�"+"Сд����"+xiao+"�Σ�"+"���ֳ���"+shu+"��");
	}

}
