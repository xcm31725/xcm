package zuoye;

import java.util.Random;

public class Test05 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] newArr = new int[3];
		int sum=0;
		
		for(int i=0;i<10;i++){
			arr[i]=i+1;
			//System.out.println(arr[i]);
			
			/*if(newArr[a]!=i){
				newArr[a]=arr[newArr[a]];
				//System.out.println(arr[newArr[a]]);
			}*/
		}
		
		Random r = new Random();
		
		for(int a=0;a<newArr.length;a++){
			newArr[a]=r.nextInt(10);
			/*if(){
				
			}*/
			sum += arr[newArr[a]];
			//System.out.println(arr[newArr[a]]);
		}
		
		/*for(int b=0;b>newArr.length;b++){
			sum += newArr[a];
		}*/
		System.out.println(sum);
	}

}
