package dateTime.timeNY;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeNY {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println("A New-York, il est " + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
	}
}
