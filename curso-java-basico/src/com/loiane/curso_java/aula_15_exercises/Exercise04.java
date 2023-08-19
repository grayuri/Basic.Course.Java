package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean finishProgram = false;
		
		do {
			System.out.println("How many people the first country have?");
			int firstCountryPeople = scan.nextInt();
			
			System.out.println("What's the anual growing rate of the first country?");
			double firstCountryRate = scan.nextDouble();
			
			System.out.println("How many people the second country have?");
			int secondCountryPeople = scan.nextInt();
			
			System.out.println("What's the anual growing rate of the second country?");
			double secondCountryRate = scan.nextDouble();
			
			String countryA = "";
			String countryB = "";
			double rate = 0;
			double ratePerYear = 0;
			int countOfYears = 0;
			
			if (firstCountryRate > secondCountryRate) {
				countryA = "first";
				countryB = "second";
				rate = secondCountryRate;
				ratePerYear = secondCountryRate;
				
				while(firstCountryRate >= rate) {					
					rate = rate + ratePerYear;
					countOfYears++;
				}
				
				System.out.println("Thinking about it, the " + countryB + " overtake the " + countryA + ", will be need " + countOfYears + " years.");	
			}
			
			else if (secondCountryRate > firstCountryRate) {
				countryA = "second";
				countryB = "first";
				rate = firstCountryRate;
				ratePerYear = firstCountryRate;
				
				while(secondCountryRate >= rate) {					
					rate = rate + ratePerYear;
					countOfYears++;
				}
				
				System.out.println("Thinking about it, the " + countryB + " overtake the " + countryA + ", will be need " + countOfYears + " years.");	
			}
			else if (secondCountryRate == firstCountryRate) {
				System.out.println("In this case, don't need to wait any year: they are equal!");	
			}
			
			System.out.println("Would you like to finish the program?");
			System.out.println("[Y]es");
			System.out.println("[N]o");
			boolean validWould = false;
			
			do {
				String would = scan.next();
				
				switch(would) {
				case "Y": finishProgram = true; validWould = true; break;
				case "y": finishProgram = true; validWould = true; break;
				case "N": finishProgram = false; validWould = true; break;
				case "n": finishProgram = false; validWould = true; break;
				default: System.out.println("You typed a invalid key. Try [Y] for yes or [N] for no in the next time."); validWould = false; break;
				}
				
			} while (!validWould);
			
		} while (!finishProgram);
		
		
	}

}
