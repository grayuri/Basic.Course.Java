package com.loiane.curso_java.aula_14_exercises;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.println("What's the salary of the colaborator?");
		double crudeSalary = scan.nextDouble();

		double increase = 1;
		
		if (crudeSalary <= 280) {
			increase = 1.2; // Increase of 20%
		}
		else if (crudeSalary > 280 && crudeSalary <= 700) {
			increase = 1.15; // Increase of 15%
		}
		else if (crudeSalary > 700 && crudeSalary <= 1500) {
			increase = 1.1; // Increase of 10%
		}
		else if (crudeSalary > 1500) {
			increase = 1.05; // Increase of 20%
		}
		
		double newSalary = crudeSalary * increase;
		double percentIncrease = (increase - 1) * 100;
		double increaseValue = newSalary - crudeSalary;
		
		System.out.println("The inforamations about him are: ");
		System.out.println("- Crude Salary: R$ " + crudeSalary );
		System.out.println("- Percent of Increase: " + percentIncrease + "%" );
		System.out.println("- Increase Value: R$ " + increaseValue );
		System.out.println("- New Salary: R$ " + newSalary );
		
	}

}
