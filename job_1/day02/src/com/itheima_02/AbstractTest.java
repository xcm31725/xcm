package com.itheima_02;

public class AbstractTest {

	public static void main(String[] args) {
		/*BasicTeacher bt = new BasicTeacher();
		bt.setName("������");
		bt.setAge(20);
		bt.setGender("��");
		bt.teach();*/
		new BasicTeacher("������", 20, "��").teach();
		
		JobTeacher jt = new JobTeacher();
		jt.setName("��֥");
		jt.setAge(18);
		jt.setGender("Ů");
		jt.teach();
	}

}
