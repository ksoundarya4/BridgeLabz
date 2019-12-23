/******************
 * Basic Core Programs
 * purpose : Compute the prime factorization of N
 * @discription
 * @file PrimeFactors.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 09/12/2019
 *******************/
package com.bridgelabs.FunctionalProgram;
public class PrimeFactors {
	
	/**
	 * To print prime factors
	 * @param{ini}N - Integer to be factorized
	 * Prints prime factors of N
	 */
	public static void primeFactors(int N) {
	
		for(int i = 2; i*i<=N; i++) 
		{
	         while(N%i == 0)
	         {
	            System.out.println(i+" ");
	           N = N/i;
	         }
	      }
	      if(N >2)
	      {
	         System.out.println(N);
	      }
	}
	
		public static void main(String[] args)
		{
			System.out.println("Number to find prime factors");
			int N = utilclass.InputInteger();
			primeFactors(N);
		}

}
