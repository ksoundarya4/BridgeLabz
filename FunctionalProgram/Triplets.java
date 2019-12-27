
/****************************
 * Functional Programs
 * @purpose : sum of three integers adds to zero
 * @file AddsToZero.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 10/12/2019
 *
 */
package com.bridgelabs.FunctionalProgram;

import java.util.ArrayList;
import java.util.List;

public class Triplets {

	/**
	 * To find out integers that adds to zero
	 * 
	 * @param nums -Integer Array of numbers
	 * @return the list of triplets
	 */
	public static List<String> addToZero(int[] nums) {

		List<String> l = new ArrayList<String>();

		for (int firstIndex = 0; firstIndex < nums.length - 2; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < nums.length - 1; secondIndex++) {
				for (int thirdIndex = secondIndex + 1; thirdIndex < nums.length; thirdIndex++) {
					if (nums[firstIndex] + nums[secondIndex] + nums[thirdIndex] == 0)
						l.add("[" + nums[firstIndex] + "," + nums[secondIndex] + "," + nums[thirdIndex] + "]");
				}
			}
		}
		return l;
	}

	public static void main(String[] args) {

		int[] a = utilclass.readIntegerArray();
		List<String> l = addToZero(a);

		System.out.println("Number of triplets = " + l.size());
		System.out.println(l);

	}
}
