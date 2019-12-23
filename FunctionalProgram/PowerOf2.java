/************
 * Basic Core Programs
 * purpose : Prints table of powers of 2 
 * that are less than or equal to 2^N
 * @discription
 * @file PowerOf2
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 09/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class PowerOf2 {
	
	/**
	 * To print power of 2 until 2^N
	 * @param {int}N - print until 2^N
	 */
    public static void printPowerOf2(int N) {
		
    	int[] power = new int[N];
		power[0] = 1;
		for(int i = 1; i<N; i++)
		{
			 power[i] = 2*power[i-1];
			 System.out.println("2 Power of "+i+ "=" +power[i]);
			 
		//	 System.out.println(Math.pow((double)2,(double)i));
		}
		
	}

	public static void main(String[] args)
	{
		printPowerOf2(Integer.parseInt(args[0])); //Takes command line argument N
	}
}
