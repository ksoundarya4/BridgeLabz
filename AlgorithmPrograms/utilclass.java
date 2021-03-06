/********************
 * UtilClass
 * purpose : To code repetating methods
 * @discription
 * @file utilclass.java
 * @author soundarya<ksoundarya4>
 */

package com.bridgelabs.AlgorithmPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class utilclass {

	/**
	 * To accept String input from Keyboard
	 *
	 * @return{String} inputed String
	 */
	public static String InputString() {
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.nextLine();
		return str;

	}

	/**
	 * To accept integer input from Keyboard
	 *
	 * @return{int} inputed number
	 */
	public static int InputInteger() {

		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		return i;
	}

	/**
	 * To accept Number input from Keyboard
	 *
	 * @return{double} inputed Number
	 */
	public static double InputDouble() {
		Scanner sc1 = new Scanner(System.in);
		double d = sc1.nextDouble();
		return d;
	}

	/**
	 * To accept Boolean input from Keyboard
	 *
	 * @return{boolean} inputed true/false
	 */
	public static boolean InputBoolean() {
		Scanner sc1 = new Scanner(System.in);
		boolean b = sc1.nextBoolean();
		return b;
	}

	/**
	 * To calculate number of digits in a Number
	 *
	 * @param{int}num - input number to find number of digits
	 * @return{int} count of digits in a number
	 */
	public static int NumberOfDigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	/**
	 * To check whether the number is prime
	 *
	 * @param{int}num - input integer to check for prime
	 * @return{boolean} true if number is prime
	 */
	public static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;

		if (num == 2)
			return true;

		if (num % 2 == 0)
			return false;

		for (int i = 3; i <= (int) Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	/**
	 * To find the day of the week that date falls on.
	 *
	 * @param{int}year -Input year
	 * @param{int}month -Input month
	 * @param{int}date - Input date
	 * @return{int} 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
	 */
	public static int Day(int year, int month, int date) {
		year = year - (14 - month) / 12;
		int x = year + (year / 4) - (year / 100) + (year / 400);
		month = month + 12 * ((14 - month) / 12) - 2;

		return (date + x + (31 * month) / 12) % 7;

	}

	/**
	 * To convert Temperature from Celsius to Fahrenheit and visaversa
	 *
	 * @param{float}temp - Input temperature
	 * @param{int}ch - 1 for celcius to fahrenheit ch -2 for fahrenheit to celcius
	 *               Prints the converted temperature
	 */
	public static void TempConversion(float temp, int ch) {
		switch (ch) {
		case 1:
			temp = (temp * 9 / 5) + 32;
			System.out.print("Temperature from Celsius to Fahrenheit is : " + temp);
			break;
		case 2:
			temp = (temp - 32) * 5 / 9;
			System.out.print("Temperature from Fahrenheit to Celsius is : " + temp);
			break;
		default:
			System.out.println("Enter valid case");
		}
	}

	/**
	 * To calculate monthlyPayment
	 *
	 * @param P - Principle in integer
	 * @param Y - Number of year in integer
	 * @param R - Rate in integer
	 * @return{double} Monthly Payment
	 */
	public static double MontlyPayment(int P, int Y, int R) {

		int n = 12 * Y;
		double r = 1.0 * R / (12 * 100);

		double payment = (P * r) / (1 - Math.pow((1 + r), (-n)));

		return payment;
	}

	/**
	 * To calculate Square root using Newton's Method
	 *
	 * @param{int}num - Input number to find its square root
	 * @return{double} square root value of the number
	 */
	public static double sqrt(int num) {

		double t = num;
		double epsilon = 1e-15;

		while (Math.abs(t - num / t) > epsilon * t) {
			t = (num / t + t) / 2.0;

		}
		return t;
	}

	/**
	 * To Convert integer to binary form(base 2)
	 *
	 * @param{int}num - Decimal input @return{int[]} integer array of binary
	 */
	public static int[] toBinary(int num) {

		int[] arr = new int[16];

		int i = 0;
		while (num > 0) {
			arr[i] = num % 2;
			num = num / 2;
			i++;
		}

		return utilclass.swap(arr);
	}

	/**
	 * Swapping elements in an array @param{int[]}arr - Integer array to swap
	 * elements @return{int[]} swapped array
	 */
	public static int[] swap(int[] arr) {
		for (int j = 0; j < (arr.length - 1) / 2; j++) {

			arr[j] = arr[j] ^ arr[arr.length - 1 - j];
			arr[arr.length - 1 - j] = arr[j] ^ arr[arr.length - 1 - j];
			arr[j] = arr[j] ^ arr[arr.length - 1 - j];
		}
		return arr;
	}

	/**
	 * To check for palindrome
	 *
	 * @param{String}s - input a word to check for palindrome
	 * @return{boolean} true if a word is palindrome
	 */
	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		String str = new String(sb.reverse());

		if (str.equals(s))
			return true;

		return false;
	}

	/**
	 * format date object in this format 01/12/2016
	 *
	 * @param{Date}date - accepts a date
	 * @return{String} formatted date
	 */
	public static String getFormatedDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		return sdf.format(date);
	}

	/**
	 * Read File
	 *
	 * @param{String}fileName - path of file
	 * @return{String} content of file in String format
	 */
	public static String getFileText(String fileName) {
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		} catch (Exception e) {
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

	/**
	 * To read IntegerArray from keyboard @return{int[]} integer array
	 */
	public static int[] readIntegerArray() {
		System.out.println("Enter number of intergers to be read");
		int N = utilclass.InputInteger();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Enter " + (i + 1) + "th integer");
			arr[i] = utilclass.InputInteger();
		}

		return arr;
	}

	/**
	 * To print integer Array
	 */
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	/**
	 * To calculate the factorial of a number
	 */
	public static long factorial(int num) {
		long factorial_result = 1;
		for (int i = num; i < 1; i++)
			factorial_result *= i;
		return factorial_result;
	}

	/**
	 * To read a file containing list of words separated by commas
	 * 
	 * @param{String}path - To get the path of file.
	 * @return String array containing words present in file.
	 */
	public static String[] readFile(String path) {
		BufferedReader br = null;

		String[] value = null;

		try {
			br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null)
				value = line.split(",");
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return value;
	}

	/**
	 * Function to find a word in String array
	 * 
	 * @param value - String array containing words.
	 * @param word  - Word to be searched
	 * @return true if word is present in an array.
	 */
	public static boolean isWordPresent(String[] value, String word) {

		for (String s : value) {
			if (s.equals(word))
				return true;
		}
		return false;
	}

	/**
	 * To search for a word in an String Array using Binary search
	 * 
	 * @param value - String array containing words.
	 * @param l     - stating index of an Array.
	 * @param r     - last index of an Array.
	 * @param word  - Word to be searched
	 * @return index of the word from an Array.
	 */
	public static int binarySearch(String[] value, int l, int r, String word) {

		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (value[m].compareTo(word) == 0)
				return m;

			// If x greater, ignore left half
			if (value[m].compareTo(word) < 0)
				l = m + 1;

			// If x is smaller, ignore right half
			if (value[m].compareTo(word) > 0)
				r = m - 1;
		}
		return -1;
	}

	/**
	 * To check if two String are Anagram
	 * 
	 * @param s1 - Input String one
	 * @param s2 - Input String two
	 * @return true if two strings are anagram
	 */
	public static boolean isAnagram(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		if (s1.length() != s2.length())
			return false;
		else {
			Arrays.sort(ch1);

			Arrays.sort(ch2);

			for (int i = 0; i < s1.length(); i++) {
				if (ch1[i] != ch2[i])
					return false;
			}
		}
		return true;
	}

}