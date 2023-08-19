package com.loiane.curso_java.aula_13_exercises;

import java.util.Scanner;
public class Exercise12 {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your height?");
		double height = scan.nextDouble();
		
		double idealWeight = (72.7 * height) - 58;
		
		System.out.println("According my calcs, the ideal weight for your height is: " + idealWeight + " KG.");
	}

}
