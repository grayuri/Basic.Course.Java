package com.loiane.curso_java.aula_15_exercises;

import java.util.Scanner;

public class Exercise38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What was the initial salary of this employee?");
		double initialSalary = scan.nextDouble();
		double initialPercent = 1.015; // 1.5%
		double percent = initialPercent;
		double salary = initialSalary;
		
		System.out.println("How many years he worked in this company?");
		int yearsWorked = scan.nextInt();
		
		for (int i = 1; i < yearsWorked; i++) {
			percent = 1 + ((percent - 1) * 2);
			salary *= percent;
		}
		
		System.out.println("So his final salary was $ " + salary);
		
	}

}
