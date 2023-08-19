package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int pairNumbers = 0;
		int oddNumbers = 0;
		double number = 0;
		
		for (int i = 0; i <= 10; i++) {
			number = scan.nextDouble();
			if (number % 2 == 0) { pairNumbers++; }
			else { oddNumbers++; }
		}
		
		System.out.println("There are " + pairNumbers + " pair numbers and " + oddNumbers + " odd numbers");
		
	}

}
