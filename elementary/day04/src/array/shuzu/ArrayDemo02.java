package array.shuzu;
/*
 * 两种常见的异常
 * 		ArrayIndexOutOfBoundsException：角标越界异常
 * 			产生的原因：我们访问了不存在的索引
 * 		NullPointerException:空指针异常
 * 			产生的原因：数组已经不指向堆内存的数据了，你还是用数组名访问该元素
 * */
public class ArrayDemo02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		//访问数组元素
		//System.out.println(arr[3]);
		
		//引用类型：类、接口、数组
		//
		arr = null;
		System.out.println(arr[1]);

	}

}
