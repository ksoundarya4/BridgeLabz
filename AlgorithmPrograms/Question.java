/****************************
 * Algorithm Programs
 * Description : Takes a command-line argument N, 
 * asks you to think of a number between 0 and N-1, where N = 2^n,
 *  and always guesses the answer with n questions.
 *  @file Question.java
 *  @author soundarya<ksoundarya4>
 */
package com.bridgelabs.AlgorithmPrograms;

public class Question {

	/**
	 * function to guess the number
	 * 
	 * @param l - First number in range
	 * @param h - last number in range
	 * @return the guessed answer
	 */
	public static int search(int l, int h) {
		if (h - l == 1)
			return l;

		int mid = l + (h - l) / 2;
		System.out.println("is your number less than " + mid);
		boolean b = utilclass.InputBoolean();
		if (b)
			return search(l, mid);

		return search(mid, h);
	}

	/**
	 * Function to accept the command line argument
	 * 
	 * @param args - an integer to set the range
	 */
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int N = (int) Math.pow(2, a);
		System.out.println("Think of any number between 0 to " + N);
		int secret = search(0, N);
		System.out.println("The number is " + secret);

	}
}
