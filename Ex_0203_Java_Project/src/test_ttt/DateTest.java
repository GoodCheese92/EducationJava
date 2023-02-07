package test_ttt;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Calendar cld = Calendar.getInstance();
		
		
		Date date = new Date();
//		date.setMonth(10);
//		date.setDate(20);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss");
		
		System.out.println(sdf.format(date));
		System.out.println(date.getTime());
		System.out.println(date.getYear());
		
		System.out.println(cld.get(Calendar.YEAR));
		System.out.println(cld.get(Calendar.MONTH));
		System.out.println(cld.get(Calendar.DATE));
		
		
		
		
		
	} // end of main
} // end of class
