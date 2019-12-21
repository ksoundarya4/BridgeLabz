package com.bridgelabs.FunctionalProgram;

public class TestGame 
{
	public static void main(String[] args)
	{
		
		String Player = "1";
		TicTacToe game = new TicTacToe();
		game.InitializeBoard();
		game.printBoardStatus();

		do {
			
			if(Player.equals("1"))
				game.player1();
			else
	        	game.player2();
			
            if (game.isGameOver())
            {
				game.printBoardStatus();
				System.out.println("  Palyer "+Player+ " Wins");
				break;
			}

			if (Player == "1")
				Player = "2";
			else
				Player = "1";
		} while (true);

	}

}
