package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double number = 0;
		double higherNumber = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Type the "+ i +"o. number: ");
			number = scan.nextDouble();
			if (number > higherNumber) { higherNumber = number; }
		}
		
		System.out.println("The higher number typed was " + higherNumber);
	}

}
