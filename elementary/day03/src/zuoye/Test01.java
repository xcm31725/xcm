package zuoye;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入你的成绩：");
		int score = sc.nextInt();
		
		//如果条件有重合，吧小区间写在上面
		//注意：当使用else if的时候，一定要问自己，是不是把所有的情况都考虑到了，是代码的健壮性
		if(score<0||score>100){
			System.out.println("你输入的成绩有误");
		}else if(score>=90){
			System.out.println("优秀");
		}else if(score>=80){
			System.out.println("好");
		}else if(score>=70){
			System.out.println("良");
		}else if(score>=60){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}

	}

}

