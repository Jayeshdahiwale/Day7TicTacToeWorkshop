package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	static char COMPUTER_OPTION;
	static char PLAYER_OPTION;
	char [] board = new char[10];
	static int turnCheck;
	
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
	
	private int checkFreeSpace(int input) {
		if(board[input] == ' ') {
			return 1;
		}
		return 0;
	}
	
	void toss() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Predict head or tail");
		String result = scan.nextLine();
		String prediction[] = {"head","tail"};
		int max = 1;
		int min = 0;
		int tossResult = (int)(Math.random() * ((max - min) + 1)) + min;
		if(result.equals(prediction[tossResult])) {
			System.out.println("It is "+ prediction[tossResult]);
			System.out.println("Player's Turn");
			turnCheck = 0;
		}
		else {
			System.out.println("It is "+ prediction[tossResult]);
			System.out.println("Computers's Turn");
			turnCheck = 1;
		}
	}
	void start() {
		Scanner scan = new Scanner(System.in);
		if(turnCheck == 0) {
			System.out.println("Players Turn");
			System.out.println("Enter the number from 1-9 :");
			int input = scan.nextInt();
			int result = checkFreeSpace(input);
			if(result == 0) {
				System.out.println("Space is not free. Fill another index");
				start();
			}
//			if()
			board[input] = PLAYER_OPTION;
			turnCheck = 1;
		}
		else {
			System.out.println("Computer's Turn ");
			int max = 9;
			int min = 1;
			int input = (int)(Math.random() * ((max - min) + 1)) + min;
			int result = checkFreeSpace(input);
			if(result == 0) {
				start();
			}
			board[input] = COMPUTER_OPTION;
			turnCheck = 0;
		}
	}
	
	public static void main(String[] args) {
		
		TicTacToeGame game = new TicTacToeGame();
		game.initialize();
		game.inputOption();
		game.showBoard();
		game.toss();
//		while(true) {
//			game.start();
//		}
//		
	}

}
