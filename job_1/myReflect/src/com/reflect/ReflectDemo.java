package com.reflect;
/**
 * 
 * @ClassName: ReflectDemo  
 * @Description: TODO
 * ���䣺
 * 		������ʱ�����ǿ��Ի�ȡ����һ��������з���������
 * 		������ʱ�������ǵ�������һ����������з���������
 * 
 * ����ǰ�᣺
 * 		Ҫ��ȡ��Ķ���Class����
 * 
 * @author sudong
 * @date 2018��1��24�� ����7:43:49  
 *
 */
public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		//ͨ��Object��getClass()������ȡ������Ҫ�ж���
		Student s = new Student();
		Class clazz = s.getClass();
		
		//ͨ��������ȡ�ֽ������
		Class clazz1 = Student.class;
		
		//static Class<> forName(String className)
		Class clazz2 = Class.forName("com.reflect.Student");
		
		System.out.println(clazz == clazz1);
		System.out.println(clazz == clazz2);
		System.out.println(clazz);
	}

}
