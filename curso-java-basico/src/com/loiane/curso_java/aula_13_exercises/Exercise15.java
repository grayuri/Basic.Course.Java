package com.loiane.curso_java.aula_13_exercises;

import java.util.Scanner;
import java.lang.Math;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How many hours you work for day?");
		double hoursOfWork = scan.nextDouble();
		
		System.out.println("How many cash you earn per hour?");
		double cashPerHour = scan.nextDouble();
		
		int daysOfWork = 26;
		
		double crudeSalary = daysOfWork * hoursOfWork * cashPerHour;
		
		System.out.println("Your crude salary per month is R$ " + crudeSalary + ". But we have, at this point, some things to concern:");
		
		double INSSDiscount = crudeSalary * 0.08;
		double incomeTaxDiscount = crudeSalary * 0.11;
		double sindicateDiscount = crudeSalary * 0.05;
		double liquidSalary = crudeSalary - (INSSDiscount + incomeTaxDiscount + sindicateDiscount);
		
		System.out.println("- The INSS discount: R$ " + INSSDiscount + ".");
		System.out.println("- The Income Tax discount: R$ " + incomeTaxDiscount + ".");
		System.out.println("- The Sindicate discount: R$ " + sindicateDiscount + ".");
		
		System.out.println("So your liquid salary per month is R$ " + liquidSalary + ".");
		
	}

}
