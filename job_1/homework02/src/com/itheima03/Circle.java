package com.itheima03;
/*
 * A:一个成员变量  radius（私有，浮点型）；  // 存放圆的半径；         
				B:两个构造方法
					Circle()                 // 将半径设为0            
					Circle(double  r)        //创建Circle对象时将半径初始化为r        
				C:三个成员方法   
					double getArea()         //获取圆的面积             
					double getPerimeter()    //获取圆的周长           
					void  show()             //将圆的半径、周长、面积输出到屏幕    
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
		 System.out.println("半径："+radius+",面积："+getArea(radius)+",周长："+getPerimeter(radius));
	}
}
