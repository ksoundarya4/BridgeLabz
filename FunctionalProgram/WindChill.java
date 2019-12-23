/***************
 * Functional Program
 * purpose : Takes double command-line argument 
 * t and v and prints wind chill.
 * @discription
 * @file WindChill.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 10/12/2019
 */
package com.bridgelabs.FunctionalProgram;
public class WindChill {
	
	/**
	 * Calculates Wind Chill
	 * @param{double}t - Temperature t (in Fahrenheit)
	 * @param{double}v - wind speed (in miles per hour)
	 * @return{double}w - Effective Temperature(wind chill)
	 */
	public static double calulateWindChill(double t , double v)
	{
		double V = Math.pow(v,0.16);
		double w = 35.74 + (0.6215*t) + ((0.4275*t - 35.75)*V);
		return w;
	}
	
	/**
	 * To accept command-line arguments
	 * @param{String} args[0] - input  temperature in degree fahrenheit
	 * @param{String} args[1] - input  velocity in miles per second
	 */
	public static void main(String[] args)
	{
		double temp = 0 ;
		double vel=0;
		if(args.length>0)
		{
			temp = Double.parseDouble(args[0]);
			vel = Double.parseDouble(args[1]);
		}
		
		System.out.println("Thw WindChill  = "+calulateWindChill(temp,vel));
	}

}
