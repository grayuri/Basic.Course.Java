package com.loiane.curso_java.aula_17_exercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matrix = new int[4][4];
		int highestNumberColumn2 = Integer.MIN_VALUE;
		int highestNumberRow4 = Integer.MIN_VALUE;
		int lowestNumberColumn2 = Integer.MAX_VALUE;
		int lowestNumberRow4 = Integer.MAX_VALUE;
		int number = 0;
		
		for (int col = 0; col < matrix.length; col++) {
			for (int row = 0; row < matrix[col].length; row++) {
				System.out.println("Type the " + (col+1) + "o. number of the " + (row+1) + "o. row:");
				
				number = scan.nextInt();
				
				if (col == 1) {
					if (number > highestNumberColumn2) {
						highestNumberColumn2 = number;
					}
					
					if (number < lowestNumberColumn2) {
						lowestNumberColumn2 = number;
					}
				}
				
				if (row == 3) {
					if (number > highestNumberRow4) {
						highestNumberRow4 = number;
					}
					
					if (number < lowestNumberRow4) {
						lowestNumberRow4 = number;
					}
				}
				
				matrix[col][row] = number;
			}
		}
		
		System.out.println("2nd Column");
		System.out.println("- The highest number in the 2nd column: " + highestNumberColumn2);
		System.out.println("- The lowest number in the 2nd column: " + lowestNumberColumn2);
		System.out.println();
		System.out.println("4th Row");
		System.out.println("- The highest number in the 4th row: " + highestNumberRow4);
		System.out.println("- The lowest number in the 4th row: " + lowestNumberRow4);
	}

}
