package com.itheima_01;

public class MainAPP {

	public static void main(String[] args) {
		Teacher t = new Teacher("t001","Ѧ֮ǫ",'��',26,"Java");
		Teacher t1 = new Teacher("t002","�ű̳�",'Ů',24,"IOS");
		Teacher t2 = new Teacher("t003","�Ž�",'��',28,"Java");
		
		System.out.println("���ұ�ţ�"+t.getJiaoShiBianHao()+",������"+t.getName()+",�Ա�"+t.getXingBei()+",���䣺"+t.getAge()+",��Ŀ��"+t.getKeMu());
		System.out.println("���ұ�ţ�"+t1.getJiaoShiBianHao()+",������"+t1.getName()+",�Ա�"+t1.getXingBei()+",���䣺"+t1.getAge()+",��Ŀ��"+t1.getKeMu());
		System.out.println("���ұ�ţ�"+t2.getJiaoShiBianHao()+",������"+t2.getName()+",�Ա�"+t2.getXingBei()+",���䣺"+t2.getAge()+",��Ŀ��"+t2.getKeMu());
		
		Course c = new Course("s001","Java","2007-02-08","Javaѧ�ƣ�����JavaSE��JavaEE");
		Course c1 = new Course("s002","IOS","2007-02-09","IOSϵͳ����");
		
		System.out.println("�γ̱�ţ�"+c.getKeChengbianaho()+",���ƣ�"+c.getMingCheng()+",����ʱ�䣺"+c.getTime()+",�γ�������"+c.getKeChengmiaoshu());
		System.out.println("�γ̱�ţ�"+c1.getKeChengbianaho()+",���ƣ�"+c1.getMingCheng()+",����ʱ�䣺"+c1.getTime()+",�γ�������"+c1.getKeChengmiaoshu());
	}

}
