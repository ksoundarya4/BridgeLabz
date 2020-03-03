/*****************
 * JUNIT program
 * @purpose  prints the day of the week that date falls on
 * @file DaysOfWeek.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 11/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class DaysOfWeek {
	/**
	 * To find out day
	 * 
	 * @param{int}year - Enter year
	 * @param{int}month - Enter month(1-12)
	 * @param{int}date - Enter a date(1-31)
	 * @return{int} day - Day of the week that date falls on (0 for Sunday, 1 for
	 *              Monday, 2 for Tuesday, and so forth)
	 */
	public static String printDay(int year, int month, int date) {

		int day = UtilClass.dayOf(year, month, date);

		switch (day) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";

		default:
			return "Enter correct date";
		}

	}

	public static void main(String[] args) {
		int y = 0;
		int m = 0;
		int d = 0;
		// Accept input through Command Line Arguments
		if (args.length > 0) {
			y = Integer.parseInt(args[0]);
			m = Integer.parseInt(args[1]);
			d = Integer.parseInt(args[2]);
		}

		System.out.println(printDay(y, m, d));

	}
}
