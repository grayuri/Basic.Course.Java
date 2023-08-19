package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double price = 1.99;
		double total = 0;
		System.out.println("How many products he has?");
		int numberOfProducts = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			total += price;
			System.out.println("- " + i +  ": " + total);
		}
	}

}
