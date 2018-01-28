package com.itheima03;
/*
 * A:һ����Ա����  radius��˽�У������ͣ���  // ���Բ�İ뾶��         
				B:�������췽��
					Circle()                 // ���뾶��Ϊ0            
					Circle(double  r)        //����Circle����ʱ���뾶��ʼ��Ϊr        
				C:������Ա����   
					double getArea()         //��ȡԲ�����             
					double getPerimeter()    //��ȡԲ���ܳ�           
					void  show()             //��Բ�İ뾶���ܳ�������������Ļ    
 * */
public class Circle {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double r) {
		super();
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}
	
	public double getArea(double  r){
		return (Math.PI)*r*r;
	}  
	
	public double getPerimeter(double  r){
		return (Math.PI)*2*r;
	}
	
	public void  show(){
		 System.out.println("�뾶��"+radius+",�����"+getArea(radius)+",�ܳ���"+getPerimeter(radius));
	}
}
