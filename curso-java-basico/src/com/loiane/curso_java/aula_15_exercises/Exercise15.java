package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many times do you want that fibonacci run?");
		int times = scan.nextInt();
		int firstNumber = 1;
		int secondNumber = 0;
		int fibonacci = 0;
		
		for (int i = 0; i <= times; i++) {
			
			fibonacci = secondNumber + firstNumber;
			secondNumber = firstNumber;
			firstNumber = fibonacci;
			System.out.println(fibonacci);
			
		}
	}

}
