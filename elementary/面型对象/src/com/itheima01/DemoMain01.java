package com.itheima01;

public class DemoMain01 {
	/*
	 * public :��JVM���ã�����Ȩ��Ҫ�㹻��
	 * static :��JVM���ã�����Ҫ��������ֱ������.���ü���
	 * void   :��JVM���ã�����Ҫ���κεķ���ֵ
	 * main   :ֻ������д���ܱ�JVMʶ��main���ǹؼ���
	 * Stirng[] args :��ǰ���������ռ���¼���
	 * */
	public static void main(String[] args) {
		System.out.println(args.length);

		for(int i=0; i<args.length; i++){
			System.out.println(args[1]);
		}
	}

}
