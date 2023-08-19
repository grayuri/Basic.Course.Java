package com.loiane.curso_java.aula_14_exercises;

import java.util.Scanner;
import java.lang.Math;

public class Exercise19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number to me see your values.");
		int number = scan.nextInt();
		
		int hundreds = Math.floorDiv(number, 100);
		int dozens = Math.floorDiv((number - 100*hundreds), 10);
		int units = number - ((100*hundreds) + (10*dozens));
		
		System.out.println("This number have: ");
		
		if (hundreds > 1) { System.out.println("- " + hundreds + " hundreds;"); }
		else { System.out.println("- " + hundreds + " hundred;"); };
		
		if (dozens > 1) { System.out.println("- " + dozens + " dozens;"); }
		else { System.out.println("- " + dozens + " dozen;"); };
		
		if (units > 1) { System.out.println("- " + units + " units;"); }
		else { System.out.println("- " + units + " unit;"); };
		
		
	}

}
