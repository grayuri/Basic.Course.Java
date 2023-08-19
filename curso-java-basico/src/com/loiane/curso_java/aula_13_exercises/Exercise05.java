package com.loiane.curso_java.aula_13_exercises;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many meters this thing have?");
		double meters = scan.nextDouble();
		
		double centimeters = meters * 100;
		System.out.println("With my calcs, I get this result: " + centimeters + " cm.");
	}
}
