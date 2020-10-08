package com.TicTac;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	/**
	 * Creating board with empty spaces
	 * 
	 * @return
	 */
	private char[] createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < 10; i++) {
			board[i] = ' ';
		}
		return board;
	}

	/**
	 * UC2_UserInput
	 * 
	 * @param userInput
	 * @return
	 */
	private char choosePlayerLetter(Scanner userInput) {
		System.out.println("Choose your letter: ");
		char playerLetter = userInput.next().toUpperCase().charAt(0);
		return playerLetter;
	}

	/**
	 * UC3 For Displaying the Board
	 * 
	 * @param board
	 */
	private static void showBoard(char[] board) {
		System.out.println("\n" + board[1] + "|" + board[2] + "|" + board[3]);
		System.out.println("______");
		System.out.println("\n" + board[4] + "|" + board[5] + "|" + board[6]);
		System.out.println("______");
		System.out.println("\n" + board[7] + "|" + board[8] + "|" + board[9]);
	}

	/**
	 * Choose a location UC4
	 * 
	 * @param board
	 * @param userLetter
	 * @return
	 */
	private static int moveLocation(char[] board, Scanner userLetter) {
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		while (true) {
			System.out.println("Enter any number between 1 to 9");
			int location = userLetter.nextInt();
			if (Arrays.asList(values).contains(location) && isSpaceFree(board, location)) {
				return location;
			}
		}

	}

	private static boolean isSpaceFree(char[] board, int location) {
		return board[location] == ' ';
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
		TicTacToe.showBoard(board);
		int choosenMove = moveLocation(board, userInput);
	}
}
