package erweizhuzu;
/*
 * 二位数组配合索引可以获取到每一个一维数组
 * 每一个一维数组配合索引使用可以获取一维数组的元素
 * */
public class ArrayArrayDemo01 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		/*System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);*/
		
		//获取第一个二位数组中的第一个一维数组
		for(int a=0; a<arr[0].length; a++){
			System.out.println(arr[0][a]);
		}
		
		//获取第二个二位数组中的第二个一维数组
		for(int a=0; a<arr[1].length; a++){
			System.out.println(arr[1][a]);
		}
		
		//获取第三个二位数组中的第三个一维数组
		for(int a=0; a<arr[2].length; a++){
			System.out.println(arr[2][a]);
		}
		
		System.out.println("-----------------");
		for(int b=0;b<arr.length;b++){
			for(int a=0; a<arr[b].length; a++){
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println();
		}
	}

}
