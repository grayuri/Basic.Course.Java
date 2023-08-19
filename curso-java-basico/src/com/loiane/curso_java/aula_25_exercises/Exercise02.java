package com.loiane.curso_java.aula_25_exercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = scan.next();

		System.out.println("Your banking account is special?");
		boolean baType = scan.nextBoolean();
		
		Account ac = new Account();
		ac.user = name.toUpperCase();
		ac.type = baType;
		
		double bankingBalance = 0;
		String accountType = "";
		
		boolean finishProgram = false;
		do {
			System.out.println("Alright, " + name.toUpperCase() + ", what do you need?");
			System.out.println("[1] See my balance");
			System.out.println("[2] See the type of my banking account");
			System.out.println("[3] Realize a serve");
			System.out.println("[4] Deposit money");
			
			boolean validChoice = false;
			int choice = scan.nextInt();
			do {
				switch(choice) {
					case 1:
						bankingBalance = ac.getBalance();
						System.out.println("Your actual balance is $ " + bankingBalance);
						validChoice = true;
						break;
						
					case 2:
						accountType = ac.getType();
						System.out.println("Your actual account type is " + accountType);
						validChoice = true;
						break;
						
					case 3: 
						double serveMoney = 0;
						System.out.println("How many dollars do you want serve?");
						serveMoney = scan.nextDouble();
						ac.realizeServe(serveMoney);
						
						System.out.println("You just realized a serve of $ " + serveMoney);
						System.out.println("Your acctual balance is $ " + ac.getBalance());
						validChoice = true;
						break;
						
					case 4:
						double depositMoney = 0;
						System.out.println("How many dollars do you want deposit?");
						depositMoney = scan.nextDouble();
						ac.depositMoney(depositMoney);
						
						System.out.println("You just realized a deposit of $ " + depositMoney);
						System.out.println("Your acctual balance is $ " + ac.getBalance());
						validChoice = true;
						break;
						
					default:
						System.out.println("Invalid choice! try some number included in the list.");
						break;
				}
			} while(!validChoice);
			
			System.out.println("Do you want finish the program?");
			System.out.println("[Y]es");
			System.out.println("[N]o");
			
			String validFinishChoice = scan.next();
			switch(validFinishChoice) {
				case "Y":
					finishProgram = true;
					break;
					
				case "y":
					finishProgram = true;
					break;
					
				case "N":
					finishProgram = false;
					break;
					
				case "n":
					finishProgram = false;
					break;
					
				default:
					System.out.println("Invalid choice! try again.");
					break;
			}
		} while (!finishProgram);
	}
}
