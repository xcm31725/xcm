package com.itheima_07;

/*
 * 按要求分析结果，并验证
 * 
 * break：输出2次
 * continue:输出7次
 */
public class BreakAndContinueDemo {
	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) {
			if (x % 3 == 0) {
				// 分别写break，continue，说说输出几次
				//break;
				continue;
			}
			System.out.println("我爱林青霞");
		}

	}
}
