package com.loiane.curso_java.aula_35_exercises;

import java.util.Scanner;

public class Exercise01n02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean finishProgram = false;
		
		do {
			boolean stopCounting = false;
			boolean firstTime = true;
			
			while(!stopCounting) {
				double number = 0;
				System.out.println("C A L C K I E S");
				System.out.println("---------------");
				
				int method = 0;
				System.out.println("What do you need?");
				System.out.println("[1] Summation");
				System.out.println("[2] Fibonacci");
				method = scan.nextInt();
				
				switch(method) {
					case 1: 
						System.out.println("With wich number?");
						number = Calckies.summation(scan.nextDouble());
						break;
					case 2:
						System.out.println("With wich number?");
						number = Calckies.fibonacci(scan.nextDouble());
						break;
					default:
						System.out.println("Invalid key! Type a key similar of the listed options.");
						break;
				}
				
				System.out.println("..................................|");
				System.out.println("The result is: " + number);
				System.out.println("..................................|");
				
				int finalChoice = 0;
				System.out.println("What do you want?");
				System.out.println("[1] Continue");
				System.out.println("[2] Finish");
				finalChoice = scan.nextInt();
				
				switch(finalChoice) {
				case 1: 
					stopCounting = false;
					break;
				case 2:
					finishProgram = true;
					stopCounting = true;
					break;
				default:
					System.out.println("Invalid key! Type a key similar of the listed options.");
					break;
				}
			}
		} while (!finishProgram);
	}

}
