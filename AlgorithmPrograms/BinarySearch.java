package com.bridgelabs.AlgorithmPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static String[] ReadFile(String path) {
		// To read list of word seperated by comma from a file
		BufferedReader br = null;

		// To store the words
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

	public static boolean isWordPresent(String[] value, String word) {

		for (String s : value) {
			if (s.equals(word))
				return true;
		}
		return false;

	}

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the file path");
		String path = sc1.nextLine();

		// To read lis of words present in file
		String[] listOfWords = ReadFile(path);
		int l = 0;
		int r = listOfWords.length-1;
		Arrays.sort(listOfWords);
	   


		// to check whether a word is present in file or not
		System.out.println("Enter the word to be searched");
		String word = sc1.next();
		
		int index = binarySearch(listOfWords,l,r,word);
		if(index == -1)
			System.out.println("Word doesnot exits ");
		if(index > 0)
			System.out.println("Word present at index "+ index);
		
		sc1.close();
	}
}
