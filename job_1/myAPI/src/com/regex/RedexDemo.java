package com.regex;
/*
 * ��֤�ۿۺ�
 * 		5-15λ
 * 		������0��ʼ
 * 		ȫ������
 * */
public class RedexDemo {

	public static void main(String[] args) {
		String qq = "12356";
		
		boolean flag = qq.matches("[1-9][0-9]{4,14}");
		System.out.println(flag);
		/*qq.toLowerCase();
		[a-z][aeiou][a-z];*/
	}

}
