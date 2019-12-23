/**************************
 * Functional Program
 * purpose : Prints Euclidean distance from point (x,y) to origin (0,0)
 * @discription
 * @file Distance.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 10/12/2019
 */

package com.bridgelabs.FunctionalProgram;

public class Distance {
	
	/**
	 * To print Euclidean distance
	 * @param{String}args - Accept command-line arguments
	 * print the euclidean distance
	 */
	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		// convert Strig to integer
		if(args.length>0)
		{
			 x = Integer.parseInt(args[0]);
			 y = Integer.parseInt(args[1]);
			}
		double a = (x*x)+(y*y);
		double Edistance = Math.sqrt(a);
		System.out.println("The Euclidian distance ="+Edistance);
	}

}
