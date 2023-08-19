package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many times do you want that fibonacci run?");
		int counter = 0;
		int firstNumber = 1;
		int secondNumber = 0;
		int fibonacci = 0;
		
		while (fibonacci < 500) {
			fibonacci = secondNumber + firstNumber;
			secondNumber = firstNumber;
			firstNumber = fibonacci;
			System.out.println(fibonacci);
			counter++;
		}
	}

}
