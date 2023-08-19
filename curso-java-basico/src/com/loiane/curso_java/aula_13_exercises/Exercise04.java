package com.loiane.curso_java.aula_13_exercises;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What was your first note?");
		double firstNote = scan.nextDouble();
		
		System.out.println("What was your second note?");
		double secondNote = scan.nextDouble();
		
		System.out.println("What was your third note?");
		double thirdNote = scan.nextDouble();
		
		System.out.println("What was your fourth note?");
		double fourthNote = scan.nextDouble();
		
		double media = (firstNote + secondNote + thirdNote + fourthNote) / 4;
		
		System.out.println("Your media is: " + media);
	}
}
