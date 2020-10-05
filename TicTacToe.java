package com.briglelabz.tictactoe;

import java.util.*;

public class TicTacToe {
	public static final int HEADS = 1;
	char[] boardArray = new char[10];
	String userInput = null;
	int chance =0;
	String computerInput = null;
	Scanner sc = new Scanner(System.in);

	// Method to Create TicTacToe Board
	private void createBoard() {
		for (int i = 1; i < boardArray.length; i++) {
			boardArray[i] = ' ';
		}
	}

	// Method for Player Character(X/O)
	public String selectInputChar() {

		System.out.println("Enter character X or O ");
		userInput = sc.next();
		if (userInput.equals("X") || userInput.equals("x")) {
			computerInput = "O";
		} else if (userInput.equals("O") || userInput.equals("o")) {
			computerInput = "X";
		} else {
			System.out.println("Incorrect Input");
		}

		return computerInput;
	}

	// Method to Check Location and move to that Position
	public void checkLocationAndMove() {
		System.out.println("\nPlease enter location to move: ");
		int location = sc.nextInt();
		if (location > 0 && location < 10) {
			if (boardArray[location] == ' ') {
				System.out.println("Position is free");
				makeMoveUser(location);
			}
		} else
			System.out.println("Please check the location");
	}

	// Function to Move to Specific Location
	public void makeMoveUser(int location) {
		System.out.println("Moving to Location: " + location);
		boardArray[location] = userInput.charAt(0);
		showBoard();
	}
	
	//Method for Computer's Turn
	public void computerTurn() {
		System.out.println("\nComputer's Turn");
		do{
			int play = (int) (1 + (Math.floor(Math.random() * 9)));
			if (boardArray[play] == ' ') {
				boardArray[play] = computerInput.charAt(0);
				chance = 1;
				showBoard();
			}
		}while(chance!=1);
	}

	// Show the Current TicTacToe Board Status
	public void showBoard() {
		int rowCount = 0;
		for (int i = 1; i < boardArray.length; i++) {
			if (rowCount == 3) {
				System.out.println();
				rowCount = 0;
			}
			System.out.print("_" + boardArray[i] + "|");
			rowCount++;
		}
	}

	// Main Program
	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game !!");
		TicTacToe Player = new TicTacToe();
		Player.createBoard();
		String computerLetter = Player.selectInputChar();
		System.out.println("Computer choice is:" + computerLetter);
		Player.showBoard();
		int toss = (int) Math.floor(Math.random() * 2) % 2;
		if (toss == HEADS) {
			System.out.println("Your Turn");
			Player.checkLocationAndMove();
		} else {
			Player.computerTurn();
		}
	}
}
