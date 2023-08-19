package com.loiane.curso_java.aula_34_exercises;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		boolean finishProgram = false;
		
		do {
			boolean stopCounting = false;
			boolean firstTime = true;
			
			while(!stopCounting) {				
				System.out.println("C A L C U L A T O R");
				System.out.println("-------------------");
				System.out.println("Value: " + calc.getTotal());
				System.out.println("-------------------");
				
				if (firstTime) { 
					System.out.println("Type a number: ");
					calc.setTotal(scan.nextDouble()); 
				}
				
				int operation = 0;
				System.out.println("What do you need?");
				System.out.println("[1] Sum");
				System.out.println("[2] Subtract");
				System.out.println("[3] Multiply");
				System.out.println("[4] Divide");
				System.out.println("[5] Square");
				System.out.println("[6] Square Root");
				System.out.println("[7] Factorial");
				operation = scan.nextInt();
				
				switch(operation) {
					case 1: 
						System.out.println("With wich number?");
						calc.setNumber(scan.nextDouble());
						calc.sum();
						break;
					case 2:
						System.out.println("With wich number?");
						calc.setNumber(scan.nextDouble());
						calc.subtract();
						break;
					case 3:
						System.out.println("With wich number?");
						calc.setNumber(scan.nextDouble());
						calc.multiply();
						break;
					case 4:
						System.out.println("With wich number?");
						calc.setNumber(scan.nextDouble());
						calc.divide();
						break;
					case 5:
						calc.getSquared();
						break;
					case 6: 
						calc.getSquareRoot();
						break;
					case 7:
						calc.getFactorial();
					default:
						System.out.println("Invalid key! Type a key similar of the listed options.");
						break;
				}
				
				System.out.println("..................................|");
				System.out.println("The result is: " + calc.getTotal());
				System.out.println("..................................|");
				
				int finalChoice = 0;
				System.out.println("What do you want?");
				System.out.println("[1] Continue");
				System.out.println("[2] Clear");
				System.out.println("[3] Finish");
				finalChoice = scan.nextInt();
				
				switch(finalChoice) {
				case 1: 
					stopCounting = false;
					firstTime = false;
					break;
				case 2:
					stopCounting = false;
					firstTime = true;
					calc.clear();
					break;
				case 3:
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
