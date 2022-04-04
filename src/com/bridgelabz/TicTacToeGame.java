package com.bridgelabz;

public class TicTacToeGame {
	
	char [] board = new char[10];
	
	void initialize() {
		for(char box: board) {
			box = ' ';
		}
	}
	
	public static void main(String[] args) {
		
		TicTacToeGame game = new TicTacToeGame();
		game.initialize();
	}

}
