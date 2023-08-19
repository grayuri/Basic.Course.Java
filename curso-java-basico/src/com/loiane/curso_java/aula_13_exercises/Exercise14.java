package com.loiane.curso_java.aula_13_exercises;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What's the weight of your fish?");
		
		double weight = scan.nextDouble();
		double tax = 0;
		
		if (weight > 50) {
			int idealWeight = 50;
			tax = (weight - idealWeight) * 4;
			System.out.println("Ops! The fish's weighter than 50 KG. How much I owe?");
			System.out.println("According my calcs, you need to pay R$ " + tax);
		}
		else {
			System.out.println("Hello again. The fish has " + weight + " KG. Did I owe anything?");
			System.out.println("Oh, don't worry about it! It's everything ok.");
		}
		
	}

}
