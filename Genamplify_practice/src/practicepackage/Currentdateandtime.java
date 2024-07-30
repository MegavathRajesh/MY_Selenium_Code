package practicepackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Currentdateandtime {

	public static void main(String[] args) {
		 
		int day,month,year,week,days;
		int second,minute,hour;
		
		GregorianCalendar date = new GregorianCalendar();
		day= date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		week = date.get(Calendar.WEEK_OF_MONTH);
	//	days= date.get(TextStyle.FULL, Locale.ENGLISH);
		System.out.println(day+"-"+month+1+"-"+year);
		System.out.println(hour+":"+minute+":"+second);
		System.out.println("current week "+week);
         System.out.println();
	}

}
