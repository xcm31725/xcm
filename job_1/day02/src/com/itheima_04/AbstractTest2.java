package com.itheima_04;
/*
 *	Ա��(Employee)ʾ����
	����
		��˾�� 
			����Ա(Programmer)������(name)������(id)��нˮ(pay)������(work)��
			��Ŀ����(Manager)����������(name)������(id)��нˮ(pay)������(work)�����н���(bonus)��
	
	
	����
		����	���������ţ�нˮ
		��Ϊ	����


	
 */
public class AbstractTest2 {

	public static void main(String[] args) {
		Programmer p = new Programmer("С����,","001",5000);
		p.work();
		
		Manager m = new Manager("С��è,","002",10000,10000);
		m.work();

	}

}
