package com.itheima03;
/*
 * ��дһ��Բ������Cylinder�����̳��������Circle�ࡣ��ӵ�У�  
				A:һ����Ա����  
					double hight��˽�У������ͣ���  // Բ����ĸߣ�         
				B:���췽��            
					Cylinder (double r, double  h ) //����Circle����ʱ���뾶��ʼ��Ϊr         
				C:��Ա����              
					double getVolume()              //��ȡԲ��������              
					void  showVolume()              //��Բ���������������Ļ  
				��дӦ�ó��򣬴�����Ķ��󣬷ֱ�����Բ�İ뾶��Բ����ĸߣ�
				���㲢�ֱ���ʾԲ�뾶��Բ�����Բ�ܳ���Բ���������� 
 * */
public class Cylinder extends Circle {
	private double hight;

	public Cylinder() {
		super();
	}

	public Cylinder(double r,double h) {
		super(r);
		this.hight = h;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double h) {
		this.hight = h;
	}

	public double getVolume(double r,double h){
		return Math.PI*r*r*h;
	}
	
	public void  showVolume(){
		System.out.println("�����"+getVolume(getRadius(),hight));
	}
	
	
}
