package dateTime.infoCalendar;

import java.util.Calendar;

public class InfoCalendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Année : " + cal.get(Calendar.YEAR));
		System.out.println("Mois : " + cal.get(Calendar.MONTH));
		System.out.println("Jour : " + cal.get(Calendar.DATE));
		System.out.println("Heures : " + cal.get(Calendar.HOUR));
		System.out.println("Minutes : " + cal.get(Calendar.MINUTE));
	}
}
