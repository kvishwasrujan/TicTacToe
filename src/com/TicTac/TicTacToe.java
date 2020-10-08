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
