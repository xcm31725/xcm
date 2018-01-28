package com.itheima4;

import java.io.Serializable;

public class Car implements Serializable{
	/**  
	 * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)  
	 */ 
	private static final long serialVersionUID = -2352848946564746931L;
	//��ɫ(color)
	private String color;
	//���Ӹ���(num)
	private String num;
	//����(Engine)
	public Car() {
		super();
	}
	public Car(String color, String num) {
		super();
		this.color = color;
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public void run() {
		System.out.println("color:"+color+"\t"+"num:"+num);
		Engine e = new Engine();
		e.start();
	}
}
