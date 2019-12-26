/*********************
 * JUNIT programs
 * purpose : to calculate the minimum number of Notes as
 *           well as the Notes to be returned by the Vending 
 *           Machine as a Change
 *  @discription
 *  @fie VendingMachine.java
 *  @author soundarya<ksoundarya4>
 *  @version 1.0
 *  @since 11/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class VendingMachine {

	// To Determine the available notes in Vending Machine
	private static final int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	private static int i = 0;

	// To check total number of notes returned
	private static int TotalNotes = 0;

	/**
	 * To calculate number of notes to be returned
	 * 
	 * @param{int}Money - To be returned by VendingMachine @param{int[]}notes -
	 *                  Integer array of available notes in the machine
	 * @return{int}number - Number of notes returned from Machine
	 */
	public static int calculate(int Money, int[] notes) {

		int reminder = 0;
		if (Money == 0)
			return -1;

		if (Money > 0) {
			if (Money >= notes[i]) {
				int countNotes = Money / notes[i];
				reminder = Money % notes[i];
				Money = reminder;
				TotalNotes += countNotes;
				System.out.println(notes[i] + " Notes----> " + countNotes);

			}
			i++;

			return calculate(Money, notes);
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Amount to be received by VendingMachine");
		int Money = utilclass.InputInteger();

		VendingMachine.calculate(Money, notes);
		System.out.println("Total number of notes returned = " + TotalNotes);

	}
}
