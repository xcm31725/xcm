package com.itheima5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.itheima4.Car;

/**
 * 
 * @ClassName: Test5  
 * @Description: TODO 5��ͨ������������,�ѵڶ����е�obj.txt�еĶ����ȡ����, �����������������е�run����.
 * @author sudong
 * @date 2018��1��21�� ����8:50:48  
 *
 */
public class Test5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b\\obj.txt"));
		
		Object obj = ois.readObject();
		ArrayList<Car> list = (ArrayList<Car>) obj;
		
		for (Car car : list) {
			//System.out.println(car);
			car.run();
		}
		ois.close();
	}

}
