package com.itheima;
/*
		����һ��
			��
				����:����,����,����
				��Ϊ:����
				
			��Ŀ������(Manager) 
				���ԣ����� ���� ���� ����
				��Ϊ������work
			����Ա��(Coder)
				���ԣ����� ���� ����
				��Ϊ������work
 * */
public class TestPerson {

	public static void main(String[] args) {
		Coder c = new Coder("С����","002",5000);
		c.work();
		
		Manager m = new Manager("С��è","001",10000,10000);
		m.work();
	}

}
