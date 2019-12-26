/*****************
 * Algorithm Programs
 * purpose :  Reads in strings and prints them in sorted order using insertion sort.
 * @discription
 * @file InserstionSort.java
 * @author soundarya<ksoundarya4>
 */
package com.bridgelabs.AlgorithmPrograms;

public class InserstionSort {

	/**
	 * To sort an Integer Array using Insertion sort.
	 * 
	 * @param arr - input integer Array. 
	 */
	public static void insertionSortInteger(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		utilclass.printArray(arr);
	}

	/**
	 * To Convert a String to String Array and sort it
	 * @param s - Sentence input
	 */
	public static void insertionSortStrings(String s) {

		String[] arr = s.split(" ");

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			String key = arr[i];
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		GenericClass.printArray(arr);
	}

	public static void main(String[] args) {

		System.out.println("Enter a sentence to sort");
		String s = utilclass.InputString();
		insertionSortStrings(s);
	}

}
