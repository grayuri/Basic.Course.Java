package com.loiane.curso_java.aula_13_exercises;

import java.util.Scanner;
public class Exercise13 {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your gender?");
		System.out.println("[1] Male");
		System.out.println("[2] Female");
		
		int gender = scan.nextInt();
		
		
		System.out.println("What's your height?");
		double height = scan.nextDouble();
		
		double idealWeight = 0;
	
		switch(gender) {
		case 1: idealWeight = (72.7 * height) - 58; break;
		case 2: idealWeight = (62.1 * height) - 44.7; break;
		}
		
		System.out.println("According my calcs, the ideal weight for your height is: " + idealWeight + " KG.");
		
		System.out.println("Very cool, huh? But, what is your real weight at this time?");
		double weight = scan.nextDouble();
		
		if (weight > idealWeight) {
			double howMuchLose = weight - idealWeight;
			System.out.println("According my calcs, you are overweight. You need lose " + howMuchLose + " KG to have the ideal weight.");
		}
		else if (weight < idealWeight) {
			double howMuchWon = idealWeight - weight;
			System.out.println("According my calcs, you are underweight. Your need won " + howMuchWon + " KG to have the ideal weight");
		}
		else {
			System.out.println("Congratulations! According my calcs, your are with a ideal weight. Keep it up!");
		}
		
	}

}