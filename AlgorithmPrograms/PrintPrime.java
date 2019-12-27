package com.bridgelabs.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintPrime {

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

	public static void primeAnagram(List<String> l) {
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (utilclass.isAnagram(l.get(i), l.get(j)))
					System.out.println(l.get(i) + " and " + l.get(j));
			}
		}
	}
	
	public static void primePalindrome(List<String> l) {
		for(String str : l)
		{
			if(utilclass.isPalindrome(str))
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