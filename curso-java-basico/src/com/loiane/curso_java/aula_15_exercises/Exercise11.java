package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type your first integer number: ");
		int firstNumber = scan.nextInt();
		
		int sum = 0;
		System.out.println("Type your second integer number: ");
		int secondNumber = scan.nextInt();
		
		if (firstNumber < secondNumber) {
			System.out.print("The number between the first and second are: ");
			for (int i = 0; firstNumber < secondNumber - 1 ; i++) {
				++firstNumber;
				sum += firstNumber;
				System.out.print(firstNumber + " ");
			}
			System.out.println("");
			System.out.println("And the sum between the first and second are: " + sum);
		}
		else if (secondNumber < firstNumber) {
			System.out.print("The number between the first and second are: ");
			for (int i = 0; secondNumber < firstNumber - 1; i++) {
				++secondNumber;
				sum += secondNumber;
				System.out.print(secondNumber + " ");
			}
			System.out.println("");
			System.out.println("And the sum between the first and second are: " + sum);
		}
		else {
			System.out.println("Don't worry about that. They're equal!");
		}
	}

}
