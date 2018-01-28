package com.itheima2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/*
 * 3、分析以下需求，并用代码实现：
		(1)定义一个学生类,属性包含:姓名,年龄,出生日期(Date类型),出生地
		(2)创建集合对象,并存储3个学生对象
		(3)将集合中的所有学生对象存储到项目根路径a.txt文件中
			存储的格式是:姓名,年龄,出生日期,出生地
 * */
public class Test {

	public static void main(String[] args) throws IOException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		ArrayList<Student> list = new ArrayList<Student>();
		/*Student s = new Student("吃货",22,null,"西安");
		Student s1 = new Student("馋嘴",18,null,"渭南");
		Student s2 = new Student("小吃",19,null,"咸阳");
		
		list.add(s);
		list.add(s1);
		list.add(s2);*/
		list.add(new Student("吃货",22,sdf.parse("1995年3月24日"),"西安"));
		list.add(new Student("馋嘴",18,sdf.parse("2000年3月17日"),"渭南"));
		list.add(new Student("小吃",19,sdf.parse("1999年3月24日"),"咸阳"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			bw.write(s.getName()+","+s.getAge()+","+sdf.format(s.getBrithday())+","+s.getAddress());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}
