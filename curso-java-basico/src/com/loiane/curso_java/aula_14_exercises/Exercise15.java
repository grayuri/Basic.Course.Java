package com.loiane.curso_java.aula_14_exercises;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's the first side's measure of triangule?");
		double firstSide = scan.nextDouble();
		
		System.out.println("What's the second side's measure of triangule?");
		double secondSide = scan.nextDouble();
		
		System.out.println("What's the third side's measure of triangule?");
		double thirdSide = scan.nextDouble();
		
		String typeOfTriangule = "";
		
		if (firstSide == secondSide && secondSide == thirdSide) { typeOfTriangule = "Equilateral"; }
		else if (firstSide != secondSide && secondSide != thirdSide) { typeOfTriangule = "Scalene"; }
		else { typeOfTriangule = "Isosceles"; }
		
		System.out.println("According my analysis, the type of triangule is " + typeOfTriangule);
		
	}

}
