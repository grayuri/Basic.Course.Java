package com.loiane.curso_java.aula_13_exercises;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many Celsius have, in this moment, in Canada?");
		double celsiusDegrees = scan.nextDouble();
		
		double fahrenheitDegrees = ((celsiusDegrees * 9)/5)+ 32 ;
		
		System.out.println("So, in Canada we have " + fahrenheitDegrees + " Fahrenheit degrees.");
	}

}
