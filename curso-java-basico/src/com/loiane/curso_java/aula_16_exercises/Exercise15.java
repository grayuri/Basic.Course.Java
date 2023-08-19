package com.loiane.curso_java.aula_16_exercises;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		double evenNumbers = 0;
		double oddNumbers = 0;
		
		for (int i = 0; i < A.length; i++) { 
			System.out.println("Type the " + (i+1) + "o. number of A: ");
			A[i] = scan.nextInt();
			
			if (A[i] % 2 == 0) { evenNumbers++; }
			else if (A[i] % 2 == 1) { oddNumbers++; }
		}
		
		double evenPercent = (evenNumbers / A.length) * 100;
		double oddPercent = (oddNumbers / A.length) * 100;
		
		System.out.println("There are " + evenNumbers + " even numbers in A. This is, " + evenPercent + "% of array");
		System.out.println("There are " + oddNumbers + " odd numbers in A. This is, " + oddPercent + "% of array");
	}
}
