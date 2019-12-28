/*****************
 * JUNIT Program
 * 
 * @purpose : to calculate the monthly payments
 * @file MontlyPayment.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 12/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class MontlyPayment {
	/**
	 * To find monthly payment
	 * 
	 * @param{String}args[0] - Principle in integer
	 * @param{String}args[1] - Number of year in integer
	 * @param{String}args[2] - Rate in integer prints monthly payment for above
	 *                       parameters.
	 */
	public static void main(String[] args) {
		int Principle = 0;
		int Year = 0;
		int Rate = 0;

		if (args.length > 0) {
			Principle = Integer.parseInt(args[0]);
			Year = Integer.parseInt(args[1]);
			Rate = Integer.parseInt(args[2]);
		}
		System.out.println("The Monthly Payment is = " + utilclass.MontlyPayment(Principle, Year, Rate));
	}

}
