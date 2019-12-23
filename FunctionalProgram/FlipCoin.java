/*********************
 * Basic Core Program
 * purpose : Flip Coin and Print percentage of Heads and tails
 * @file FlipCoin.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 09/12/2019
 */
package com.bridgelabs.FunctionalProgram;
public class FlipCoin {
	
	/***
	 * To flip a coin
	 * @param N : Number of times to flip a coin (datatype:Integer)
	 * @return percentage of Head vs Tails
	 */
	public static double toFlipCoin(int N)
	{
	    int T = 0;
		int H = 0;
		
		for(int i = 0; i<N; i++)
		{
			double d = Math.random();
			if(d<=0.5)
				T++;
			if(d>0.5)
			H++;
		}
		
		 return (100.0*H)/T;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter number of times to Flip a Coin");
		int N = utilclass.InputInteger();
		System.out.println(FlipCoin.toFlipCoin(N));
	}
	

}
