/**********************
 * Logical Program
 * @purpose  To count random numbers generated to 
 * generate distinct coupons.
 * @file CouponNumber.java 
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 24/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class CouponNumber {

	/**
	 * To generate distinct coupons
	 * 
	 * @param{int}N - N distinct coupon numbers
	 * @return{int} count - random number required
	 */
	public static int generateCouponOf(int N) {
		int count = 0;
		int distinct = 0;
		boolean[] iscollected = new boolean[N];

		while (distinct < N) {
			int value = (int) (Math.random() * N);
			count++;
			if (!iscollected[value]) {
				distinct++;
				System.out.println(distinct);
				iscollected[value] = true;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		System.out.println("Enter number of Coupon to be generated");
		int N = UtilClass.inputInteger();
		System.out.println("The random numbers required to generate unique coupons are " + generateCouponOf(N));

	}

}
