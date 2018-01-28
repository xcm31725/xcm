package com.itheima;
/*
		需求一：
			人
				属性:姓名,工号,工资
				行为:工作
				
			项目经理类(Manager) 
				属性：姓名 工号 工资 奖金
				行为：工作work
			程序员类(Coder)
				属性：姓名 工号 工资
				行为：工作work
 * */
public class TestPerson {

	public static void main(String[] args) {
		Coder c = new Coder("小果冻","002",5000);
		c.work();
		
		Manager m = new Manager("小馋猫","001",10000,10000);
		m.work();
	}

}
