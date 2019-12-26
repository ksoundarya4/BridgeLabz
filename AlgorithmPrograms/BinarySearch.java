package com.bridgelabs.AlgorithmPrograms;

import java.util.Arrays;

public class BinarySearch {

	
	public static void main(String[] args) {

		System.out.println("Enter the file path");
		String path = utilclass.InputString();

		// To read lis of words present in file
		String[] listOfWords = utilclass.readFile(path);
		int l = 0;
		int r = listOfWords.length - 1;
		Arrays.sort(listOfWords);

		// to check whether a word is present in file or not
		System.out.println("Enter the word to be searched");
		String word = utilclass.InputString();

		int index = utilclass.binarySearch(listOfWords, l, r, word);
		if (index == -1)
			System.out.println("Word doesnot exits ");
		if (index > 0)
			System.out.println("Word present at index " + index);

	}
}
