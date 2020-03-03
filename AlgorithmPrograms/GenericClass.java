/**
 * Algorithm Program
 * @discription:Use Generic for Search and Sort Algorithms
 * @file Generics.java
 * @author soundarya<ksoundarya4>
 * 
 */
package com.bridgelabs.AlgorithmPrograms;

import java.util.Arrays;

public class GenericClass<T> {

	/**
	 * Function to return the index of element if present in generic Array
	 * 
	 * @param <T>   - Generic
	 * @param arr   - input Array
	 * @param l     - starting index of Array
	 * @param r     - last index of Array
	 * @param value - element to be searched
	 * @return - index of element if present in an Array.
	 */
	public static <T extends Comparable<T>> int binarySearch(T[] arr, int l, int r, T value) {
		Arrays.sort(arr);
		System.out.println("Sorted Array : ");
		printArray(arr);

		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m].compareTo(value) == 0)
				return m;

			// If x greater, ignore left half
			if (arr[m].compareTo(value) < 0)
				l = m + 1;

			// If x is smaller, ignore right half
			if (arr[m].compareTo(value) > 0)
				r = m - 1;
		}
		return -1;
	}

	/**
	 * Function to perform bubble sort
	 * 
	 * @param <T> - Generic
	 * @param arr - input Array
	 * @return - sorted Array
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * Function to perform Insertion sort
	 * 
	 * @param <T> - Generic
	 * @param arr - Input Array
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			T key = arr[i];
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		printArray(arr);
	}

	/**
	 * Function to perform Merge Sort
	 * 
	 * @param <T>   - Generic
	 * @param arr   - input Array
	 * @param temp  - Temporary Array
	 * @param left  - starting index of Array
	 * @param right - last index of Array
	 */
	public static <T extends Comparable<T>> void mergeSort(T[] arr, T[] temp, int left, int right) {

		if (left < right) {
			int middle = (left + right) / 2;

			mergeSort(arr, temp, left, middle);
			mergeSort(arr, temp, middle + 1, right);
			merge(arr, temp, left, middle, middle + 1, right);
		}

	}

	/**
	 * Function to perform merge
	 * 
	 * @param <T>        - Generic
	 * @param arr        -input Array
	 * @param temp       - temporary Array
	 * @param leftStart  - starting index
	 * @param leftEnd    - middle index
	 * @param rightStart - middle+1m index
	 * @param rightEnd   - last index
	 */
	public static <T extends Comparable<T>> void merge(T[] arr, T[] temp, int leftStart, int leftEnd, int rightStart,
			int rightEnd) {

		int i = leftStart;
		int j = rightStart;
		int k = 0;

		while (i <= leftEnd && j <= rightEnd) {
			if (arr[i].compareTo(arr[j]) <= 0)
				temp[k++] = arr[i++];
			if (arr[i].compareTo(arr[j]) >= 0)
				temp[k++] = arr[j++];
		}

		while (i <= leftEnd)
			temp[k++] = arr[i++];

		while (j <= rightEnd)
			temp[k++] = arr[j++];

		for (i = leftStart, k = 0; i <= rightEnd; i++, k++)
			arr[i] = temp[k];

	}

	/**
	 * Function to print an Array
	 * 
	 * @param <T> - Generic
	 * @param arr - Input Array to be printed.
	 */
	public static <T> void printArray(T[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	/**
	 * Main function to check working of above functions.
	 */
	public static void main(String[] args) {
		String[] arr = new String[4];
		arr[0] = "ramu";
		arr[1] = "bheemu";
		arr[2] = "shamu";
		arr[3] = "ramu";
		printArray(arr);

		int binarySearch = binarySearch(arr, 0, arr.length - 1, "shamu");
		System.out.println("String found at index " + binarySearch);

		System.out.println("Sorting using insertion sort :");
		insertionSort(arr);

		System.out.println("Sorting using bubbleSort : ");
		arr = bubbleSort(arr);
		printArray(arr);

		System.out.println("Sorting using MergeSort :");
		String[] temp = new String[4];
		mergeSort(arr, temp, 0, arr.length - 1);
		printArray(arr);

	}
}
