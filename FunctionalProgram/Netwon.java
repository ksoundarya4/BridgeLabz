/******************
 * JUNIT Program
 * purpose : to compute the square root of a nonnegative number 
 *           using Newton's method.
 * @discription
 * @file Newton.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 12/12/2019
 */
package com.bridgelabs.FunctionalProgram;
public class Netwon {

	public static void main(String[] args) {
		System.out.println("Enter the number to find  square root");
		int num = utilclass.InputInteger();
		
		System.out.println("Square root of "+num+" = "+utilclass.sqrt(num));

	}

}
