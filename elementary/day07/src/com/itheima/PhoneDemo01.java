package com.itheima;

public class PhoneDemo01 {
//��Ա����������������ڴ�
	public static void main(String[] args) {
		Phone p = new Phone();
		
		//�����Ա����
		System.out.println("Ʒ�ƣ�"+p.brand);
		System.out.println("�۸�"+p.price);
		System.out.println("��ɫ��"+p.color);
		System.out.println("------------");
		
		//����Ա������ֵ
		p.brand = "��Ϊ";
		p.price = 2999;
		p.color = "��ɫ";
		
		//�����Ա����
		System.out.println("Ʒ�ƣ�"+p.brand);
		System.out.println("�۸�"+p.price);
		System.out.println("��ɫ��"+p.color);
		System.out.println("------------");
		
		//���ó�Ա����
		p.call("xcm");
		p.sendMessage();
	}

}
