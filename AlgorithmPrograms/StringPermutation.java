/***********************
 * Algorithm Programs
 * purpose : Permutation of string
 * @discription
 * @file StringPermutation.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 */
package com.bridgelabs.AlgorithmPrograms;

public class StringPermutation {

	public static void main(String[] args) {
		System.out.println("Enter String");
		String str = "ABC";
		int n = str.length();
		permute(str, 0, n - 1);
	}

	/**
	 * permutation function
	 * 
	 * @param str string to calculate permutation for
	 * @param l   starting index
	 * @param r   end index
	 */
	public static void permute(String str, int l, int r) {

		if (l == r)
			System.out.println("\n" + str);
		if (l != r) {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);

				permute(str, l + 1, r);

				str = swap(str, l, i);
			}
		}
	}

	/**
	 * Swap Characters at position
	 * 
	 * @param a string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
