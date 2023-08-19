package com.loiane.curso_java.aula_17_exercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] matrix = new int[4][4];
		int highestNumber = Integer.MIN_VALUE;
		int highestNumberColumn = 0;
		int highestNumberRow = 0;
		int number = 0;
		
		for (int col = 0; col < matrix.length; col++) {
			for (int row = 0; row < matrix[col].length; row++) {
				System.out.println("Type the " + (col+1) + "o. number of the " + (row+1) + "o. row:");
				
				number = scan.nextInt();
				
				if (number > highestNumber) {
					highestNumber = number;
					highestNumberColumn = col;
					highestNumberRow = row;
				}
				
				matrix[col][row] = number;
			}
		}
		
		System.out.println("- The highest number in the matrix is: " + highestNumber);
		System.out.println("- The position of the highest number in the matrix is: [" + highestNumberColumn + "][" + highestNumberRow + "]");
	}

}
