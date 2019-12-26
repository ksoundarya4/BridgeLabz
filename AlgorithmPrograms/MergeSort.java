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
	 * @param arr- Input Array to sort
	 * @param l    - stating index of an array
	 * @param m    - middle index of an array
	 * @param r    - last index of an array
	 */
	public static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	/**
	 * Main function that sorts arr[l..r] using
	 * 
	 * @param arr - Input Array
	 * @param l   - Starting index of an array
	 * @param r   - Ending index of an array
	 */
	public static void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	public static void main(String args[]) {
		int[] arr = utilclass.readIntegerArray();

		System.out.println("Given Array");
		utilclass.printArray(arr);

		sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		utilclass.printArray(arr);
	}
}
