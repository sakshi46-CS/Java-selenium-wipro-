package Day4;

import java.util.Calendar;

public class Calendarexample {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
        // Print the current date and time
        System.out.println("Current Date and Time: " + calendar.getTime());
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);  // Note: Months are 0-based (0 = January)
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println("Specific Date (January 15, 2025): " + calendar.getTime());
        // Add 10 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Date after adding 10 days: " + calendar.getTime());
        // Subtract 1 month from the current date
        calendar.add(Calendar.MONTH, -1);
        System.out.println("Date after subtracting 1 month: " + calendar.getTime());

		
	}
}
