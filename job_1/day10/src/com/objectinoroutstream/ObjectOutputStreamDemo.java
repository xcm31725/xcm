package com.objectinoroutstream;
//java.io.EOFException
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//method();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
		
		/*Object obj = ois.readObject();
		System.out.println(obj);
		Object obj1 = ois.readObject();
		System.out.println(obj1);
		Object obj2 = ois.readObject();
		System.out.println(obj2);*/
		
		try {
			while(true) {
				Object obj = ois.readObject();
				System.out.println(obj);
			}
		} catch (Exception e) {
			System.out.println("ц╩спак");
		}
			
	}

	private static void method() throws IOException, FileNotFoundException {
		ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("b.txt"));
		
		oos.writeObject(new Student("xcm", 18));
		oos.writeObject(new Student("xgd", 23));
		
		oos.close();
	}

}
