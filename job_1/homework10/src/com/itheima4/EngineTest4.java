package com.itheima4;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 
 * @ClassName: EngineTest4  
 * @Description: TODO
 * 4、定义一个引擎类(Engine),该类中有一个方法(start),该方法在控制台中输出"引擎启动了!"

	  再定义一个汽车类(Car),该类中有以下属性: 颜色(color),轮子个数(num), 引擎(Engine)
	  这三个属性都有set和get方法,空参和有参构造方法.
	  定义一个方法(run),在这个方法中显示颜色和轮子个数, 调用引擎(Engine)的start方法.  
	 
	  要求: 创建三个汽车对象,设置三个属性的值,把汽车对象存储到集合中,然后通过对象输出流,写到obj.txt文件中.
 * @author sudong
 * @date 2018年1月21日 下午8:42:54  
 *
 */
public class EngineTest4 {

	public static void main(String[] args) throws IOException {
		/*Car c = new Car("red", "4");
		Car c1 = new Car("pint", "3");
		Car c2 = new Car("dark", "5");*/
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("b\\bobj.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b\\obj.txt"));
		
		ArrayList<Car> list = new ArrayList<Car>();
		list.add(new Car("red", "4"));
		list.add(new Car("pint", "3"));
		list.add(new Car("dark", "5"));
		
		oos.writeObject(list);
		
		oos.close();
		
		
		/*ArrayList<Car> list = new ArrayList<Car>();
		list.add(c);
		list.add(c1);
		list.add(c2);
		
		for (int i = 0; i < list.size(); i++) {
			Car ca = list.get(i);
			String[] shs = new String[2];
			shs[0] = ca.getColor();
			shs[1] = ca.getNum();
			String s = ca.getColor()+","+ca.getNum();
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		*/
	}

}
