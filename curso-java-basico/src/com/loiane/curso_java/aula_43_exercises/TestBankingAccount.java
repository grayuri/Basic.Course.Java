package com.loiane.curso_java.aula_43_exercises;

import java.util.Scanner;

public class TestBankingAccount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankingAccount ba = new BankingAccount();
		SavingsAccount sa = new SavingsAccount();
		
		System.out.println();
		System.out.println("What's your name?");
		ba.setName(scan.next());
		
		System.out.println();
		System.out.println("What's your account number?");
		ba.setAccountNumber(scan.nextInt());
		
		boolean finishProgram = false;
		boolean haveSavingsAccount = false;
		
		do {
			printDisplayBalance(ba.getBalance());
			System.out.println();
			System.out.println("Alright, " + ba.getName() + " what would you like to do?");
			System.out.println("[1] Serve");
			System.out.println("[2] Deposit");
			if (haveSavingsAccount == false) { System.out.println("[3] Create a Savings Account"); }
			boolean validProgramsChoice = false;
			int programsChoice = scan.nextInt();
			double value = 0;
		
			while (!validProgramsChoice) {				
				switch(programsChoice) {
					case 1:
						double initalBalance = ba.getBalance();
						askHowMany();
						if (haveSavingsAccount == true) {
							value = sa.getCalculatedNewBalance(scan.nextDouble()); 
							ba.withdraw(value);
						}
						else {
							ba.withdraw(scan.nextDouble());
						}
						
						System.out.println();
						if (initalBalance > ba.getBalance()) {							
							System.out.println("The transaction of your serve has been succeeded!");
						}
						else {
							System.out.println("The transaction of your serve hasn't released.");
						}
						printDisplayBalance(ba.getBalance());
						
						validProgramsChoice = true;
						break;
						
					case 2:
						askHowMany();
						ba.deposit(scan.nextDouble());
						
						System.out.println();
						System.out.println("The transaction of your deposit has been succeeded!");
						printDisplayBalance(ba.getBalance());
						
						validProgramsChoice = true;
						break;
						
					case 3:
						haveSavingsAccount = true;
						System.out.println();
						System.out.println("Alright, " + ba.getName() + ", now your account have good benefits.");
						validProgramsChoice = true;
						break;
					
					default: 
						System.out.println();
						System.out.println("Invalid choice! Type a valid number of the listed choices.");
						validProgramsChoice = false;
				}
			}
			
			
			System.out.println();
			System.out.println("Would you like to finish the program?");
			System.out.println("[1] Yes");
			System.out.println("[2] No");
			boolean validFinishChoice = false;
			int finishChoice = scan.nextInt();
		
			while (!validFinishChoice) {				
				switch(finishChoice) {
					case 1:
						finishProgram = true;
						validFinishChoice = true;
						break;
					case 2:
						finishProgram = false;
						validFinishChoice = true;
						break;
					default: 
						System.out.println();
						System.out.println("Invalid choice! Type a valid number of the listed choices.");
						validFinishChoice = false;
				}
			}
			
		} while(!finishProgram);
	}
	
	public static void printDisplayBalance(Double balance) {
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Your actual balance is: R$ " + balance);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("---------------------------------------------------");
	}
	
	public static void askHowMany() {
		System.out.println();
		System.out.println("How many is the value?");
	}
}
