package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What number for the factorial function do you want?");
		double numberOne = scan.nextDouble();
		double factorial = 1;
		
		for (double i = numberOne; i >= 1; i--) {
			System.out.println(factorial);
			factorial = factorial * i;
		}
	}

}