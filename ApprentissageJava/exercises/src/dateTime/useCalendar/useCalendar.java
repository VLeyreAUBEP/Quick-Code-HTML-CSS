package dateTime.useCalendar;

import java.util.Calendar;

public class useCalendar {
	public static void main(String[] args) {
		int year = 1997;
		int month = 2;
		int date = 6;
		
		Calendar cal = Calendar.getInstance();
		cal.clear();
		System.out.println();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date);
		System.out.println(cal.getTime());
		System.out.println();
	}
}