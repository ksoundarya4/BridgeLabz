/***********************
 * Functional Programs
 * purpose :A library for reading in 2D arrays of integers, 
 *          doubles, or booleans from standard input and
 *          printing them out to standard output.
 * @discription
 * @file Array2D.java
 * @author soundarya<ksoundarya4>
 * @version 1.0        
 * @since 12/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class Array2D<T> {

	/**
	 * To read the number of rows
	 * 
	 * @return{int} rows
	 */
	public static int getRows() {

		System.out.println("Enter number of rows");
		int rows = utilclass.InputInteger();
		return rows;
	}

	/**
	 * To read the number of columns
	 * 
	 * @return{int} columns
	 */
	public static int getColms() {

		System.out.println("Enter number of coloums");
		int colms = utilclass.InputInteger();
		return colms;
	}

	/**
	 * To read Integer 2D Array
	 * 
	 * @param{int}rows - number of rows Array has
	 * @param{int}colms - number of columns Array has
	 * @param{Integer}arr2D - Array to be read @return{Integer[][]} 2D Integer Array
	 */
	private static Integer[][] readInteger2dArray(int rows, int colms, Integer[][] arr2D) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.println("Enter " + i + "th row " + j + "th coloum values");
				arr2D[i][j] = utilclass.InputInteger();
			}
		}
		return arr2D;
	}

	/**
	 * To read Double 2D Array
	 * 
	 * @param{int}rows - number of rows Array has
	 * @param{int}colms - number of columns Array has
	 * @param{Double}arr2D - Array to be read @return{Double[][]} 2D Double Array
	 */
	public static Double[][] readDouble2dArray(int rows, int colms, Double[][] arr2D) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.println("Enter " + i + "th row " + j + "th coloum values");
				arr2D[i][j] = utilclass.InputDouble();
			}
		}
		return arr2D;
	}

	/**
	 * To read Boolean 2D Array
	 * 
	 * @param{int}rows - number of rows Array has
	 * @param{int}colms - number of columns Array has
	 * @param{Boolean}arr2D - Array to be read @return{Boolean[][]} 2D Boolean Array
	 */
	private static Boolean[][] readBoolean2dArray(int rows, int colms, Boolean[][] arr2D) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.println("Enter " + i + "th row " + j + "th coloum values");
				arr2D[i][j] = utilclass.InputBoolean();
			}
		}
		return arr2D;
	}

	/**
	 * Generic method to print 2D Array
	 * 
	 * @param{int}rows - number of rows Array has
	 * @param{int}colms - number of columns Array has
	 * @param{T}arr2D - Array to be print
	 */
	public static <T> void print2dArray(int rows, int colm, T[][] arr) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colm; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	/**
	 * To read and print Integer 2D Array
	 * 
	 * @param{int}rows - number of rows Array has
	 * @param{int}colms - number of columns Array has
	 */
	public static void integer2dArray(int rows, int colms) {

		Integer[][] arr2D = new Integer[rows][colms];

		arr2D = readInteger2dArray(rows, colms, arr2D);

		print2dArray(rows, colms, arr2D);
	}

	/**
	 * To read and print Double 2D Array
	 * 
	 * @param{int}rows - number of rows Array has
	 * @param{int}colms - number of columns Array has
	 */
	public static void double2DArray(int rows, int colms) {

		Double[][] arr2D = new Double[rows][colms];

		arr2D = readDouble2dArray(rows, colms, arr2D);

		print2dArray(rows, colms, arr2D);

	}

	/**
	 * To read and print Boolean 2D Array
	 * 
	 * @param{int}rows - number of rows Array has
	 * @param{int}colms - number of columns Array has
	 */
	public static void boolean2DArray(int rows, int colms) {

		Boolean[][] arr2D = new Boolean[rows][colms];

		arr2D = readBoolean2dArray(rows, colms, arr2D);

		print2dArray(rows, colms, arr2D);

	}

	/**
	 * To select which 2D array need to be executed
	 * 
	 * @param{String}s - input which 2Darray to be executed
	 *                 "IntegerArray","DoubleArray","BooleanArray"
	 * @param{int}rows - Number of rows a Array has.
	 * @param{int}colms -Number of columns a Array has.
	 */
	public static void SelectArray(String s, int rows, int colms) {

		if (s.equals("IntegerArray"))
			integer2dArray(rows, colms);

		if (s.equals("DoubleArray"))
			double2DArray(rows, colms);

		if (s.equals("BooleanArray"))
			boolean2DArray(rows, colms);
	}

	public static void main(String[] args) {

		System.out.println("Enter which array to to use");
		String s = utilclass.InputString();
		int rows = getRows();
		int colms = getColms();
		SelectArray(s, rows, colms);
	}
}
