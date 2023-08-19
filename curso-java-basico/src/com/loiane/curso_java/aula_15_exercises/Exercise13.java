package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type the base number: ");
		double baseNumber = scan.nextDouble();
		
		System.out.println("Type the expoent number: ");
		double expoentNumber = scan.nextDouble();
		
		double result = baseNumber;
		
		for (double i = 1; i < expoentNumber; i++) {
			result *= baseNumber;
		}
		
		System.out.println("The potentiation of " + baseNumber + " is " + result);
	}

}
