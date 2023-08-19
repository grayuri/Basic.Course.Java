package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type five numbers to get the media");
		
		double number = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Type the " + i + "o. number: ");
			number += scan.nextDouble();
		}
		
		double media = number / 5;
		System.out.println("The media of the five number is " + media);
		
	}

}
