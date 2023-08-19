package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;	

public class Exercise12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type any number to me multiply everything.");
		double result = 0;
		double number = scan.nextDouble();
		
		for (double i = 1; i <= 10; i++) {
			result = i * number;
			System.out.println(number + " x " + i + " = " + result);
		}
		
	}

}
