package dateTime.maxValCal;

import java.util.Calendar;

public class MaxValCal {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Current date and time : " + cal.getTime());
		
		System.out.println("Maximum year : " + cal.getActualMaximum(Calendar.YEAR));
		System.out.println("Maximum month : " + cal.getActualMaximum(Calendar.MONTH));
		System.out.println("Maximum week of year : " + cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("Maximum day : " + cal.getActualMaximum(Calendar.DATE));
	}
}
