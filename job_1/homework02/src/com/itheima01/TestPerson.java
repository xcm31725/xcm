package com.itheima01;
/*
 * 
			已知学生类(Student)和老师(Teacher)类如下：
				属性:姓名,年龄
				行为:吃饭
				老师有特有的方法:讲课
				学生有特有的方法:学习
				
			人(Person)
				成员变量
					姓名,年龄
				构造方法
					无参和有参
				成员方法
					吃饭
					
			学生类
				成员变量
					姓名,年龄
				构造方法
					无参和有参
				成员方法
					吃饭
					学习
			
			老师
				成员变量
					姓名,年龄
				构造方法
					无参和有参
				成员方法
					吃饭
					讲课
 * */
public class TestPerson {

	public static void main(String[] args) {
		Student s = new Student("小果冻",23);
		s.eat();
		s.study();
		
		Teacher t = new Teacher("小馋猫",18);
		t.eat();
		t.teach();
	}

}
