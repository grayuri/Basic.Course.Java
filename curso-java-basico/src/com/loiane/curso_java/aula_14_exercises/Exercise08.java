package com.loiane.curso_java.aula_14_exercises;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's the price of the first product?");
		double firstProductPrice = scan.nextDouble();
		
		System.out.println("What's the price of the second product?");
		double secondProductPrice = scan.nextDouble();
		
		System.out.println("What's the price of the third product?");
		double thirdProductPrice = scan.nextDouble();
		
		if (firstProductPrice > secondProductPrice && secondProductPrice > thirdProductPrice) {
			if (secondProductPrice == thirdProductPrice) { 
				System.out.println("The second and third product have the same price. So do your choice."); 
			}
			else {
				System.out.println("The best(cheaper) product is the third product.");
			}
		}
		// ... lazy ;/
		
	}

}
