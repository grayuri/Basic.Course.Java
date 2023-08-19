package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean finishProgram = false;		
		String decision = "";
		double Fi = 0;
		double N = 0;
		
		do {
			System.out.println("Type a number: ");
			Fi += scan.nextDouble();
			N++;
			
			System.out.println("Would you like to finish the program?");
			System.out.println("[Y]es");
			System.out.println("[N]o");
			
			decision = scan.next();
			
			switch (decision) {
			case "Y": finishProgram = true; break;
			case "y": finishProgram = true; break;
			case "N": finishProgram = false; break;
			case "n": finishProgram = false; break;
			default: System.out.println("Type a valid key!"); break;
			}
		} while (!finishProgram);
		
		double media = Fi / N;
		System.out.println("The media is " + media);
	}

}
