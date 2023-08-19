package com.loiane.curso_java.aula_13_exercises;

import java.lang.Math;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's the width of this square?");
		double squareWidth = scan.nextDouble();
		
		double squareArea = Math.pow(squareWidth, 2);
		
		double doubleSquareArea = squareArea * 2;
		
		System.out.println("So... the area of him is " + squareArea);
		System.out.println("And the double of his area is " + doubleSquareArea);
	}

}
