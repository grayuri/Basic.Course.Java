package com.loiane.curso_java.aula_14_exercises;

import java.util.Scanner;
import java.lang.Math;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number, and I'll tell you if he's decimal or integer: ");
		double number = scan.nextDouble();
		double aux = number - Math.floor(number);
		
		if (aux > 0) { System.out.println("It's a decimal"); }
		else { System.out.println("It's a integer"); }
	}
}
