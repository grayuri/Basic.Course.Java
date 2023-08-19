package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean openCashier = true;
		double sangria = 0;
		
		while (openCashier) {
			boolean nextProduct = true;
			double productPrice = 0;
			int counter = 0;
			double totalClient = 0;
			
			while (nextProduct) {
				System.out.println("What's the price of the product?");
				productPrice = scan.nextDouble();
				totalClient += productPrice;
				sangria += productPrice;
				counter++;
				
				System.out.println("There's another product comming?");
				System.out.println("[Y]es");
				System.out.println("[N]o");
				String anotherProduct = scan.next();
				
				switch(anotherProduct) {
				case "Y": nextProduct = true; break; 
				case "y": nextProduct = true; break; 
				case "N": nextProduct = false; break; 
				case "n": nextProduct = false; break; 
				default: System.out.println("Invalid key. Try to press [Y] or [N]"); break;
				}
			}
			System.out.println("This client take " + counter + " products, and buy $ " + totalClient);
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println("It's time to close the store?");
			System.out.println("[Y]es");
			System.out.println("[N]o");
			String timeToClose = scan.next();
			
			switch(timeToClose) {
			case "Y": openCashier = false; break; 
			case "y": openCashier = false; break; 
			case "N": openCashier = true; System.out.println("Alright then. Let's wait another client..."); break; 
			case "n": openCashier = true; System.out.println("Alright then. Let's wait another client..."); break; 
			default: System.out.println("Invalid key. Try to press [Y] or [N]"); break;
			}
		}
		System.out.println("The total appured today was $ " + sangria);
	}

}
