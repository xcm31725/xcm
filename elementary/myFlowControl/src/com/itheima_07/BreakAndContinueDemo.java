package com.itheima_07;

/*
 * ��Ҫ��������������֤
 * 
 * break�����2��
 * continue:���7��
 */
public class BreakAndContinueDemo {
	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			if (x % 3 == 0) {
				// �ֱ�дbreak��continue��˵˵�������
				//break;
				continue;
			}
			System.out.println("�Ұ�����ϼ");
		}

	}
}
