package com.loiane.curso_java.aula_13_exercises;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many Fahrenheits have, in this moment, in Canada?");
		double fahrenheitDegrees = scan.nextDouble();
		
		double celsiusDegrees = (5 * (fahrenheitDegrees - 32) / 9);
		
		System.out.println("So, in Canada we have " + celsiusDegrees + " Celsius degrees.");
	}

}
