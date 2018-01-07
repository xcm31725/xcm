package homework;

public class Test02 {

	public static void main(String[] args) {
		int hui5 = hui5();
		int hui7 = hui7();
		
		System.out.println("两个数的差："+(hui7-hui5));
	}

	//获取5个数的回文数
	public static int hui5(){
		int count = 0;
		for(int i=10000; i<100000; i++){
			int ge = i%10;
			int shi = i/10%10;
			int qian = i/1000%10;
			int wan = i/10000%10;
			
			if(ge == wan && shi == qian){
				count++;
			}
		}
		return count;
	}
	
	//获取7个数的回文数
	//1234321
	
		public static int hui7(){
			int count = 0;
			for(int i=1000000; i<10000000; i++){
				int ge = i%10;
				int shi = i/10%10;
				int bai = i/100%10;
				int wan = i/10000%10;
				int shiWan = i/100000%10;
				int baiWan = i/1000000%10;
				
				if(ge == baiWan && shi == shiWan && bai == wan){
					count++;
				}
			}
			return count;
		}
	
	/*public static int hui(){
		String s = "";
		int count = 0;
		for(int i=10000; i<100000; i++){
			s = "i";
		}
		StringBuilder sb = new StringBuilder(s);
		for(int x=0; x<10000; x++){
			sb.reverse();
			String result = sb.toString();
			if(s.equals(result)){
				count++;
			}
		}
		return count;
		
	}*/
	
}
