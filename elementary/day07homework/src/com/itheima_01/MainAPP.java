package com.itheima_01;

public class MainAPP {

	public static void main(String[] args) {
		Teacher t = new Teacher("t001","薛之谦",'男',26,"Java");
		Teacher t1 = new Teacher("t002","张碧晨",'女',24,"IOS");
		Teacher t2 = new Teacher("t003","张杰",'男',28,"Java");
		
		System.out.println("教室编号："+t.getJiaoShiBianHao()+",姓名："+t.getName()+",性别："+t.getXingBei()+",年龄："+t.getAge()+",科目："+t.getKeMu());
		System.out.println("教室编号："+t1.getJiaoShiBianHao()+",姓名："+t1.getName()+",性别："+t1.getXingBei()+",年龄："+t1.getAge()+",科目："+t1.getKeMu());
		System.out.println("教室编号："+t2.getJiaoShiBianHao()+",姓名："+t2.getName()+",性别："+t2.getXingBei()+",年龄："+t2.getAge()+",科目："+t2.getKeMu());
		
		Course c = new Course("s001","Java","2007-02-08","Java学科，包含JavaSE和JavaEE");
		Course c1 = new Course("s002","IOS","2007-02-09","IOS系统开发");
		
		System.out.println("课程编号："+c.getKeChengbianaho()+",名称："+c.getMingCheng()+",创建时间："+c.getTime()+",课程描述："+c.getKeChengmiaoshu());
		System.out.println("课程编号："+c1.getKeChengbianaho()+",名称："+c1.getMingCheng()+",创建时间："+c1.getTime()+",课程描述："+c1.getKeChengmiaoshu());
	}

}
