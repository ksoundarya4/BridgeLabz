/*********************
 * Algorithm Programs
 * purpose : Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 * Extend the above program to find the prime numbers that are Anagram and Palindrome.
 *  @discription
 *  @file PrintPrime.java
 *  @author soundarya<ksoundarya4>
 *  
 */
package com.bridgelabs.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintPrime {

	/**
	 * Function that returns list of prime numbers from 0-1000
	 * 
	 * @return list of prime number
	 */
	public static List<String> primeBetween0To1000() {
		List<String> l = new ArrayList<String>();

		for (int i = 0; i <= 1000; i++) {
			if (utilclass.isPrime(i)) {
				String s = Integer.toString(i);
				System.out.println(i);
				l.add(s);
			}
		}
		return l;
	}

	/**
	 * Function to find Prime Numbers that are Anagrams
	 * 
	 * @param l - list of prime numbers from 0-1000.
	 */
	public static void primeAnagram(List<String> l) {
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (utilclass.isAnagram(l.get(i), l.get(j)))
					System.out.println(l.get(i) + " and " + l.get(j));
			}
		}
	}

	/**
	 * Function to print the prime numbers that are Palindrome.
	 * 
	 * @param l - list of prime numbers from 0-1000
	 */
	public static void primePalindrome(List<String> l) {
		for (String str : l) {
			if (utilclass.isPalindrome(str))
				System.out.println(str);
		}
	}

	public static void main(String[] args) {

		System.out.println("Prime Numbers between 1 tp 1000 are : ");
		List<String> l = primeBetween0To1000();

		System.out.println("Prime that are Anagram : ");
		primeAnagram(l);

		System.out.println("Prime that are Palindrome : ");
		primePalindrome(l);

	}
}