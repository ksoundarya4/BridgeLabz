/****************
 * Algorithm Program
 * purpose :  Reads in integers prints them in sorted order using Bubble Sort
 * @discription
 * @file BubbleSort.java
 * @author soundarya<ksoundarya4>
 */
package com.bridgelabs.AlgorithmPrograms;
public class BubbleSort {

	/**
	 * To sort given Array using Bubble sort.
	 * 
	 * @param arr - Integer Array that need to be sorted.
	 * @return sorted Integer Array
	 */
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		return arr;
	}

	public static void main(String[] args) {

		int[] a = utilclass.readIntegerArray();
		a = bubbleSort(a);
		utilclass.printArray(a);
	}

}
