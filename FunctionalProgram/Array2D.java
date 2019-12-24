
package com.bridgelabs.FunctionalProgram;
public class Array2D<T> {

	public static int getRows() {

		System.out.println("Enter number of rows");
		int rows = utilclass.InputInteger();
		return rows;
	}

	public static int getColms() {

		System.out.println("Enter number of coloums");
		int colms = utilclass.InputInteger();
		return colms;
	}

	private static Integer[][] readInteger2dArray(int rows, int colms, Integer[][] arr2D) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.println("Enter " + i + "th row " + j + "th coloum values");
				arr2D[i][j] = utilclass.InputInteger();
			}
		}
		return arr2D;
	}

	public static Double[][] readDouble2dArray(int rows, int colms, Double[][] arr2D) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.println("Enter " + i + "th row " + j + "th coloum values");
				arr2D[i][j] = utilclass.InputDouble();
			}
		}
		return arr2D;
	}

	private static Boolean[][] readBoolean2dArray(int rows, int colms, Boolean[][] arr2D) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.println("Enter " + i + "th row " + j + "th coloum values");
				arr2D[i][j] = utilclass.InputBoolean();
			}
		}
		return arr2D;
	}

	public static <T> void print2dArray(int rows, int colm, T[][] arr) {

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colm; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

	public static void integer2dArray(int rows, int colms) {

		Integer[][] arr2D = new Integer[rows][colms];

		arr2D = readInteger2dArray(rows, colms, arr2D);

		print2dArray(rows, colms, arr2D);
	}

	public static void double2DArray(int rows, int colms) {

		Double[][] arr2D = new Double[rows][colms];

		arr2D = readDouble2dArray(rows, colms, arr2D);

		print2dArray(rows, colms, arr2D);

	}

	public static void boolean2DArray(int rows, int colms) {

		Boolean[][] arr2D = new Boolean[rows][colms];

		arr2D = readBoolean2dArray(rows, colms, arr2D);

		print2dArray(rows, colms, arr2D);

	}

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
