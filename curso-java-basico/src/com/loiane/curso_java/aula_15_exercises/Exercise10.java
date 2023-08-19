package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type your first integer number: ");
		int firstNumber = scan.nextInt();
		
		
		System.out.println("Type your second integer number: ");
		int secondNumber = scan.nextInt();
		
		if (firstNumber < secondNumber) {
			System.out.print("The number between the first and second are: ");
			for (int i = 0; firstNumber < secondNumber - 1 ; i++) {
				++firstNumber;
				System.out.print(firstNumber + " ");
			}
		}
		else if (secondNumber < firstNumber) {
			System.out.print("The number between the first and second are: ");
			for (int i = 0; secondNumber < firstNumber - 1; i++) {
				++secondNumber;
				System.out.print(secondNumber + " ");
			}
		}
		else {
			System.out.println("Don't worry about that. They're equal!");
		}
		
	}

}
