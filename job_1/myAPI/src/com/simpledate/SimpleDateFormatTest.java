package com.simpledate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//求出生到今天有多少天
public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		String brithday = "1995-02-05";
		String now = "2017-11-27";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d1 = sdf.parse(brithday);
		Date d2 = sdf.parse(now);
		
		long l1 = d1.getTime();
		long l2 = d2.getTime();
		
		System.out.println("出生到现在有"+((l2-l1)/1000/60/60/24)+"天");
		/*Date d = new Date();
		
		long start = d.parse(brithday);
		long day = d.parse(now);
		
		System.out.println(start);
		//System.out.println("出生到现在有"+((day-start)*1000*60*60*24)+"天");
*/	}

}
