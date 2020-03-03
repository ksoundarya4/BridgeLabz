/**********************
 * Algorithm Program
 * purpose : a program to do Merge Sort of Integer.
 * @discription
 * @file MergeSort.java
 * @author soundarya<ksoundarya4> 
 */
package com.bridgelabs.AlgorithmPrograms;

public class MergeSort {

	/**
	 * To merge An Array
	 * 
	 * @param arr      - Input Array to sort
	 * @param left     - stating index of an array
	 * @param leftEnd  , rightStart - middle index of an array
	 * @param rightEnd - last index of an array
	 */
	public static void merge(int arr[], int leftStart, int leftEnd, int rightStart, int rightEnd) {

		int[] temp = new int[arr.length];
		int i = leftStart;
		int j = rightStart;
		int k = 0;

		while (i <= leftEnd && j <= rightEnd) {
			if (arr[i] <= arr[j])
				temp[k++] = arr[i++];
			if (arr[i] >= arr[j])
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
	 * Main function that sorts arr[l..r] using
	 * 
	 * @param arr   - Input Array
	 * @param left  - Starting index of an array
	 * @param right - Ending index of an array
	 */
	public static void mergeSort(int arr[], int left, int right) {

		if (left < right) {
			int middle = (left + right) / 2;

			mergeSort(arr, left, middle);
			mergeSort(arr, middle + 1, right);
			merge(arr, left, middle, middle + 1, right);
		}

	}

	public static void main(String args[]) {
		int[] arr = utilclass.readIntegerArray();

		System.out.println("Given Array");
		utilclass.printArray(arr);

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		utilclass.printArray(arr);
	}
}
