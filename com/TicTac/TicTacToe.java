package com.TicTac;
import java.util.Scanner;
public  class TicTacToe {
//Creating board with empty spaces
	private  char[] createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		return board;
	}
	// Player to choose the letter
		private char choosePlayerLetter(Scanner userInput) {
			System.out.println("Choose your letter: ");
			char playerLetter = userInput.next().toUpperCase().charAt(0);
			return playerLetter;
		}
	

public static void main(String args[]) {
	TicTacToe b = new TicTacToe();
	char[] board = b.createBoard();
	Scanner userInput = new Scanner(System.in);
	char userLetter = b.choosePlayerLetter(userInput);
	char computerLetter;
	if (userLetter == 'X') {
		computerLetter = 'O';
	} else {
		computerLetter = 'X';
	}
	System.out.println("Computer letter is : " + computerLetter);
}}
