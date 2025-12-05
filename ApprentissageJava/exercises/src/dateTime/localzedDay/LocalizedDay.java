package dateTime.localzedDay;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class LocalizedDay {
	public static void main(String[] args) {
		DateFormatSymbols symbols = new DateFormatSymbols(Locale.of("fr"));
		
		String[] dayNames = symbols.getWeekdays();
		for(String s : dayNames) {
			System.out.println(s);
		}
	}
}
