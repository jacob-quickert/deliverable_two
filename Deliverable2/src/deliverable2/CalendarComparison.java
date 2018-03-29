package deliverable2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalendarComparison {

	// Creating a main method.
	public static void main(String[] args) {

		// Creating a Scanner object
		Scanner scanner = new Scanner(System.in);

		// Declaring variables for the project
		String strOldDate;
		String strNewDate;
		int days = 0;
		int months = 0;
		int years = 0;
		LocalDate oldDate;
		LocalDate newDate;
		Period diffDates;

		// Prompt user for date input
		System.out.print("Enter the oldest date in the format YYYY-MM-DD: ");
		strOldDate = scanner.nextLine();
		oldDate = LocalDate.parse(strOldDate);

		// Print out user's input for clarity
		System.out.println("Your oldest date is " + oldDate + " .");

		// Prompt user for another date input
		System.out.print("Enter the latest date in the format YYYY-MM-DD: ");
		strNewDate = scanner.nextLine();
		newDate = LocalDate.parse(strNewDate);

		// Print out user's input for clarity
		System.out.println("Your latest date is " + newDate + " .");

		// Set up the calculation between the dates using a "Period"
		diffDates = oldDate.until(newDate);

		days = diffDates.getDays();
		months = diffDates.getMonths();
		years = diffDates.getYears();
		scanner.close();

		// final output of the number of years, months and days between two dates
		System.out.println(
				"There are " + years + " Years, " + months + " Months, and " + days + " Days between those two dates.");
	}
}
