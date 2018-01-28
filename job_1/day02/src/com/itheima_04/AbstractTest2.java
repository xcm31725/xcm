package com.itheima_04;
/*
 *	员工(Employee)示例：
	需求：
		公司中 
			程序员(Programmer)有姓名(name)，工号(id)，薪水(pay)，工作(work)。
			项目经理(Manager)除了有姓名(name)，工号(id)，薪水(pay)，工作(work)，还有奖金(bonus)。
	
	
	共性
		属性	姓名，工号，薪水
		行为	工作


	
 */
public class AbstractTest2 {

	public static void main(String[] args) {
		Programmer p = new Programmer("小果冻,","001",5000);
		p.work();
		
		Manager m = new Manager("小馋猫,","002",10000,10000);
		m.work();

	}

}
