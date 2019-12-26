/*****************
 * Logical Programs
 * purpose :  Simulates a gambler who start with $stake
 *            and place fair $1 bets until he/she 
 *            goes broke (i.e. has no money) or reach $goal.
 * @discription
 * @file Gambler.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 11/12/2019 
 */
package com.bridgelabs.FunctionalProgram;

public class Gambler {

	/**
	 * To calculate number of wins and number of bets
	 * 
	 * @param{String} args[0] - input stack (int)
	 * @param{String} args[1] - input goal (int)
	 * @param{String} args[2] - input number of trails Print number of wins ,
	 *                percentage of win , Average of bets
	 */
	public static void main(String[] args) {
		// Accept input of $stack,$goal and number of trails via command line arguments.
		int stack = Integer.parseInt(args[0]);
		int goal = Integer.parseInt(args[1]);
		int trails = Integer.parseInt(args[2]);

		// Initialize number of wins and bets to Zero
		int wins = 0;
		int bets = 0;

		for (int i = 0; i < trails; i++) {
			int cash = stack;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++;
				if (Math.random() > 0.5)
					cash--;
			}
			if (cash == goal)
				wins++;
		}

		System.out.println("Number of wins = " + wins);
		System.out.println("Percentage of wins = " + (100.0 * wins) / trails);
		System.out.println("Average of bets = " + (1.0 * bets) / trails);
	}

}
