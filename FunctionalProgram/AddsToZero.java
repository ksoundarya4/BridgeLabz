
/****************************
 * Functional Programs
 * purpose : sum of three integers adds to zero
 * @description
 * @file AddsToZero.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 10/12/2019
 *
 */
package com.bridgelabs.FunctionalProgram;

import java.util.ArrayList;
import java.util.List;

public class AddsToZero {
	
	
	/**
	 * To find out integers that adds to zero
	 * @param nums -Integer Array of numbers
	 * @return the list of triplets
	 */
   public static List<String>  triplets(int[] nums) {
        
		List<String> l = new ArrayList<String>();
		
		for(int i= 0 ;i<nums.length-2;i++)
		{
			for(int j = i+1; j<nums.length-1;j++)
			{
				for(int k = j+1;k<nums.length;k++)
				{
					if(nums[i]+nums[j]+nums[k]==0)
					l.add("["+nums[i]+","+nums[j]+","+nums[k]+"]");
				}
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		
		int[] a = utilclass.readIntegerArray();
		List<String> l = triplets(a);
			
		System.out.println("Number of triplets = "+l.size());
		System.out.println(l);
			
	}
}
