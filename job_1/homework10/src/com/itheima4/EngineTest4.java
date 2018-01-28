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
 * 4������һ��������(Engine),��������һ������(start),�÷����ڿ���̨�����"����������!"

	  �ٶ���һ��������(Car),����������������: ��ɫ(color),���Ӹ���(num), ����(Engine)
	  ���������Զ���set��get����,�ղκ��вι��췽��.
	  ����һ������(run),�������������ʾ��ɫ�����Ӹ���, ��������(Engine)��start����.  
	 
	  Ҫ��: ����������������,�����������Ե�ֵ,����������洢��������,Ȼ��ͨ�����������,д��obj.txt�ļ���.
 * @author sudong
 * @date 2018��1��21�� ����8:42:54  
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
