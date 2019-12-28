/**********************
 * Basic Core Program
 * 
 * @purpose : to find LeapYear
 * @file LeapYear.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 09/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class LeapYear {

	/**
	 * LeapYear
	 * 
	 * @param{int}year - four digit integer input
	 * @return {boolean} true if Year is Leapyear else false
	 */
	public static boolean isLeapYear(int year) {
		if (utilclass.NumberOfDigits(year) == 4) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println("Enter year to find LeapYear");
		int y = utilclass.InputInteger();
		System.out.println(isLeapYear(y));

	}
}
