package com.loiane.curso_java.aula_13_exercises;

import java.lang.Math;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's the radius of this circle?");
		double circleRadius = scan.nextDouble();
		
		double PI = 3.14;
		double circleArea = 2*PI*(Math.pow(circleRadius, 2));
		
		System.out.println("So... the area of him is " + circleArea);
	}

}
