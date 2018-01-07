package homework;

public class Test1_2 {

	public static void main(String[] args) {
		String s = "";
		StringBuilder sb = new StringBuilder(s);
		int count = 0;
		for(int i=13; i<20; i++){
			sb.append(i); 
			//sb.reverse();
			//String result = sb.toString();
			
			//System.out.println(result);
		}
		//sb.reverse();
		String result = sb.toString();
		//result.charAt(10);
		char[] ch = result.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		//System.out.println(result.toString());
		//System.out.println(sb);
		
		
		//for(int x=0; x<10000; x++){
			
			/*if(s.equals(result)){
				count++;
				System.out.println(s);
			}*/
			
		//}
		

	}
	
	public static int hui(){
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
		
	}

}
