package com.exception;
/*
 *  finally:���try...catchʹ�ã������ͷ���Դ����β������
 *  ����try...catch������ִ�У�finally�Ĵ���һ����ִ��
 *  
 *  try {
 *  	�п��ܳ�������Ĵ���;
 *  
 *  } catch(�쳣����) {
 *  	�����쳣;
 *  } finally {
 *  	�ͷ���Դ;
 *  	��������;
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





