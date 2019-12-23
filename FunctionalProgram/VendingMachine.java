package com.bridgelabs.FunctionalProgram;

public class VendingMachine {

	//To Determine the available notes in Vending Machine
	private static final int[] notes = {1000,500,100,50,10,5,2,1};
	
	private static int i = 0;
	
	//To check total number of notes returned
	private static int TotalNotes = 0;
	
	public static int calculate(int Money , int[] notes)
	{
		int reminder = 0;
		if(Money==0)
			return -1;
		
		if(Money>0)
		{
			if(Money>=notes[i])
			{
				int countNotes = Money/notes[i];
				reminder = Money%notes[i];
				Money = reminder;
				TotalNotes+=countNotes;
				System.out.println(notes[i]+" Notes----> "+countNotes);
				
			}
			i++;
		
		return calculate(Money,notes);
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the Amount to be received by VendingMachine");
		int Money = utilclass.InputInteger();
		
		
		VendingMachine.calculate(Money, notes);
		System.out.println("Total number of notes returned = "+TotalNotes);
		
	}
}