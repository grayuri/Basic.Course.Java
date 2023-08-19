package com.loiane.curso_java.aula_17_exercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] table = new char[3][3];
		char player = 'X';
		int plays = 0;
		boolean finish = false;
		int column = 0;
		int row = 0;
		
		while(!finish) {
			//Swap Times
			if (plays % 2 == 0) {
				player = 'X';
				System.out.println("Player: " + player);
			}
			else {
				player = 'O';
				System.out.println("Player: " + player);
			}
			
			
			// Validation and Selection of Rows and Columns
			boolean validColumn = false;
			while (!validColumn) {
				System.out.println("Type the column for " + player + " : ");
				
				column = scan.nextInt();
				
				if (column>=1 && column<=3) {
					validColumn = true;
				}
				else {
					System.out.println("Invalid key! Try a number between [1] and [3].");
				}
				
			}
			column--;
			
			boolean validRow = false;
			while (!validRow) {
				System.out.println("Type the row for " + player + " : ");
				
				row = scan.nextInt();
				
				if (row>=1 && row<=3) {
					validRow = true;
				}
				else {
					System.out.println("Invalid key! Try a number between [1] and [3].");
				}
			}
			row--;
			
			
			// Table Selection
			if (table[column][row] == 'X' || table[column][row] == 'O') {
				System.out.println("Position already used! Try another time.");
			}
			else {
				table[column][row] = player;
				plays++;
			}
			
			
			// Print Table
			for (int i = 0; i < table.length; i++) {
				for (int j = 0; j < table[i].length; j++) {
					System.out.print(table[i][j] + " | ");
				}
				System.out.println();
			}
			
			
			// Winning or Tie
			if (table[0][0] == 'X' && table[1][0] == 'X' && table[2][0] == 'X' ||
				table[0][1] == 'X' && table[1][1] == 'X' && table[2][1] == 'X' ||
				table[0][2] == 'X' && table[1][2] == 'X' && table[2][2] == 'X' ||
				table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == 'X' ||
				table[2][0] == 'X' && table[1][1] == 'X' && table[0][2] == 'X') 
			{
				System.out.println("And the winner is: X");
				finish = true;
			}
			else if(table[0][0] == 'O' && table[1][0] == 'O' && table[2][0] == 'O' ||
					table[0][1] == 'O' && table[1][1] == 'O' && table[2][1] == 'O' ||
					table[0][2] == 'O' && table[1][2] == 'O' && table[2][2] == 'O' ||
					table[0][0] == 'O' && table[1][1] == 'O' && table[2][2] == 'O' ||
					table[2][0] == 'O' && table[1][1] == 'O' && table[0][2] == 'O') 
			{
				System.out.println("And the winner is: X");
				finish = true;
			} 
			else if(plays >= 9) {
				System.out.println("Seems like we have a tie. So... No one win!");
			}
			
		}
		
	}

}
