package com.integer;
/*
 * �����ж�һ�����Ƿ����int���͵ķ�Χ
 * ���ڻ�����������ֻ����һЩ�򵥵Ĳ��������㣬����JavaΪ���Ƿ�װ���˻����������ͣ�Ϊÿ�ֻ������������ṩ�˰�װ��
 * ��װ����Ƿ�װ�˻����������͵ĵ��࣬Ϊ�����ṩ�˸��ิ�ӵķ�����һЩ����
 * 
 * byte Byte
 * short Short
 * char Character
 * int Integer
 * long Long
 * float Float
 * double Double
 * boolean Boolean
 * 
 * Integer :
 * 		String -- int
 * 			��ʽ1: int inValue();
 * 			��ʽ2��static int parseInt(String s)
 * 		int -- String 
 * 			��ʽ1��+ ""
 * 			����2: String toString()
 * ���췽����
 * 		Integer(int value) 
 * 		Integer(String s)
 * */
public class IntegerDemo {

	public static void main(String[] args) {
		/*Integer i = new Integer("10");
		int a = i.intValue();
		System.out.println(a);*/
		
		/*//static int parseInt(String s)
		int b = Integer.parseInt("10");
		System.out.println(b);*/
		
		/*//String toString()
		Integer i2 = new Integer(10);
		String s = i2.toString();
		System.out.println(s);*/
		
		//static String toString(int i) 
		String s2 = Integer.toString(10);
		System.out.println(s2);
		
		
	}

}
