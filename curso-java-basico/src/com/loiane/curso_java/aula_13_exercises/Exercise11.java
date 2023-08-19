package com.loiane.curso_java.aula_13_exercises;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a integer number.");
		int firstInt = scan.nextInt();
		
		System.out.println("Type another integer number.");
		int secondInt = scan.nextInt();
		
		System.out.println("Type a real or decimal number.");
		double realNumber = scan.nextDouble();
		
		int DFHS = (firstInt * 2) / (secondInt / 2);
		double SumTriple = (firstInt * 3) + realNumber;
		double ThirdCubic = Math.pow(realNumber, 3);
		
		System.out.println("According with my calcs, I got the following numbers... ");
		System.out.println("Product of the double of first with half of the second: " + DFHS);
		System.out.println("The sum of triple of the first number with the third: " + SumTriple);
		System.out.println("Three to the cube: " + ThirdCubic);

	}

}
