package com.itheima03;
/*
 * 编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：  
				A:一个成员变量  
					double hight（私有，浮点型）；  // 圆柱体的高；         
				B:构造方法            
					Cylinder (double r, double  h ) //创建Circle对象时将半径初始化为r         
				C:成员方法              
					double getVolume()              //获取圆柱体的体积              
					void  showVolume()              //将圆柱体的体积输出到屏幕  
				编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，
				计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。 
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
		System.out.println("体积："+getVolume(getRadius(),hight));
	}
	
	
}
