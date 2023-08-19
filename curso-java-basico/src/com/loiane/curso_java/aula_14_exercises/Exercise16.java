package com.loiane.curso_java.aula_14_exercises;

import java.util.Scanner;
import java.lang.Math;

public class Exercise16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Let's calculate the second degree's equation? Inform to me the variables of the equation.");
		
		System.out.println("Inform the first value: ");
		double a = scan.nextDouble();
		
		System.out.println("Inform the second value: ");
		double b = scan.nextDouble();
		
		System.out.println("Inform the third value: ");
		double c = scan.nextDouble();
		
		double delta = Math.sqrt((Math.pow(b, 2)) - 4 * a * c);
		double XI = (-b + delta) / (2 * a);
		double XII = (-b - delta) / (2 * a);
		
		if (a == 0) {
			System.out.println("The first value cannot be zero because It not be part of the second degree's equation. Goodbye!");
		}
		else {
			if (delta < 0) {
				System.out.println("Acording my calcs, your delta is negative. Try another time with other numbers, ok?");
			}
			else if (delta == 0) {
				System.out.println("Acording my calcs, your delta is equal to zero. So you have just one value, that is it: " + XI);
			}
			else {
				System.out.println("Very well! Here is it your values: ");
				System.out.println("- First value: " + XI);
				System.out.println("- Second value: " + XII);
			}
		}
	}

}
