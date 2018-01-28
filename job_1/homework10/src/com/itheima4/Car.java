package com.itheima4;

import java.io.Serializable;

public class Car implements Serializable{
	/**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */ 
	private static final long serialVersionUID = -2352848946564746931L;
	//颜色(color)
	private String color;
	//轮子个数(num)
	private String num;
	//引擎(Engine)
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
