package com.itheima_02;

public class AbstractTest {

	public static void main(String[] args) {
		/*BasicTeacher bt = new BasicTeacher();
		bt.setName("风清扬");
		bt.setAge(20);
		bt.setGender("男");
		bt.teach();*/
		new BasicTeacher("风清扬", 20, "男").teach();
		
		JobTeacher jt = new JobTeacher();
		jt.setName("东芝");
		jt.setAge(18);
		jt.setGender("女");
		jt.teach();
	}

}
