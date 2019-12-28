/******************
 * JUNIT Program
 * 
 * @purpose  To compute the square root of a nonnegative number 
 *           using Newton's method.
 * @file Newton.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 12/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class SquareRootByNewtonMethod {

	public static void main(String[] args) {
		System.out.println("Enter the number to find  square root");
		int num = UtilClass.inputInteger();

		System.out.println("Square root of " + num + " = " + UtilClass.squareRootOf(num));

	}

}
