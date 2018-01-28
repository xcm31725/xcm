package com.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		String brithday = "1995-03-24";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d = new Date();
		
		String now = sdf.format(d);
		System.out.println(now);
		
		Date d1 = sdf.parse(brithday);
		Date d2 = sdf.parse(now);
		
		long l = d1.getTime();
		long l2 = d2.getTime();
		
		System.out.println((l2-l)/1000/60/60/24);
	}

}
