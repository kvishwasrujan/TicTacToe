package com.TicTac;
public class TicTacToe {
//Creating board with empty spaces
	private char[] createBoard() {
		char[] board= new char[10];
		for(int i=1;i<10;i++) {
			board[i]= ' ';
		}
		return board;
	}
}
public static void main(String args[]) {
	TicTacToe b = new TicTacToe();
	char[] board = b.createBoard();
}
