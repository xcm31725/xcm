package com.itheima;
/*
 * ���������������ʦ����ҵ����ʦ
			���ԣ����������䣬���Ρ�
			���ԣ�
				��������ʦ��JavaSE
				��ҵ����ʦ��JavaEE
			������ʦ�����д��������ΪplayBasketball
 * */
public class Test {

	public static void main(String[] args) {
		JiChuTeacher jct = new JiChuTeacher("С��è",18);
		jct.teach();
		System.out.println("-------------");
		JiuYeTeacher jyt = new JiuYeTeacher("С����",22);
		jyt.teach();
		jyt.playBasketball();

	}

}
