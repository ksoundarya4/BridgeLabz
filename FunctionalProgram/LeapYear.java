package com.bridgelabs.FunctionalProgram;

public class LeapYear {
	
	  public static boolean isLeapYear(int year)
	  {
		if(utilclass.NumberOfDigits(year)==4)
		{
		if((year % 400 == 0) || ((year % 4 ==0) && (year % 100!=0)))
				return true;
		}
		return false;
		}
	
	public static void main(String[] args)
	{
		System.out.println("Enter year to find LeapYear");
		int y = utilclass.InputInteger();
		System.out.println(isLeapYear(y));
	
	}
}
