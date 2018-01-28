package com.itheima;
/*
 * 具体事物：基础班老师，就业班老师
			共性：姓名，年龄，讲课。
			特性：
				基础班老师讲JavaSE
				就业班老师讲JavaEE
			部分老师还具有打篮球的行为playBasketball
 * */
public class Test {

	public static void main(String[] args) {
		JiChuTeacher jct = new JiChuTeacher("小馋猫",18);
		jct.teach();
		System.out.println("-------------");
		JiuYeTeacher jyt = new JiuYeTeacher("小果冻",22);
		jyt.teach();
		jyt.playBasketball();

	}

}
