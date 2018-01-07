package zuoye;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		int[]  arr = new int[10];
		
		Random r = new Random();
		
		a:for (int i = 0; i < arr.length; ) {
			//产生一个随机数
			int n = r.nextInt(10);
			//判断数组中是否已经存在这个随机数
			for (int j = 0; j < i; j++) {
				if(arr[j]==n){
					//如果存在则代码跳转第12行，重新产生随机数
					continue a;//a:是指定意思是跳转到上面的标记，相当于锚链接
				}
			}
			arr[i] = n;
			i++;
			//System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
