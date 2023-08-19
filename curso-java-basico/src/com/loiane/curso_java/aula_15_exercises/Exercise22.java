package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number, and I will tell if he is a prime number: ");
		double number = scan.nextDouble();
		boolean isPrimeNumber = true;
		double divisibleNumbers = 0;
		String dNumbers = "";
		
		for (double i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrimeNumber = false;
				divisibleNumbers = i;
				dNumbers += divisibleNumbers + ", ";
			}
		}
		
		if (isPrimeNumber) {
			System.out.println("Yes, It's!");
		}
		else {
			System.out.println("No, It isn't!");
			System.out.println("The numbers that him are divisible are: " + dNumbers);
		}
	}

}
