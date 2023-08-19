package com.loiane.curso_java.aula_14_exercises;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("What do you need?");
		System.out.println("[A] - Alcohol:  R$ 1,90");
		System.out.println("[G] - Gasoline: R$ 2,50");
		String typeOfFuel = scan.nextLine();
		double fuelPrice = 0;
		double firstDiscount = 0;
		double secondDiscount = 0;

		
		switch(typeOfFuel) {
		case "G":
			fuelPrice = 2.50;
			firstDiscount = 4; 
			secondDiscount = 6;
			break;
		case "g":
			fuelPrice = 2.50;
			firstDiscount = 4; 
			secondDiscount = 6;
			break;
		case "A":
			fuelPrice = 1.9;
			firstDiscount = 3; 
			secondDiscount = 5;
			break;
		case "a":
			fuelPrice = 1.9;
			firstDiscount = 3;
			secondDiscount = 5;
			break;
			
		default: System.out.println("We don't have this type of fuel.");
		};
		
		if (fuelPrice != 0) {
			System.out.println("How many leters you want, Sir?");
			
			double leters = scan.nextDouble();
			double discountPerLeter = 0;
			double originalPrice = leters * fuelPrice;
			double discountedPrice = 0;
			System.out.println("Alright...");
			
			if (leters > 20) {
				discountPerLeter = (secondDiscount / 100);
				discountedPrice = originalPrice - (leters*discountPerLeter);
				System.out.println("On the whole, the price is R$ " + discountedPrice);
				
			} 
			else {
				discountPerLeter = (firstDiscount / 100);
				discountedPrice = originalPrice - (leters*discountPerLeter);
				System.out.println("On the whole, the price is R$ " + discountedPrice);
				
			}
			
			
		}

	}

}
