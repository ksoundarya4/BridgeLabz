/*****************
 * JUNIT Program
 * purpose : To convert a decimal to binary digit, 
 *           To swap nibbles and find new number
 *           Find new number is a power of 2
 * @discription
 * @file Binary.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 14/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class Binary {

	public static void main(String[] args) {
		System.out.println("Enter a number to be converted");
		int num = utilclass.InputInteger();

		int[] binary = utilclass.toBinary(num);
		for (int i = 0; i < binary.length; i++) {
			System.out.print(binary[i]);
		}

		int swapNibble = swapNibbleOf(num);
		System.out.println();
		System.out.println("Number after swaping nibbles = " + swapNibble);

		if (isPowerOf2(swapNibble))
			System.out.println("The swapped number " + swapNibble + " is power of 2");
		if (!isPowerOf2(swapNibble))
			System.out.println("The swapped number " + swapNibble + " is  not power of 2");
	}

	/**
	 * To swap nibble of a number
	 * 
	 * @param{int}num - Input number to swap its nibbles
	 * @return{int} Resultant number
	 */
	public static int swapNibbleOf(int num) {
		return ((num & 0x0f) << 4) | ((num & 0xf0) >> 4);
	}

	/**
	 * To check the resultant number is power of 2
	 * 
	 * @param{int}num - Resultant number from swapNibbles
	 * @return{boolean} true if it is power of 2
	 */
	public static boolean isPowerOf2(int num) {

		if (num == 0)
			return false;
		while (num != 1) {
			if (num % 2 == 1)
				return false;
			num = num / 2;
		}
		return true;
	}
}
