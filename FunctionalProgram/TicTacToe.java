/*************************
 * Logical Program
 * purpose :Program to play a Cross Game or Tic-Tac-Toe
 *          Game. Player 1 is the Computer and the Player 2 is the user.
 *          Player 1 take Random Cell that is the Column and Row.
 *@discription
 *@file TicTacToe.java
 *@author soundarya<ksoundarya4>
 *@version 1.0           
 *@since 11/12/2019
 */

package com.bridgelabs.FunctionalProgram;
public class TicTacToe {

	private String[][] board;
	private static final int ROWS = 3;
	private static final int COLMS = 3;
	private static final String NOOUTPUT = "   ";

	
	public TicTacToe() 
	{
		this.board = new String[ROWS][COLMS];
	}

	/**
	 * To initialize Empty board
	 */
	public void InitializeBoard() 
	{
		printRowsAndColmns();
	}
    /**
     * To initialize empty rows and colums of board
     */
	public void printRowsAndColmns() 
	{
		for (int row = 0; row < ROWS; row++) 
		{
			printColumns(row);
		}
	}
    /**
     * To initialize empty coloums
     * @param{int}row - to initialize empty board
     */
	public void printColumns(int row)
	{
		for (int colm = 0; colm < COLMS; colm++) 
		{
			board[row][colm] = NOOUTPUT;
		}
	}

	/**
	 * To print current Board Status
	 */
	public void printBoardStatus() 
	{
		String strBoard = "";
		for (int rows = 0; rows < ROWS; rows++) 
		{
		for (int col = 0; col < COLMS; col++)
		{
			if (col != COLMS - 1)
				strBoard = strBoard + board[rows][col] + "|";
			else
				strBoard = strBoard + board[rows][col];

		}
		if (rows != COLMS - 1)
			strBoard += "\n---+---+---\n";
		}
		System.out.println(strBoard);
	}
	
	
   /**
    * To check the game
    * @return true if game is over else returns false
    */
	public boolean isGameOver() 
	{
		if(winByRows())
			return true;
		
	
		if(winByColums())
			return true;

		if(winByDiagonals())
			return true;

		return false;

	}
	/**
	 * Checks if board has similar input in a row
	 * @return true if a row contains similar input
	 */
	public boolean winByRows() 
	{
		for (int rows = 0; rows < ROWS; rows++) 
		{
			if (!board[rows][0].matches(NOOUTPUT) && board[rows][0].equals(board[rows][1]) && board[rows][1].equals(board[rows][2]))
				return true;
		}
		return false;
	}
	/**
	 * Checks if board has similar input in diagonals elements
	 * @return true if a diagonal elements contains similar input
	 */
	public boolean winByDiagonals()
	{
		if (!board[0][0].matches(NOOUTPUT) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
			return true;

		if (!board[2][0].matches(NOOUTPUT) && board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]))
			return true;
		
		return false;
	}
	/**
	 * Checks if board has similar input in a column
	 * @return true if a column contains similar input
	 */
	public boolean winByColums()
	{
		for (int col = 0; col < COLMS; col++) 
		{
			if (!board[0][col].matches(NOOUTPUT) && board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col]))
				return true;
		}
		return false;
	}
	
	/**
	 * set the board if the block is empty
	 * @param{int}rows - to determine a row in a board
	 * @param{int}colms - to determine a colum in a board
	 * @param{String}input - to input into corresponding cell if the cell is empty
	 */
	public void setPlay(int rows, int colms, String input) 
		{
			if (this.board[rows][colms].matches(NOOUTPUT))
				this.board[rows][colms] = input;
		}
	
	/**
	 * Function to set player1
	 * takes random cell that is row and col
	 * Mark 'O' if that cell is empty
	 */
	public void player1()
	{
		System.out.println(" Player 1 ");
		int row = (int) (Math.random() * 10) % 3;
		int col = (int) (Math.random() * 10) % 3;
		String input = " O ";
		setPlay(row, col, input);
		printBoardStatus();
	}
	/**
	 * Function to set Player2
	 * takes user inputs for cell i.e. rows and colms
	 * Mark 'X' if that cell is empty 
	 */
	public void player2()
	{
		System.out.println(" Player 2");
		int rows = getRowsCoordinates();
	    int cols = getColmCoordinates();
        String input = " X ";
		setPlay(rows, cols, input);
		printBoardStatus();
	}
	/**
	 * function to take column coordinate for cell
	 * @return the column number
	 */
   public int getColmCoordinates() 
	{
		System.out.println("Enter coordinates for colms :");
		int col = utilclass.InputInteger();
		return col;
	}
   /**
    * function to take row coordinate for cell
    * @return the row number
    */
	public int getRowsCoordinates() 
	{
		
		System.out.println("Enter coordinates for rows :");
		int row = utilclass.InputInteger();
		return row;
	}
}
