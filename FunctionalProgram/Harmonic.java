/*************************
 * Basic Core Programs
 * purpose: Print the Nth harmonic number
 * @discription
 * @file Harmonic.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 09/12/2019
 */
package com.bridgelabs.FunctionalProgram;
public class Harmonic {
	
	/**
	 * Prints Nth Harmonic number
	 * @param{int}N - if N!=0 then compute harmonics
	 * print 1/1 + 1/2 +..+ 1/N
	 */
	public static void printHarmonics(int N) {
		
		if(N!=0)
		{
		double harmonic = 0;
		String s ="";
		for(int i = 1; i<=N; i++)
		{
			if(i<N)
			System.out.print(s+"1/"+i+" + ");
			if(i==N)
				System.out.println(s+"1/"+i);
			harmonic = harmonic + (double)1/i;
			
		}
		
		System.out.println("Harmonic of N is = "+harmonic);
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter an integer to check harmonics");
		int num = utilclass.InputInteger();
		printHarmonics(num);
	}
}
