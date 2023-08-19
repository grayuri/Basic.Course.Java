package com.loiane.curso_java.aula_25_exercises;

import java.util.Scanner;

public class TicTacToe {
	char[][] table = new char[3][3];
	char player;
	int plays;
	int usedColumn;
	int usedRow;
	
	void swapTimes() {
		if (plays % 2 == 0) {
			player = 'X';
		}
		else {
			player = 'O';
		}
	}
	
	boolean validateChoice(int field, boolean cond) {
		Scanner scan = new Scanner(System.in);
		
		while (!cond) {
			System.out.println("Type the column for " + player + " : ");
			
			field = scan.nextInt();
			
			if (field>=1 && field<=3) {
				cond = true;
			}
			else {
				System.out.println("Invalid key! Try a number between [1] and [3].");
			}
			
		}
		
		return cond;
	}
	
	void validatePosition() {
		if (table[usedColumn][usedRow] == 'X' || table[usedColumn][usedRow] == 'O') {
			System.out.println("Position already used! Try another time.");
		}
		else {
			table[usedColumn][usedRow] = player;
			plays++;
		}
	}
	
}
