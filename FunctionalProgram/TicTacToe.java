package com.bridgelabs.FunctionalProgram;


public class TicTacToe {

	private String[][] board;
	private static final int ROWS = 3;
	private static final int COLMS = 3;
	private static final String NOOUTPUT = "   ";

	// to assign board with 3 rows and 3 coloums
	public TicTacToe() 
	{
		this.board = new String[ROWS][COLMS];
	}

	// to initialize board with no values
	public void InitializeBoard() 
	{
		printRowsAndColmns();
	}

	public void printRowsAndColmns() 
	{
		for (int row = 0; row < ROWS; row++) 
		{
			printColumns(row);
		}
	}

	public void printColumns(int row)
	{
		for (int colm = 0; colm < COLMS; colm++) 
		{
			board[row][colm] = NOOUTPUT;
		}
	}

	// to Print the board status
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
	
	
	// to check the board if there is any winner
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
	
	public boolean winByRows() 
	{
		for (int rows = 0; rows < ROWS; rows++) 
		{
			if (!board[rows][0].matches(NOOUTPUT) && board[rows][0].equals(board[rows][1]) && board[rows][1].equals(board[rows][2]))
				return true;
		}
		return false;
	}
	
	public boolean winByDiagonals()
	{
		if (!board[0][0].matches(NOOUTPUT) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
			return true;

		if (!board[2][0].matches(NOOUTPUT) && board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]))
			return true;
		
		return false;
	}
    
	public boolean winByColums()
	{
		for (int col = 0; col < COLMS; col++) 
		{
			if (!board[0][col].matches(NOOUTPUT) && board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col]))
				return true;
		}
		return false;
	}
	
	// to set player inputs to board
	public void setPlay(int rows, int colms, String input) 
		{
			if (this.board[rows][colms].matches(NOOUTPUT))
				this.board[rows][colms] = input;
		}
	
	public void player1()
	{
		System.out.println(" Player 1 ");
		int row = (int) (Math.random() * 10) % 3;
		int col = (int) (Math.random() * 10) % 3;
		String input = " O ";
		setPlay(row, col, input);
		printBoardStatus();
	}
	
	public void player2()
	{
		System.out.println(" Player 2");
		int rows = getRowsCoordinates();
	    int cols = getColmCoordinates();
        String input = " X ";
		setPlay(rows, cols, input);
		printBoardStatus();
	}

	public int getColmCoordinates() 
	{
		System.out.println("Enter coordinates for colms :");
		int col = utilclass.InputInteger();
		return col;
	}

	public int getRowsCoordinates() 
	{
		
		System.out.println("Enter coordinates for rows :");
		int row = utilclass.InputInteger();
		return row;
	}

	
}
