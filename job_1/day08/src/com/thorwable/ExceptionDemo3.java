package com.thorwable;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo3 {

	public static void main(String[] args) throws IOException {
		//FileWriter fw = new FileWriter("a.txt");
		//FileReader fr = new FileReader("a.txt");
		
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader("a.txt");
			fw = new FileWriter("a.txt");
			
			fw.write("xcm");
			fw.flush();
		} finally{
			
			try {
				if(fw != null){
					fw.close();
				}
			} finally {
				if(fw != null){
					fr.close();
				}
			}
			System.out.println("--------");
			
			
		}
	}

}
