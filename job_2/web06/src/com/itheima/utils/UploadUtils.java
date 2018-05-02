package com.itheima.utils;

import java.util.UUID;

public class UploadUtils {
	/**
	 * ����һ���ļ���������һ��Ψһ���ļ�����
	 */
	public static String getUuidFilename(String filename){
		//��Java��API����һ����UUID���Բ���������ַ�����aa.txt
		//UUID.randomUUID().toString();
		//����ļ�������չ����
		int idx = filename.lastIndexOf(".");
		String extetions = filename.substring(idx);
		return UUID.randomUUID().toString().replace("-", "")+extetions;
	}
	
	/**
	 * Ŀ¼������㷨ʵ��
	 */
	public static String getRealPath(String uuidFilename) {
		int code1 = uuidFilename.hashCode();
		int d1 = code1 & 0xf;
		int code2 = code1 >>> 4;
		int d2 = code2 & 0xf;
		return "/"+d1+"/"+d2;
	}
	
	public static void main(String[] args) {
		//System.out.println(UUID.randomUUID().toString().replace("-", ""));
		/*String s = getUuidFilename("aa.txt");
		System.out.println(s);*/
		
		String filename = "185363be735345bf8a971d15332601a3.txt";
		int hashCode = filename.hashCode();
		System.out.println(hashCode);
	}
}
