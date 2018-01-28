package com.exception;
/*
 *  finally:组合try...catch使用，用于释放资源等收尾工作，
 *  无论try...catch语句如何执行，finally的代码一定会执行
 *  
 *  try {
 *  	有可能出现问题的代码;
 *  
 *  } catch(异常对象) {
 *  	处理异常;
 *  } finally {
 *  	释放资源;
 *  	清理垃圾;
 *  }
 *  
 */
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			System.out.println(2/0);
			fw = new FileWriter("a.txt");
			fw.write("xcm");
			fw.write("xgd");
			fw.write("zc");
			//System.out.println(2/0);
			fw.write("sd");
			
			//fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fw != null){
					fw.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}





