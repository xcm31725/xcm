package com.itheima_01;

public class Course {
	private String keChengbianaho;
	private String mingCheng;
	private String time;
	private String keChengmiaoshu;
	
	public Course() {
	}
	
	public Course(String keChengbianaho, String mingCheng, String time, String keChengmiaoshu) {
		this.keChengbianaho = keChengbianaho;
		this.mingCheng = mingCheng;
		this.time = time;
		this.keChengmiaoshu = keChengmiaoshu;
	}
	
	public String getKeChengbianaho() {
		return keChengbianaho;
	}
	
	public void setKeChengbianaho(String keChengbianaho) {
		this.keChengbianaho = keChengbianaho;
	}
	
	public String getMingCheng() {
		return mingCheng;
	}
	
	public void setMingCheng(String mingCheng) {
		this.mingCheng = mingCheng;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getKeChengmiaoshu() {
		return keChengmiaoshu;
	}
	
	public void setKeChengmiaoshu(String keChengmiaoshu) {
		this.keChengmiaoshu = keChengmiaoshu;
	}
	
}
