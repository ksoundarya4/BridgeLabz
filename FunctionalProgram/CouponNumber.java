package com.bridgelabs.FunctionalProgram;
public class CouponNumber {
	
	
	public static int generateCoupon(int N){
		int count = 0;
		int distinct = 0;
		boolean[] iscollected = new boolean[N];
		
		while(distinct < N)
		{
			int value = (int)(Math.random()*N);
			count++;
			if(!iscollected[value])
			{
				distinct++;
				System.out.println(distinct);
				iscollected[value] = true;
			}
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter number of Coupon to be generated");
		int N = utilclass.InputInteger();
		System.out.println("The random numbers required to generate unique coupons are "+generateCoupon(N));
	
	}				
	


}
