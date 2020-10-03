package com.briglelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	char[] boardArray = new char[10];
	String userInput = null;
	String computerInput = null;

	// Method to Create TicTacToe Board
	private void createBoard() {
		for (int i = 1; i < boardArray.length; i++) {
			boardArray[i] = ' ';
		}
	}

	// Method for Player Character(X/O)
	public String selectInputChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character X or O ");
		userInput = sc.next();
		if (userInput.equals("X") || userInput.equals("x")) {
			computerInput = "O";
		} else if (userInput.equals("O") || userInput.equals("o")) {
			computerInput = "X";
		}else {
			System.out.println("Incorrect Input");
		}

		return computerInput;
	}

	// Main Program
	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game !!");
		TicTacToe Player = new TicTacToe();
		Player.createBoard();
		String computerLetter = Player.selectInputChar();
	}
}

