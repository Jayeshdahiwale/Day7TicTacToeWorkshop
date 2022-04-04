package com.bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
	static char COMPUTER_OPTION;
	static char PLAYER_OPTION;
	char [] board = new char[10];
	
	void initialize() {
		for(char box: board) {
			box = ' ';
		}
	}
	
	void inputOption() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the option X or O");
		String input = scan.next();
		if(input.equals("X")) {
			PLAYER_OPTION = input.charAt(0);
			COMPUTER_OPTION = "O".charAt(0);
		}
		else {
			PLAYER_OPTION = input.charAt(0);
			COMPUTER_OPTION = "X".charAt(0);
		}
		System.out.println("Player option : "+ PLAYER_OPTION +  "  Computer Option : " + COMPUTER_OPTION);
	}
	
	void showBoard() {
		char [][] gameBoard = {{' ','|',' ','|',' '},{'_','+','_','+','_'},{' ','|',' ','|',' '},{'_','+','_','+','_'},{' ','|',' ','|',' '}};
		for(char[] row: gameBoard) {
			for(char c: row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		TicTacToeGame game = new TicTacToeGame();
		game.initialize();
		game.inputOption();
		game.showBoard();
	}

}
