package com.briglelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	public static final int HEADS = 1;
	char[] boardArray = new char[10];
	char userInput = '\0';
	int chance = 0;
	char computerInput = '\0';
	Scanner sc = new Scanner(System.in);
	int position = 0;
	char playAgain = '\0';
	static char replay ='\0';

	// Method to Create TicTacToe Board
	private void createBoard() {
		for (int i = 1; i < boardArray.length; i++) {
			boardArray[i] = ' ';
		}
	}

	// Method for Player Character(X/O)
	public char selectInputChar() {

		System.out.println("Enter character X or O ");
		userInput = sc.next().charAt(0);
		if (userInput == 'X' || userInput == 'x') {
			computerInput = 'O';
		} else if (userInput == 'O' || userInput == 'o') {
			computerInput = 'X';
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
		boardArray[location] = userInput;
		showBoard();
	}

	// Method for Computer's Turn
	public int computerTurn() {
		System.out.println("\nComputer's Turn");
		int turn = (int) (1 + (Math.floor(Math.random() * 9)));
		if (boardArray[turn] == ' ') {

			if (((boardArray[3] == boardArray[2] && boardArray[3] == computerInput)
					|| (boardArray[4] == boardArray[7] && boardArray[4] == computerInput)
					|| (boardArray[5] == boardArray[9] && boardArray[5] == computerInput)) && boardArray[1] == ' ') {
				position = 1;
			} else if (((boardArray[1] == boardArray[3] && boardArray[1] == computerInput)
					|| (boardArray[5] == boardArray[8] && boardArray[5] == computerInput)) && boardArray[2] == ' ') {
				position = 2;
			} else if (((boardArray[1] == boardArray[2] && boardArray[1] == computerInput)
					|| (boardArray[5] == boardArray[7] && boardArray[5] == computerInput)
					|| (boardArray[6] == boardArray[9] && boardArray[6] == computerInput)) && boardArray[3] == ' ') {
				position = 3;
			} else if (((boardArray[1] == boardArray[7] && boardArray[1] == computerInput)
					|| (boardArray[5] == boardArray[6] && boardArray[5] == computerInput)) && boardArray[4] == ' ') {
				position = 4;
			} else if (((boardArray[1] == boardArray[9] && boardArray[1] == computerInput)
					|| (boardArray[3] == boardArray[7] && boardArray[3] == computerInput)
					|| (boardArray[6] == boardArray[4] && boardArray[6] == computerInput)) && boardArray[5] == ' ') {
				position = 5;
			} else if (((boardArray[4] == boardArray[5] && boardArray[4] == computerInput)
					|| (boardArray[3] == boardArray[9] && boardArray[3] == computerInput)) && boardArray[6] == ' ') {
				position = 6;
			} else if (((boardArray[1] == boardArray[4] && boardArray[1] == computerInput)
					|| (boardArray[5] == boardArray[3] && boardArray[5] == computerInput)
					|| (boardArray[8] == boardArray[9] && boardArray[8] == computerInput)) && boardArray[7] == ' ') {
				position = 7;
			} else if (((boardArray[5] == boardArray[2] && boardArray[5] == computerInput)
					|| (boardArray[7] == boardArray[9] && boardArray[7] == computerInput)) && boardArray[8] == ' ') {
				position = 8;
			} else if (((boardArray[5] == boardArray[1] && boardArray[1] == computerInput)
					|| (boardArray[8] == boardArray[7] && boardArray[7] == computerInput)
					|| (boardArray[6] == boardArray[3] && boardArray[6] == computerInput)) && boardArray[9] == ' ') {
				position = 9;
			} else if (((boardArray[3] == boardArray[2] && boardArray[3] == userInput)
					|| (boardArray[4] == boardArray[7] && boardArray[4] == userInput)
					|| (boardArray[5] == boardArray[9] && boardArray[5] == userInput)) && boardArray[1] == ' ') {
				position = 1;
			} else if (((boardArray[1] == boardArray[3] && boardArray[1] == userInput)
					|| (boardArray[5] == boardArray[8] && boardArray[5] == userInput)) && boardArray[2] == ' ') {
				position = 2;
			} else if (((boardArray[1] == boardArray[2] && boardArray[1] == userInput)
					|| (boardArray[5] == boardArray[7] && boardArray[5] == userInput)
					|| (boardArray[6] == boardArray[9] && boardArray[6] == userInput)) && boardArray[3] == ' ') {
				position = 3;
			} else if (((boardArray[1] == boardArray[7] && boardArray[1] == userInput)
					|| (boardArray[5] == boardArray[6] && boardArray[5] == userInput)) && boardArray[4] == ' ') {
				position = 4;
			} else if (((boardArray[1] == boardArray[9] && boardArray[1] == userInput)
					|| (boardArray[3] == boardArray[7] && boardArray[3] == userInput)
					|| (boardArray[6] == boardArray[4] && boardArray[6] == userInput)) && boardArray[5] == ' ') {
				position = 5;
			} else if (((boardArray[4] == boardArray[5] && boardArray[4] == userInput)
					|| (boardArray[3] == boardArray[9] && boardArray[3] == userInput)) && boardArray[6] == ' ') {
				position = 6;
			} else if (((boardArray[1] == boardArray[4] && boardArray[1] == userInput)
					|| (boardArray[5] == boardArray[3] && boardArray[5] == userInput)
					|| (boardArray[8] == boardArray[9] && boardArray[8] == userInput)) && boardArray[7] == ' ') {
				position = 7;
			} else if (((boardArray[5] == boardArray[2] && boardArray[5] == userInput)
					|| (boardArray[7] == boardArray[9] && boardArray[7] == userInput)) && boardArray[8] == ' ') {
				position = 8;
			} else if (((boardArray[5] == boardArray[1] && boardArray[1] == userInput)
					|| (boardArray[8] == boardArray[7] && boardArray[7] == userInput)
					|| (boardArray[6] == boardArray[3] && boardArray[6] == userInput)) && boardArray[9] == ' ') {
				position = 9;
			} else if (boardArray[1] == ' ' && boardArray[2] != ' ' && boardArray[3] != ' ' && boardArray[4] != ' '
					&& boardArray[5] != ' ' && boardArray[6] != ' ' && boardArray[7] != ' ' && boardArray[8] != ' '
					&& boardArray[9] != ' ') {
				position = 1;
			} else if (boardArray[3] == ' ' && boardArray[1] != ' ' && boardArray[2] != ' ' && boardArray[4] != ' '
					&& boardArray[5] != ' ' && boardArray[6] != ' ' && boardArray[7] != ' ' && boardArray[8] != ' '
					&& boardArray[9] != ' ') {
				position = 3;
			} else if (boardArray[7] == ' ' && boardArray[1] != ' ' && boardArray[2] != ' ' && boardArray[3] != ' '
					&& boardArray[4] != ' ' && boardArray[5] != ' ' && boardArray[6] != ' ' && boardArray[8] != ' '
					&& boardArray[9] != ' ') {
				position = 7;
			} else if (boardArray[9] == ' ' && boardArray[1] != ' ' && boardArray[2] != ' ' && boardArray[3] != ' '
					&& boardArray[4] != ' ' && boardArray[5] != ' ' && boardArray[6] != ' ' && boardArray[7] != ' '
					&& boardArray[8] != ' ') {
				position = 9;
			} else if (boardArray[5] == ' ' && boardArray[1] != ' ' && boardArray[2] != ' ' && boardArray[3] != ' '
					&& boardArray[4] != ' ' && boardArray[6] != ' ' && boardArray[7] != ' ' && boardArray[8] != ' '
					&& boardArray[9] != ' ') {
				position = 5;
			} else if (boardArray[2] == ' ' && boardArray[1] != ' ' && boardArray[3] != ' ' && boardArray[4] != ' '
					&& boardArray[5] != ' ' && boardArray[6] != ' ' && boardArray[7] != ' ' && boardArray[8] != ' '
					&& boardArray[9] != ' ') {
				position = 2;
			} else if (boardArray[4] == ' ' && boardArray[1] != ' ' && boardArray[2] != ' ' && boardArray[3] != ' '
					&& boardArray[5] != ' ' && boardArray[6] != ' ' && boardArray[7] != ' ' && boardArray[8] != ' '
					&& boardArray[9] != ' ') {
				position = 4;
			} else if (boardArray[6] == ' ' && boardArray[1] != ' ' && boardArray[2] != ' ' && boardArray[3] != ' '
					&& boardArray[4] != ' ' && boardArray[5] != ' ' && boardArray[7] != ' ' && boardArray[8] != ' '
					&& boardArray[9] != ' ') {
				position = 6;
			} else if (boardArray[8] == ' ' && boardArray[1] != ' ' && boardArray[2] != ' ' && boardArray[3] != ' '
					&& boardArray[4] != ' ' && boardArray[5] != ' ' && boardArray[6] != ' ' && boardArray[7] != ' '
					&& boardArray[9] != ' ') {
				position = 8;
			}
			showBoard();
		}
		return position;
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

	// Another Game
	private char anotherGame() {
		System.out.println("Continue playing another game: Y or N");
		playAgain = sc.next().charAt(0);
		return playAgain;
	}

	// Check Winning and Tie
	private void winTie(int toss) {
		if ((boardArray[1] != ' ' && boardArray[1] == boardArray[2] && boardArray[2] == boardArray[3])
				|| (boardArray[4] != ' ' && boardArray[4] == boardArray[5] && boardArray[5] == boardArray[6])
				|| (boardArray[7] != ' ' && boardArray[7] == boardArray[8] && boardArray[8] == boardArray[9])
				|| (boardArray[1] != ' ' && boardArray[1] == boardArray[4] && boardArray[4] == boardArray[7])
				|| (boardArray[2] != ' ' && boardArray[2] == boardArray[5] && boardArray[5] == boardArray[8])
				|| (boardArray[3] != ' ' && boardArray[3] == boardArray[6] && boardArray[6] == boardArray[9])
				|| (boardArray[1] != ' ' && boardArray[1] == boardArray[5] && boardArray[5] == boardArray[9])
				|| (boardArray[3] != ' ' && boardArray[3] == boardArray[5] && boardArray[5] == boardArray[7])) {
			if (toss == HEADS) {
				System.out.println("The winner is player.");
			} else {
				System.out.println("The winner is computer.");
			}
			System.exit(0);
		} else {
			if (boardArray[1] != ' ' && boardArray[2] != ' ' && boardArray[3] != ' ' && boardArray[4] != ' '
					&& boardArray[5] != ' ' && boardArray[6] != ' ' && boardArray[7] != ' ' && boardArray[8] != ' '
					&& boardArray[9] != ' ') {
				System.out.println("The game is tie.");
				System.exit(0);
			} else {
				if (toss == HEADS) {
					toss--;
					checkLocationAndMove();
				} else {
					toss++;
					checkLocationAndMove();
				}
			}
		}
		showBoard();
	}

	// Main Program
	public static void main(String[] args) {
		System.out.println("Welcome to Tic-Tac-Toe Game !!");
		TicTacToe Player = new TicTacToe();
		do{
			Player.createBoard();
			char computerLetter = Player.selectInputChar();
			System.out.println("Computer choice is:" + computerLetter);
			Player.showBoard();
			int toss = (int) Math.floor(Math.random() * 2) % 2;
			if (toss == HEADS) {
				System.out.println("Your Turn");
				Player.checkLocationAndMove();
			} else {
				Player.computerTurn();
			}
			replay = Player.anotherGame();
		}while(replay=='Y'||replay=='y');
		}
	}
